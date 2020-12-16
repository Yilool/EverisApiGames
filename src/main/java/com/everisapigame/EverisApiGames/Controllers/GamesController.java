package com.everisapigame.EverisApiGames.Controllers;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.everisapigame.EverisApiGames.Entities.Games;
import com.everisapigame.EverisApiGames.Services.GamesServicesI;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RestController
@RequestMapping(path = "/games")
public class GamesController {
	
	/** Servicio de gestion de videojuegos */
	@Autowired
	private GamesServicesI gamesService;
	
	/**  */
	@GetMapping(path = "")
	public ResponseEntity<?> getAllGames(){
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.getAllGames());
	}
	
	/**  */
	@DeleteMapping(path = "{id}")
	public ResponseEntity<?> deleteGamesById(@PathVariable Integer id){
		gamesService.removeGamesByIdGames(id);
		return ResponseEntity.status(HttpStatus.OK).body("Game removed!!!");
	}
	
	/**  */
	@GetMapping(path = "{id}")
	public ResponseEntity<?> getGamesById(@PathVariable Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.getGamesById(id));
	}
	
	@PostMapping(path = "")
	public ResponseEntity<?> postGame(@RequestBody Games game) {
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.addGames(game));
	}
	
	
	
	


}
