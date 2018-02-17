package com.allumettes.fr;

import com.allumettes.fr.view.View;
import com.allumettes.fr.controller.Controller;

class Main {

   	public static void main (String[] args){


    	/*Model model = new Model();
    	Vue vue = new Vue();
    	Controleur controleur = new Controleur(model,vue);

		controleur.lancer();*/
		View view = new View();
		Controller controller = new Controller(view);
		controller.start();
	}
}