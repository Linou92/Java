import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Affichage extends JFrame{
	
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
    private JButton bouton1 = new JButton("Start");
    private int compt = Bouton.getCompt();
    
    public Affichage(){
    	panel.setLayout(new BorderLayout());
    	this.setTitle("deuxième fenetre");
    	this.setSize(300,300);
    	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	this.setLocationRelativeTo(null);
 
    	panel.setBackground(Color.MAGENTA);
    	label.setText("Vous avez cliqué " +compt+ " fois");
  
    	panel.add(label);   
    	setContentPane(panel);
    	this.setVisible(true);    
    }
}
