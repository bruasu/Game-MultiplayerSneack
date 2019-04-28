package com.asubrothers.multiplayersnacke.game;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener{
	private ArrayList<Player> players = new ArrayList<Player>();
	public String nickname;
	public int mapX =50;
	public int mapY = 50;
	public static int blockSize = 20;
	public int blockLenght = 50;
	public Game() {
		int randomX = new Random().nextInt(blockLenght)*blockSize;
		int randomY = new Random().nextInt(blockLenght)*blockSize;
		players.add(new Player(nickname,randomX,randomY));
		this.addKeyListener(this);
	}
	
	public void update() {
		for(int i=0;i<players.size();i++) {
			players.get(i).update();
		}
	}
	public void render() {
		Graphics g = this.getGraphics();
		for(int i=0;i<players.size();i++) {
			players.get(i).render(g);
		}
		g.setColor(Color.BLACK);
		for(int x=0;x<blockLenght;x++) {
			for(int y=0;y<blockLenght;y++) {
				g.drawRect(x*blockSize, y*blockSize, blockSize,blockSize);
			}
		}
		g.dispose();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(Character.toString(e.getKeyChar()).equals("w")) {
			
		}
		if(Character.toString(e.getKeyChar()).equals("a")) {
			
		}
		if(Character.toString(e.getKeyChar()).equals("d")) {
			
		}
		if(Character.toString(e.getKeyChar()).equals("s")) {
			
		}
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
