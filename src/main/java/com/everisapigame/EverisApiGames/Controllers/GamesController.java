package com.everisapigame.EverisApiGames.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.everisapigame.EverisApiGames.Entities.Games;
import com.everisapigame.EverisApiGames.Services.GamesServicesI;

@RestController
@RequestMapping("/games")
public class GamesController {
	
	/** Servicio de gestion de videojuegos */
	@Autowired
	private GamesServicesI gamesService;
	
	/**  */
	@GetMapping
	public ResponseEntity<?> getAllGames(){
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.getAllGames());
	}
	
	/**  */
	@DeleteMapping(path = "{id}")
	public ResponseEntity<?> deleteGamesById(@PathVariable Integer id){
		gamesService.removeGamesByIdGames(id);
		return ResponseEntity.status(HttpStatus.OK).body("El Juego ha sido eliminado.");
	}
	
	/**  */
	@GetMapping
	public ResponseEntity<?> getGamesById(@PathVariable Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.getGamesByIdGames(id));
	}
	
	@PutMapping
	public void deleteGame(@RequestBody Games game) {
		gamesService.addGames(game);
	}
	
	
	
	


}
