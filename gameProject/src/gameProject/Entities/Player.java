package gameProject.Entities;

import java.time.LocalDate;

import gameProject.Abstract.Entity;

public class Player extends User implements Entity{
	private int playerId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Player(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		this.playerId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setId(int id) {
		this.playerId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
