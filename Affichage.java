import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Affichage extends JFrame{
	
	private JPanel background = new JPanel();
	private static JLabel affichage = new JLabel();
    
    public Affichage(){
 
    	this.setTitle("Compteur");
    	this.setPreferredSize(new Dimension(500,500));
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLocation(800,400);
    	this.setResizable(true);
    	this.setVisible(true);    
    	this.pack();
    	
    	Font font = new Font("Vivaldi", Font.BOLD,40);
    	affichage.setFont(font);
    	affichage.setHorizontalAlignment(JLabel.CENTER);
    	affichage.setVerticalAlignment(JLabel.CENTER);
    	affichage.setText("Vous avez cliqué 0 fois !");
    	
    	background.setBackground(Color.PINK);
    	background.add(affichage);   
    	setContentPane(background);
    }
    
    public static JLabel getJLabel(){
    	return affichage;
    }
}
