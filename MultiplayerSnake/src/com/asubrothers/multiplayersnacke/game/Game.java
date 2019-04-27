package com.asubrothers.multiplayersnacke.game;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener{

	public Game() {
		this.addKeyListener(this);
	}
	public void update() {
		
	}
	public void render() {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==27) {
			System.exit(0);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
