package com.allumettes.fr.controller;

import com.allumettes.fr.view.View;
import com.allumettes.fr.model.Model;
import com.allumettes.fr.model.players.Player;

public class Controller {

	private View view;
	private Model model;
	private int matchesNumber;

	public Controller(View view) {

		this.view = view;
		this.view.setController(this);
		this.matchesNumber = 0;
	}

	public void start() {

		this.view.loadInitView();
		this.view.setVisible(true);
	}

	public void clickBtStart(int matchesNumber) {

		Player player1 = new Player("IA");
		Player player2 = new Player("Toi");
		this.model = new Model(player1,player2,matchesNumber);

		this.view.loadTableGameView();
	}

	public void takeMatch(int numberToTake) {

		// L'humain.
		this.model.takeMatches(numberToTake);
		this.model.getPlayer2().setEarnings(numberToTake);

		// L'intelligence artificielle.
		numberToTake = this.model.getPlayer1().makeAChoice(this.matchesNumber);
		this.model.takeMatches(numberToTake);

		this.view.loadTableGameView();
	}

	public Model getModel() {

		return this.model;
	}

}