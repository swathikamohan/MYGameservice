package com.gameservice.service;

import java.util.List;

import com.gameservice.Exception.GameAlreadyExistsException;
import com.gameservice.Exception.ValueNotFoundException;
import com.gameservice.entity.Game;

public interface GameService {

	public List<Game> getAllGames();

	public Game getGameById(Integer gameId) throws ValueNotFoundException;

	public Game addGame(Game game) throws GameAlreadyExistsException;

	public Game updateGame(Game game) throws GameAlreadyExistsException;

	public void deleteGameById(Integer gameId) throws ValueNotFoundException;


}
