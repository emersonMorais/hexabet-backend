package br.com.hexabet.api.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.hexabet.api.dto.MatchDTO;
import br.com.hexabet.api.services.MatchService;


@RestController
@RequestMapping(value = "/matches")
public class MatchResource {

  @Autowired
  private MatchService matchService;

  @GetMapping
  public ResponseEntity<Page<MatchDTO>> findAll(
      @RequestParam(value = "page", defaultValue = "0") Integer page,
      @RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
      @RequestParam(value = "orderBy", defaultValue = "date") String orderBy,
      @RequestParam(value = "direction", defaultValue = "ASC") String direction) {

    PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

    Page<MatchDTO> listOfMatchsPaged = matchService.findAllMatchsPaged(pageRequest);

    return ResponseEntity.ok().body(listOfMatchsPaged);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<MatchDTO> findById(@PathVariable Long id) {
    MatchDTO matchDTO = matchService.findMatchById(id);
    return ResponseEntity.ok().body(matchDTO);
  }

  @PostMapping
  public ResponseEntity<MatchDTO> insert(@RequestBody MatchDTO matchDTO) {
    matchDTO = matchService.insertNewMatch(matchDTO);

    URI uri = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(matchDTO.getId()).toUri();

    return ResponseEntity.created(uri).body(matchDTO);
  }

}
