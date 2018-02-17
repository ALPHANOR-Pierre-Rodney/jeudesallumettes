package com.allumettes.fr.view.frames.profilplayer;

import javax.swing.*;
import java.awt.*;

public class ProfilPlayer extends JFrame {

	private Face face;
	private String name;

	public ProfilPlayer(String name) {

		super();

		this.face = Face.Normal;
		this.name = name;


	}

	public void setFace(Face face) {

		this.face = face;
	}

	public Face getFace() {

		return this.face;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return this.name;
	}
}