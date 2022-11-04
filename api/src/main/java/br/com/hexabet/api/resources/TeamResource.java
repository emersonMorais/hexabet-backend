package br.com.hexabet.api.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  public ResponseEntity<Page<TeamDTO>> findAll(
      @RequestParam(value = "page", defaultValue = "0") Integer page,
      @RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
      @RequestParam(value = "orderBy", defaultValue = "countryName") String orderBy,
      @RequestParam(value = "direction", defaultValue = "ASC") String direction) {

    PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

    Page<TeamDTO> listOfTeamsPaged = teamService.findAllTeamsPaged(pageRequest);

    return ResponseEntity.ok().body(listOfTeamsPaged);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<TeamDTO> findById(@PathVariable Long id) {
    TeamDTO teamDTO = teamService.findTeamById(id);
    return ResponseEntity.ok().body(teamDTO);
  }

  @PostMapping
  public ResponseEntity<TeamDTO> insert(@RequestBody TeamDTO teamDTO) {
    teamDTO = teamService.insertNewTeam(teamDTO);

    URI uri = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(teamDTO.getId()).toUri();

    return ResponseEntity.created(uri).body(teamDTO);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<TeamDTO> update(@PathVariable Long id, @RequestBody TeamDTO teamDTO) {
    teamDTO = teamService.updateTeam(id, teamDTO);
    return ResponseEntity.ok().body(teamDTO);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    teamService.deleteTeam(id);
    return ResponseEntity.noContent().build();
  }

}
