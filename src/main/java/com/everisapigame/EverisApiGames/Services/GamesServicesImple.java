package com.everisapigame.EverisApiGames.Services;

//import de Java
import java.util.List;
//Import de Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Import del proyecto
import com.everisapigame.EverisApiGames.Entities.Games;
import com.everisapigame.EverisApiGames.Repositories.GamesRepositoryI;

@Service
public class GamesServicesImple implements GamesServicesI {

	/** Repositorio: Games */
	@Autowired
	private GamesRepositoryI gamesRepository;

	@Override
	public List<Games> getAllGames() {
		return gamesRepository.findAll();
	}

	@Override
	public List<Games> getGamesByIdGames(int idGames) {
		return gamesRepository.findByIdGames(idGames);
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
