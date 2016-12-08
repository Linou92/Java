import java.awt.BorderLayout;
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
	
	private Affichage fen2;
	private JButton clique = new JButton("CLiquez!");
	private JPanel panel = new JPanel();
	private static int compt=0;
	
	public Bouton(){
		panel.setLayout(null);
		this.setSize(800,800);
		this.setTitle("Bouton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		clique.setBackground(Color.cyan);
		clique.setBounds(200,150,300,200);
		
		panel.add(clique);
		setContentPane(panel);
		clique.addActionListener(this);
		this.setVisible(true);
	}
	
	public static int getCompt() {
		return compt;
	}
	
	public void actionPerformed(ActionEvent e){
		//this.dispose();
		this.compt++;
		fen2 = new Affichage();
	}
	
	public static void main(String[] args){
		new Bouton();
	}
}
