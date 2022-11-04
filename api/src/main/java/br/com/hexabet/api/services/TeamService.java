package br.com.hexabet.api.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.hexabet.api.dto.TeamDTO;
import br.com.hexabet.api.entities.Team;
import br.com.hexabet.api.repositories.TeamRepository;

@Service
public class TeamService {
  @Autowired
  private TeamRepository teamRepository;

  @Transactional
  public Page<TeamDTO> findAllTeamsPaged(PageRequest pageRequest) {
    Page<Team> listOfTeams = teamRepository.findAll(pageRequest);
    return listOfTeams.map(team -> new TeamDTO(team));
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
