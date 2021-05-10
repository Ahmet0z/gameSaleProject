package gameProject.Abstract;

import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public interface OrderService {
	void sell(Game game, Player player);
	void sell(Game game, Player player, Campaign campaign);
}
