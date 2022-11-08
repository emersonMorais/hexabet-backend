package br.com.hexabet.api.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import br.com.hexabet.api.dto.BetDTO;
import br.com.hexabet.api.entities.Bet;
import br.com.hexabet.api.enums.BetStatusEnum;
import br.com.hexabet.api.repositories.BetRepository;

@Service
public class BetService {

  @Autowired
  private BetRepository betRepository;

  @Transactional
  public Page<BetDTO> findAllBetsPaged(PageRequest pageRequest) {
    Page<Bet> listOfBets = betRepository.findAll(pageRequest);
    return listOfBets.map(bet -> (new BetDTO(bet)));
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
    bet.setMatchId(betDTO.getMatchId());
    bet.setUserId(betDTO.getUserId());
    bet.setGuess(BetStatusEnum.ND);
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
