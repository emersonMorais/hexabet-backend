package br.com.hexabet.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexabet.api.dto.TeamDTO;
import br.com.hexabet.api.entities.Team;
import br.com.hexabet.api.repositories.TeamRepository;

@Service
public class TeamService {
  @Autowired
  private TeamRepository teamRepository;

  @Transactional
  public List<TeamDTO> findAllTeams() {
    List<Team> listOfTeams = teamRepository.findAll();

    return listOfTeams.stream().map(team -> new TeamDTO(team)).collect(Collectors.toList());
  }

  @Transactional
  public TeamDTO findTeamById(Long id) {
    Optional<Team> teamOptional = teamRepository.findById(id);
    Team team = teamOptional.get();
    return new TeamDTO(team);
  }

  @Transactional
  public TeamDTO insertNewTeam(TeamDTO teamDTO) {
    Team team = new Team();
    
    team.setcountryName(teamDTO.getCountryName());
    team.setGroupTeam(teamDTO.getGroupTeam());
    team = teamRepository.save(team);
    
    return new TeamDTO(team);
  }

}
