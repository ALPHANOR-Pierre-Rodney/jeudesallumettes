package com.allumettes.fr.model.players;

public class Player {

	private String name;
	private int earnings;
	
	public Player(String name) {

		this.name = name;
		this.earnings = 0;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return this.name;
	}

	public void setEarnings(int earnings) {

		this.earnings = earnings;
	}

	public int getEarnings() {

		return this.earnings;
	}

	public int makeAChoice(int matchesNumber) {

		return 1;
	}

}