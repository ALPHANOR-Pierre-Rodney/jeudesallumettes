package com.allumettes.fr.controller;

import com.allumettes.fr.view.View;

public class Controller {

	private View view;

	public Controller(View view) {

		this.view = view;
		this.view.setController(this);
	}

	public void start() {

		this.view.initView();
		this.view.setVisible(true);
	}

	public void clickBtStart(int matchesNumber) {

		System.out.println("klkl " + matchesNumber);
	}

}