package com.allumettes.fr.model;

import com.allumettes.fr.model.players.Player;

public class Model {

	private Player player1;
	private Player player2;
	private int numberOfMatches;

	public Model(Player player1, Player player2, int numberOfMatches) {

		this.player1 = player1;
		this.player2 = player2;
		this.numberOfMatches = numberOfMatches;
	}

	public void setPlayer1(Player player1) {

		this.player1 = player1;
	}

	public Player getPlayer1() {

		return this.player1;
	}

	public void setPlayer2(Player player2) {

		this.player2 = player2;
	}

	public Player getPlayer2() {

		return this.player2;
	}

	public void setNumberOfMatches(int numberOfMatches) {

		this.numberOfMatches = numberOfMatches;
	}

	public int getNumberOfMatches() {

		return this.numberOfMatches;
	}

	public void takeMatches(int numberToTake) {
	
		this.numberOfMatches -= numberToTake;
	}

}