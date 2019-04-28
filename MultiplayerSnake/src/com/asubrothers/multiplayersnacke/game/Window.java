package com.asubrothers.multiplayersnacke.game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame implements Runnable{
	/**
	 * Inicio de desarrollo 27/04/2019, 15:30
	 */
	private static final long serialVersionUID = 1L;
	public static String GameMode = "menu";
	public static boolean ChangeMode = false;
	private JPanel panel;
	private JPanel game;
	private Menu menu;
	public static int width = 1280;
	public static int height = 720;
	public Window() {
		this.setTitle("Multiplayer Snacke - AsuBrothers");
		this.setSize(width,height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		panel = new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		menu = new Menu();
		menu.setSize(this.getWidth(),this.getHeight());
		
		panel = menu;
		this.add(menu);
		repaint();
		new Thread(this).start();
	}
	public void update() {
		if(ChangeMode) {
			if(GameMode == "game") {
				menu.setVisible(false);
				game = new Game();
				game.setSize(this.getWidth(),this.getHeight());
				this.add(game);
				game.setVisible(true);
				game.requestFocus();
			}
			ChangeMode=false;
		}
		if(GameMode == "game") {
			((Game) game).update();
		}
	}
	public void render() {
		if(GameMode == "game") {
		
			((Game) game).render();
		}
	}
	public static void main(String[] args) {
		new Window();
	}
	@Override
	public void run() {
		while(true) {
			try {
				this.update();
				this.render();
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
