package com.everisapigame.EverisApiGames.Services;

//Import de Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Import del proyecto
import com.everisapigame.EverisApiGames.Entities.Games;
import com.everisapigame.EverisApiGames.Repositories.GamesRepositoryI;

@Service
public class GamesServicesImple implements GamesServicesI{

	/** Repositorio: Games */
	@Autowired
	private GamesRepositoryI gamesRepository;

	@Override
	public Iterable<Games> getAllGames() {
		return gamesRepository.findAll();
	}

	@Override
	public Games getGamesById(int idGames) {
		return gamesRepository.findGamesById(idGames);
	}

	@Override
	public void removeGamesByIdGames(int idGames) {
		gamesRepository.deleteById(idGames);

	}

	@Override
	public void addGames(Games game) {
		gamesRepository.save(game);

	}

}
