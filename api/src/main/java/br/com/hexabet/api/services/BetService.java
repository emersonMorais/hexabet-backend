package br.com.hexabet.api.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import br.com.hexabet.api.dto.BetDTO;
import br.com.hexabet.api.entities.Bet;
import br.com.hexabet.api.repositories.BetRepository;

@Service
public class BetService {

  @Autowired
  private BetRepository betRepository;

  @Transactional
  public List<BetDTO> findAllBets() {
    List<Bet> listOfBets = betRepository.findAll();
    return listOfBets.stream().map(bet -> (new BetDTO(bet))).collect(Collectors.toList());
  }

  @Transactional
  public BetDTO findBetById(Long id) {
    Optional<Bet> betOptional = betRepository.findById(id);
    Bet bet = betOptional.get();
    return new BetDTO(bet);
  }

  @Transactional
  public BetDTO insertNewBet(BetDTO betDTO) {
    Bet bet = new Bet();
    bet.setCreatedAt(Instant.now());
    bet.setUpdatedAt(Instant.now());
    bet.setMatchId(betDTO.getMatchId());
    bet.setUserId(betDTO.getUserId());
    bet.setGuess(betDTO.getGuess());
    bet = betRepository.save(bet);
    return new BetDTO(bet);
  }

  @Transactional
  public BetDTO updateBet(Long id, BetDTO betDTO) {
    try {
      Bet bet = betRepository.getReferenceById(id);
      bet.setGuess(betDTO.getGuess());
      bet = betRepository.save(bet);
      return new BetDTO(bet);
    } catch (EntityNotFoundException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  public void deleteBet(Long id) {
    try {
      betRepository.deleteById(id);
    } catch (EmptyResultDataAccessException err) {
      err.printStackTrace();
    }
  }

}
