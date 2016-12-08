import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Bouton extends JFrame implements ActionListener{
	
	private JButton clique = new JButton("Cliquez !");
	private JPanel background = new JPanel();
	private static int compt=0;
	private JLabel affichage = Affichage.getJLabel();

	public Bouton(){

		this.setTitle("Bouton");
		this.setPreferredSize(new Dimension(500,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setLocation(500,400);
		this.setSize(500, 500);
		this.setVisible(true);
		this.pack();
		
		clique.setBackground(Color.MAGENTA);
		clique.setForeground(Color.WHITE);
		Font font = new Font("Vivaldi", Font.BOLD,40);
    	clique.setFont(font);
    	clique.addActionListener(this);
    	
    	background.setBackground(Color.PINK);
		background.add(clique,BorderLayout.CENTER);
		setContentPane(background);
	}
	
	public static int getCompt() {
		return compt;
	}
	
	public void actionPerformed(ActionEvent e){
		this.compt++;
		affichage.setText("Vous avez cliqué " +compt+ " fois !");
	}
}
