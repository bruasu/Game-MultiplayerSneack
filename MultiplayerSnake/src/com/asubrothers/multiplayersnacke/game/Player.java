package com.asubrothers.multiplayersnacke.game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	public int x;
	public int y;
	public String nickname;
	public Player(String nickname,int x,int y) {
		this.x=x;
		this.y=y;
		this.nickname = nickname;
	}
	public void update() {
		
	}
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, Game.blockSize,Game.blockSize);
	}
}
