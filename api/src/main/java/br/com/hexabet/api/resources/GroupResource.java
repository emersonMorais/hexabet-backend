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

import br.com.hexabet.api.dto.GroupDTO;
import br.com.hexabet.api.services.GroupService;

@RestController
@RequestMapping(value = "/groups")
public class GroupResource {

  @Autowired
  private GroupService groupService;

  @GetMapping
  public ResponseEntity<Page<GroupDTO>> findAll(
      @RequestParam(value = "page", defaultValue = "0") Integer page,
      @RequestParam(value = "linesPerPage", defaultValue = "10") Integer linesPerPage,
      @RequestParam(value = "orderBy", defaultValue = "name") String orderBy,
      @RequestParam(value = "direction", defaultValue = "ASC") String direction) {

    PageRequest pageRequest = PageRequest.of(
        page, linesPerPage,
        Direction.valueOf(direction),
        orderBy);

    Page<GroupDTO> listOfGroupsPaged = groupService.findAllBetsPaged(pageRequest);
    return ResponseEntity.ok().body(listOfGroupsPaged);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<GroupDTO> findById(@PathVariable Long id) {
    GroupDTO groupDTO = groupService.findBetById(id);
    return ResponseEntity.ok().body(groupDTO);
  }

  @PostMapping
  public ResponseEntity<GroupDTO> insert(@RequestBody GroupDTO groupDTO) {
    groupDTO = groupService.insertNewBet(groupDTO);

    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(groupDTO.getId()).toUri();

    return ResponseEntity.created(location).body(groupDTO);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<GroupDTO> update(@PathVariable Long id, @RequestBody GroupDTO groupDTO) {
    groupDTO = groupService.updateGroup(id, groupDTO);
    return ResponseEntity.ok().body(groupDTO);
  }

}

