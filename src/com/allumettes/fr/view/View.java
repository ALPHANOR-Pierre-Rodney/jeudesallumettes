package com.allumettes.fr.view;

import com.allumettes.fr.view.panels.InitView;
import com.allumettes.fr.view.panels.GameTableView;
import com.allumettes.fr.controller.Controller;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;

public class View extends JFrame {

	private InitView initView;
	private GameTableView gameTableView;
	private Controller controller;
	
	public View() {

		super();
		this.setLayout(null);
	}

	public void loadInitView() {

		this.initView = new InitView(this.controller);
		this.initView.setBounds(10, 10, 500, 160);
		this.add(this.initView);
		this.setPreferredSize(new Dimension(564, 248));
		this.pack();
	}

	public void loadTableGameView() {

		this.getContentPane().removeAll();
	
		if (this.gameTableView == null) {

			this.gameTableView = new GameTableView(this.controller);
		}
		
		this.gameTableView.setBounds(10, 10, 500, 160);
		this.add(this.gameTableView);
		this.setPreferredSize(new Dimension(564, 248));
		this.pack();
	}

	public void setController(Controller controller) {

		this.controller = controller;
	}

}