package gameProject.Entities;

import gameProject.Abstract.Entity;

public class User implements Entity {
	private String Id;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
}
