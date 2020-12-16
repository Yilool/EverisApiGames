package com.everisapigame.EverisApiGames.Repositories;

//Import del proyecto
import com.everisapigame.EverisApiGames.Entities.Games;
//Import de Spring
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepositoryI extends JpaRepository<Games, Integer> {
	/**
	 * Busca un juego por su id
	 * 
	 * @param id
	 * @return list<Games>
	 */
	public Games findGamesById(final int idGames);
}
