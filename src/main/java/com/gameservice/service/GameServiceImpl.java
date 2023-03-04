package com.gameservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gameservice.Exception.GameAlreadyExistsException;
import com.gameservice.Exception.ValueNotFoundException;
import com.gameservice.dao.GameDAO;
import com.gameservice.entity.Game;

@Service
public class GameServiceImpl implements GameService{
	@Autowired
	private GameDAO gameDao;
	
	@Override
	public List<Game> getAllGames() {
		return gameDao.findAll();
	}

	@Override
	public Game getGameById(Integer gameId) throws ValueNotFoundException {
		Game g;
		if(gameDao.findById(gameId).isEmpty()) {
			throw new ValueNotFoundException();
			}
		else {
				g=gameDao.findById(gameId).get();
			}
		return g;
	}

	@Override
	public Game addGame(Game game) throws GameAlreadyExistsException {
		if(gameDao.findById(game.getGameId()).isEmpty())	{
			gameDao.save(game);
		return game;
	}
	else {
		throw new GameAlreadyExistsException();
	}
}

	@Override
	public Game updateGame(Game game) throws GameAlreadyExistsException {
		gameDao.save(game);
		return game;

	}

	@Override
	public void deleteGameById(Integer gameId) throws ValueNotFoundException {
		if(gameDao.findById(gameId).isEmpty()) {
			throw new ValueNotFoundException();
		}
		else {
		 gameDao.deleteAll();
		}
		
	}

}