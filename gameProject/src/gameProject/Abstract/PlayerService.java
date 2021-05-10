package gameProject.Abstract;

import gameProject.Entities.Player;

public interface PlayerService {
	
	void add(Player player);
	void delete(Player player);
	void update(Player player);
}