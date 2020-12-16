package com.everisapigame.EverisApiGames.Services;

//Import de Java
import java.util.List;
//Import del proyecto
import com.everisapigame.EverisApiGames.Entities.Games;

public interface GamesServicesI {

	/**
	 * saca todos los juegos
	 * 
	 * @return List<Games>
	 */
	public List<Games> getAllGames();

	/**
	 * saca los juegos por el id
	 * 
	 * @param id
	 * @return List<Games>
	 */
	public List<Games> getGamesByIdGames(final int idGames);

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
	public void addGames(final Games game);
}
