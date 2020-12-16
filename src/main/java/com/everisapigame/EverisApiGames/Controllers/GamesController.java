package com.everisapigame.EverisApiGames.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everisapigame.EverisApiGames.Services.GamesServicesI;

@RestController
@RequestMapping("/games")
public class GamesController {
	
	/** Servicio de gestion de videojuegos */
	@Autowired
	private GamesServicesI gamesService;
	
	@GetMapping
	public ResponseEntity<?> getAllGames(){
		return ResponseEntity.status(HttpStatus.OK).body(gamesService.getAllGames());
		
	}
	
	


}
