package com.allumettes.fr.view.panels;

import com.allumettes.fr.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InitView extends JPanel implements ActionListener {

	private JTextField tfMatchesNumber;
	private JLabel lbErrors;
	private Controller controller;

	public InitView(Controller controller) {
		
		super();
		this.setLayout(null);
		JLabel regle = new JLabel("Tu enlèves la dèrnière allumette tu perds !");
		regle.setBounds(120,0,550,20);
		this.add(regle);

		JLabel lbMatchesNumber = new JLabel("Nombre d'allumette (20 à 100) :");
		lbMatchesNumber.setBounds(15,50,250,20);
		this.add(lbMatchesNumber);

		this.tfMatchesNumber = new JTextField("20");
		this.tfMatchesNumber.setBounds(240,50,50,20);
		this.add(this.tfMatchesNumber);


		JButton btMatchesNumber = new JButton("Lancer la partie");
		btMatchesNumber.setBounds(15,100,150,40);
		btMatchesNumber.addActionListener(this);
		this.add(btMatchesNumber);

		this.lbErrors = new JLabel();
		this.lbErrors.setBounds(15,70,400,20);
		lbErrors.setForeground (Color.red);
		this.add(this.lbErrors);

		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { 

		int matchesNumber = 0;

		try {
		
			matchesNumber = Integer.parseInt(this.tfMatchesNumber.getText());

		} catch(NumberFormatException e) {

    		this.lbErrors.setText("Tu dois entrer un entier valide.");
    		return;
  		}

  		if(matchesNumber < 20 || matchesNumber > 100) {
  			
  			this.lbErrors.setText("Tu entrer entrer un entier compris entre 20 et 100.");
  			return;
  		}

		this.controller.clickBtStart(matchesNumber);
	}

}