package com.allumettes.fr;

import com.allumettes.fr.view.View;
import com.allumettes.fr.controller.Controller;

class Main {

   	public static void main (String[] args){

		View view = new View();
		Controller controller = new Controller(view);
		controller.start();
	}
}