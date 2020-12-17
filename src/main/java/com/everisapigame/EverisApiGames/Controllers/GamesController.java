package com.everisapigame.EverisApiGames.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.everisapigame.EverisApiGames.Entities.Games;
import com.everisapigame.EverisApiGames.Services.GamesServicesI;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RestController
@RequestMapping(path = "/games")
public class GamesController {
	/** Servicio de gestion de videojuegos */
	@Autowired
	private GamesServicesI gamesService;

	/** Obtener todos los juegos */
	@GetMapping(path = "")
	public ResponseEntity<?> getAllGames(){
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.getAllGames());
	}

	/** Borrar juego por id */
	@DeleteMapping(path = "{id}")
	public ResponseEntity<?> deleteGamesById(@PathVariable Integer id){
		gamesService.removeGamesByIdGames(id);
		return ResponseEntity.status(HttpStatus.OK).body("Game removed!!!");
	}

	/** Obtener juego por id */
	@GetMapping(path = "{id}")
	public ResponseEntity<?> getGamesById(@PathVariable Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.getGamesById(id));
	}

	/** Crear juego */
	@PostMapping(path = "")
	public ResponseEntity<?> postGame(@RequestBody Games game, @RequestParam(name = "doc", required = false) MultipartFile img) {
		
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.addGames(game, img));
	}
}
