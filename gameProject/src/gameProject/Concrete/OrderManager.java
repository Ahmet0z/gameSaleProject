package gameProject.Concrete;

import gameProject.Abstract.OrderService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public class OrderManager implements OrderService {

	@Override
	public void sell(Game game, Player player) {
		System.out.println(game.getGameName() + " adlý oyun " + 
				player.getFirstName() + " adlý kullanýcýya " + 
				game.getPrice() + " fiyatýyla satýldý.");
		
	}

	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		System.out.println(game.getGameName() + " adlý oyun " + 
				campaign.getCampaignName() + " kampanyasýyla "+ 
				player.getFirstName() +" adlý kullanýcýya " +
				game.getPriceAfterDiscount() + " fiyatýyla satýldý.");
		
	}

}
