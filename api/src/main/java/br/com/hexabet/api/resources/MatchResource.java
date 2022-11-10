package br.com.hexabet.api.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
  public ResponseEntity<List<MatchDTO>> findAll(){

    List<MatchDTO> listOfMatches = matchService.findAllMatches();
    return ResponseEntity.ok().body(listOfMatches);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<MatchDTO> findById(@PathVariable Long id) {
    MatchDTO matchDTO = matchService.findMatchById(id);
    return ResponseEntity.ok().body(matchDTO);
  }

  @PostMapping
  public ResponseEntity<MatchDTO> insert(@RequestBody MatchDTO matchDTO) {
    matchDTO = matchService.insertNewMatch(matchDTO);

    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(matchDTO.getId()).toUri();

    return ResponseEntity.created(location).body(matchDTO);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<MatchDTO> update(@PathVariable Long id, @RequestBody MatchDTO matchDTO) {
    matchDTO = matchService.updateMatch(id, matchDTO);
    return ResponseEntity.ok().body(matchDTO);
  }

}
