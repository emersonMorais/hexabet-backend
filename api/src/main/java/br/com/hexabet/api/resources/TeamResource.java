package br.com.hexabet.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hexabet.api.entities.Team;
import br.com.hexabet.api.services.TeamService;

@RestController
@RequestMapping(value = "/teams")
public class TeamResource {

  @Autowired
  private TeamService teamService;
  
  @GetMapping
  public ResponseEntity<List<Team>> findAll() {
    List<Team> list =  teamService.findAllTeams();
    return ResponseEntity.ok().body(list);
  }

}
