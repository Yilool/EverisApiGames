package com.everisapigame.EverisApiGames.Services;

import org.springframework.web.multipart.MultipartFile;

//Import del proyecto
import com.everisapigame.EverisApiGames.Entities.Games;

public interface GamesServicesI {

	/**
	 * saca todos los juegos
	 * 
	 * @return Iterable<Games>
	 */
	public Iterable<Games> getAllGames();

	/**
	 * saca los juegos por el id
	 * 
	 * @param id
	 * @return Games
	 */
	public Games getGamesById(final int idGames);

	/**
	 * Elimina segun el id del juego
	 * 
	 * @param id
	 */
	public void removeGamesByIdGames(final int idGames);

	/**
	 * añade un juego
	 * 
	 * @param game
	 */
	public Games addGames(Games game,  MultipartFile img);
}
