package com.allumettes.fr.view;

import com.allumettes.fr.view.panels.InitView;
import com.allumettes.fr.controller.Controller;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;

public class View extends JFrame {

	private InitView initView;
	private Controller controller;
	
	public View() {

		super();
		this.setLayout(null);
	}

	public void initView() {

		this.initView = new InitView(this.controller);
		this.initView.setBounds(10, 10, 500, 160);
		this.add(this.initView);
		this.setPreferredSize(new Dimension(564, 248));
		this.pack();
	}

	public void setController(Controller controller) {

		this.controller = controller;
	}

}