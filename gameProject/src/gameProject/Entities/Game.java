package gameProject.Entities;

import gameProject.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String gameName;
	private double price;
	private Campaign campaign;
	
	public Game() {
		
	}

	public Game(int id, String gameName, double price) {
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public double getPriceAfterDiscount() {
		return price - (price * campaign.getPercentageOfDiscount() / 100);
	}
	
	
	
}
