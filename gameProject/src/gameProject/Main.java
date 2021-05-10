package gameProject;

import java.time.LocalDate;

import gameProject.Adapters.MernisServiceAdapter;
import gameProject.Concrete.OrderManager;
import gameProject.Concrete.PlayerManager;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;


public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(1,"Forza Horizon 4",200);
		
		
		Campaign campaign = new Campaign(1,"Bahar",20);

		Player player1 = new Player(1,"Ahmet Emir","Özpolat",LocalDate.of(2000, 9, 6),"34234234234");
		PlayerManager manager = new PlayerManager(new MernisServiceAdapter());
		manager.add(player1);
		
		OrderManager orderManager = new OrderManager();
		orderManager.sell(game, player1);
		orderManager.sell(game, player1,campaign);
		
	}

}
