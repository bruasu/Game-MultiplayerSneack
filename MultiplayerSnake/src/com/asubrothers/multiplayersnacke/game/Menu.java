package com.asubrothers.multiplayersnacke.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JPanel implements ActionListener{
	private JButton buttonPlay;
	private JButton buttonClose;
	private JTextField nickField;
	private JLabel errorTextField;
	public Menu() {
		this.setLayout(null);
		nickField = new JTextField();
		buttonPlay = new JButton("Jugar");
		buttonPlay.addActionListener(this);
		buttonClose = new JButton("Salir");
		errorTextField = new JLabel("Debes introducir un nombre de usuario");
		buttonClose.addActionListener(this);
		nickField.setBounds(Window.width/2-100,0,200,30);
		buttonPlay.setBounds(Window.width/2-100,50,200,30);
		buttonClose.setBounds(Window.width/2-100,100,200,30);
		errorTextField.setBounds(Window.width/2-110,150,errorTextField.getText().length()*20,30);
		errorTextField.setVisible(false);
		this.add(nickField);
		this.add(buttonPlay);
		this.add(buttonClose);
		this.add(errorTextField);
		
	}
	public void update() {
		
	}
	public void render() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonPlay) {
			if(!nickField.getText().equals("")) {
				Window.GameMode = "game";
				Window.ChangeMode = true;
			}else {
				errorTextField.setVisible(true);
			}
		}
		if(e.getSource()==buttonClose) {
			System.exit(0);
		}
			
		
		
	}
	
}
