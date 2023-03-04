package com.gameservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import com.gameservice.dao.GameDAO;
import com.gameservice.entity.Game;

@SpringBootTest
class GameServiceApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
// 	@Autowired
// 	private GameDAO gameDao;

// 	@Test
// 	public void addGame() {
// 		new Game(1, "Car Racing", "Video Game", 250.90);
// 		assertNotNull(gameDao.findById(1).get());
// 	}
	
// 	 @Test
// 	    public void getGame(){
// 	        Game game = gameDao.findById(4).get();
// 	        Assertions.assertThat(game.getGameId()).isEqualTo(4);

// 	    }
	 
// 	 @Test
// 	    @Rollback(value = false)
// 	    public void updateGame(){
// 	        Game game = gameDao.findById(1).get();
// 	        game.setGameName("Car Racing");
// 	        Game gameUpdated =  gameDao.save(game);
// 	        Assertions.assertThat(gameUpdated.getGameName()).isEqualTo("Bike Racing");

// 	    }

// 	 @Test
// 	    @Rollback(value = false)
// 	    public void deleteGame(){
// 	        Game game = gameDao.findById(5).get();
// 	        gameDao.delete(game);
// 	        Game game1 = null;
// 	        Optional<Game> optionalGame = gameDao.findById(5);
// 	        if(optionalGame.isPresent()){
// 	            game1 = optionalGame.get();
// 	        }
// 	        Assertions.assertThat(game1).isNull();	    
// 	}
}
