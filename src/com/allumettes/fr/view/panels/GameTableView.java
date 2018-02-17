package com.allumettes.fr.view.panels;

import com.allumettes.fr.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import com.allumettes.fr.model.Model;

public class GameTableView extends JPanel implements ActionListener {

	private JTextField tfMatchesNumber;
	private JLabel lbErrors;
	private Controller controller;

	public GameTableView(Controller controller) {
		
		super();
		this.setLayout(null);
		Model model = controller.getModel();

		JLabel regle = new JLabel(model.getPlayer1().getName() + " " + model.getNumberOfMatches());
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

		this.lbErrors = new JLabel("de");
		this.lbErrors.setBounds(15,70,400,20);
		lbErrors.setForeground (Color.red);
		this.add(this.lbErrors);

		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { 

		this.controller.takeMatch(2);
		this.lbErrors.setText("c" + controller.getModel().getNumberOfMatches());
		this.lbErrors.repaint();
	}

}