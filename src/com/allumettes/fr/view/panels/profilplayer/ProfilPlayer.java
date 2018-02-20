package com.allumettes.fr.view.panels.profilplayer;

import javax.swing.*;

import com.allumettes.fr.model.players.Player;

import java.awt.*;

/**
 * Classe qui affiche les informations du joueur dans la vue.
 * @author ALPHANOR Pierre Rodney.
 */
public class ProfilPlayer extends JPanel {

	private JLabel lbName;

	/**
	 * Constructeur de la classe.
	 * @param player Le joueur.
	 */
	public ProfilPlayer(Player player) {

		super();
		this.setLayout(null);
		
		this.lbName = new JLabel(player.getName());
this.lbName.setBounds(10, 0, 100, 40);
		this.add(this.lbName);
		this.setBackground(Color.RED);

	}
}