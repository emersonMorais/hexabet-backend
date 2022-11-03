package br.com.hexabet.api.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.hexabet.api.dto.TeamDTO;
import br.com.hexabet.api.services.TeamService;

@RestController
@RequestMapping(value = "/teams")
public class TeamResource {

  @Autowired
  private TeamService teamService;

  @GetMapping
  public ResponseEntity<List<TeamDTO>> findAll() {
    List<TeamDTO> list = teamService.findAllTeams();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<TeamDTO> findById(@PathVariable Long id) {
    TeamDTO teamDTO = teamService.findTeamById(id);
    return ResponseEntity.ok().body(teamDTO);
  }

  @PostMapping
  public ResponseEntity<TeamDTO> insert(@RequestBody TeamDTO teamDTO){
    teamDTO = teamService.insertNewTeam(teamDTO);
    
    URI uri = ServletUriComponentsBuilder
      .fromCurrentRequest()
      .path("/{id}")
      .buildAndExpand(teamDTO.getId()).toUri();
    
    return ResponseEntity.created(uri).body(teamDTO);
  }

}
