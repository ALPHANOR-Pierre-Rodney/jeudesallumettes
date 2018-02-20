package com.allumettes.fr.view.panels.matches;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MatchesCanvas extends Canvas {
	
	private Canvas cvMatches;
	private int total;
	private int rest;
	
	public MatchesCanvas(int total, int rest) {
		
		super();
		this.total = total;
		this.rest = rest;
		this.setBackground(Color.WHITE);
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		 for(int i = 0; i < this.total; i++) {
			 
			 g.drawRect(i * 6, 10, 4, 50);
		 }
	}
	
}
