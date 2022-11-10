package br.com.hexabet.api.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
  public ResponseEntity<List<BetDTO>> findAll(){

    List<BetDTO> listOfBets = betService.findAllBets();
    return ResponseEntity.ok().body(listOfBets);
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

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    betService.deleteBet(id);
    return ResponseEntity.noContent().build();
  }


}
