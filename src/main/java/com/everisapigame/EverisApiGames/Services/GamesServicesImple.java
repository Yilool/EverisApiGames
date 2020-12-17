package com.everisapigame.EverisApiGames.Services;

//Import de Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//Import del proyecto
import com.everisapigame.EverisApiGames.Entities.Games;
import com.everisapigame.EverisApiGames.Repositories.GamesRepositoryI;

@Service
public class GamesServicesImple implements GamesServicesI{

	/** Repositorio: Games */
	@Autowired
	private GamesRepositoryI gamesRepository;
	@Autowired
    private FileHandlerService fileHandlerService;

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
	public Games addGames(Games game, MultipartFile img) {		
		game.setPicture(fileHandlerService.createBlob(img));
		game.setFileName(img.getName());
		game.setFileSize(Integer.valueOf((int) img.getSize()));
		
		return gamesRepository.save(game);
	}

}
