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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.hexabet.api.dto.BetDTO;
import br.com.hexabet.api.services.BetService;

@RestController
@RequestMapping(value = "/bets")
public class BetResource {

  @Autowired
  private BetService betService;

  @GetMapping
  public ResponseEntity<Page<BetDTO>> findAll(
      @RequestParam(value = "page", defaultValue = "0") Integer page,
      @RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
      @RequestParam(value = "orderBy", defaultValue = "id") String orderBy,
      @RequestParam(value = "direction", defaultValue = "ASC") String direction) {

    PageRequest pageRequest = PageRequest.of(
        page, linesPerPage,
        Direction.valueOf(direction),
        orderBy);

    Page<BetDTO> listOfMatchsPaged = betService.findAllBetsPaged(pageRequest);
    return ResponseEntity.ok().body(listOfMatchsPaged);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<BetDTO> findById(@PathVariable Long id) {
    BetDTO betDTO = betService.findBetById(id);
    return ResponseEntity.ok().body(betDTO);
  }

  @PostMapping
  public ResponseEntity<BetDTO> insert(@RequestBody BetDTO betDTO) {
    betDTO = betService.insertNewBet(betDTO);

    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(betDTO.getId()).toUri();

    return ResponseEntity.created(location).body(betDTO);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<BetDTO> update(@PathVariable Long id, @RequestBody BetDTO betDTO) {
    betDTO = betService.updateBet(id, betDTO);
    return ResponseEntity.ok().body(betDTO);
  }

}
