package br.com.hexabet.api.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexabet.api.entities.Team;
import br.com.hexabet.api.repositories.TeamRepository;

@Service
public class TeamService {
  @Autowired
  private TeamRepository teamRepository; 


  @Transactional
  public List<Team> findAllTeams() {
    return teamRepository.findAll();
  }
}
