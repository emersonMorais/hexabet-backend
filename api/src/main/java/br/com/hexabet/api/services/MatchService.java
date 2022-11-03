package br.com.hexabet.api.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.hexabet.api.dto.MatchDTO;
import br.com.hexabet.api.entities.Match;
import br.com.hexabet.api.repositories.MatchRepository;

@Service
public class MatchService {
  @Autowired
  private MatchRepository matchRepository;

  @Transactional
  public Page<MatchDTO> findAllMatchsPaged(PageRequest pageRequest) {
    Page<Match> listOfTeams = matchRepository.findAll(pageRequest);
    return listOfTeams.map(match -> new MatchDTO(match));
  }

  @Transactional
  public MatchDTO findMatchById(Long id) {
    Optional<Match> matchOptional = matchRepository.findById(id);
    Match match = matchOptional.get();
    return new MatchDTO(match);
  }

  @Transactional
  public MatchDTO insertNewMatch(MatchDTO matchDTO) {
    Match match = new Match();

    match.setDate(matchDTO.getDate());
  
    match = matchRepository.save(match);
    
    return new MatchDTO(match);
  }

}
