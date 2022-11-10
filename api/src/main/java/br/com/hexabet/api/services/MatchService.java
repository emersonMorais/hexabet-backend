package br.com.hexabet.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hexabet.api.dto.MatchDTO;
import br.com.hexabet.api.entities.Match;
import br.com.hexabet.api.enums.BetStatusEnum;
import br.com.hexabet.api.repositories.MatchRepository;

@Service
public class MatchService {

  @Autowired
  private MatchRepository matchRepository;

  @Transactional
  public List<MatchDTO> findAllMatches() {
    List<Match> listOfTeams = matchRepository.findAll();
    return listOfTeams.stream().map(match -> new MatchDTO(match)).collect(Collectors.toList());
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
    match.setFirstTeam(matchDTO.getFirstTeam());
    match.setSecondTeam(matchDTO.getSecondTeam());
    match.setResult(BetStatusEnum.ND);
    match = matchRepository.save(match);

    return new MatchDTO(match);
  }

  @Transactional
  public MatchDTO updateMatch(Long id, MatchDTO matchDTO) {
    try {
      Match match = matchRepository.getReferenceById(id);
      match.setResult(matchDTO.getResult());
      match = matchRepository.save(match);
      return new MatchDTO(match);
    } catch (EntityNotFoundException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

}
