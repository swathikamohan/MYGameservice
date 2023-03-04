package com.gameservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gameservice.Exception.GameAlreadyExistsException;
import com.gameservice.Exception.ValueNotFoundException;
import com.gameservice.entity.Game;
import com.gameservice.service.GameService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GameController {

	@Autowired
	private GameService gameservice;

	@GetMapping("/game")
	public List<Game> getAllGames(){
		return this.gameservice.getAllGames();
	}
	
	@GetMapping("/game/{gameId}")
	public ResponseEntity<Game> getId(@PathVariable("gameId") Integer gameId) throws ValueNotFoundException {
		return new ResponseEntity<Game> (gameservice.getGameById(gameId), HttpStatus.OK);
	}
	
	@PostMapping("/game")
	public Game addGame(@RequestBody Game game) throws GameAlreadyExistsException {
		return this.gameservice.addGame(game);
	}

	@PutMapping("/game")
	public Game updateGame(@RequestBody Game game) throws GameAlreadyExistsException {
		return this.gameservice.updateGame(game);
	}
	
	@DeleteMapping("/game/{gameId}")
	public void deleteGame(@PathVariable("gameId") Integer gameId) throws ValueNotFoundException {
		this.gameservice.deleteGameById(gameId);

	}
}