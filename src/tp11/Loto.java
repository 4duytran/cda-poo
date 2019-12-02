package tp11;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Loto extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -2495103012747606413L;
	private JTextField result1 = new JTextField();
	private JTextField result2 = new JTextField();
	private JTextField result3 = new JTextField();
	private JButton lance = new JButton("Lancer");
	private JTextField result4 = new JTextField();
	private JButton buttonRetour = new JButton("Retour");
	private JLabel regle = new JLabel();

	
	public Loto() {
		
		//Init Window
		super("Java Application Graphic");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		
		// Panel principal
		
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		panel.setLayout(new GridLayout(3,1));
		
		JPanel panel0 = new JPanel();
		panel0.setLayout(new FlowLayout(FlowLayout.CENTER, 40,80));
		regle.setText("Regle du jeu: Si la somme des 3 numéros est supérieure à 15 , Vous gagnez!");
		panel0.add(regle);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 40,40));
		
		result1.setPreferredSize(new Dimension(40, 30));
		result2.setPreferredSize(new Dimension(40, 30));
		result3.setPreferredSize(new Dimension(40, 30));
		panel1.add(result1);
		panel1.add(result2);
		panel1.add(result3);
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 20,0));
		
		result4.setPreferredSize(new Dimension(80, 30));
		panel2.add(lance);
		panel2.add(result4);
		panel2.add(buttonRetour);
		
		// Final window
		
		panel.add(panel0);
		panel.add(panel1);
		panel.add(panel2);
		
		
		// Action listener
		
		buttonRetour.addActionListener(this::retourBouton);
		lance.addActionListener(this::resultatLoto);
		
this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				int btn = JOptionPane.showConfirmDialog(Loto.this, "Vous voulez quitter? ", "Confirmation", JOptionPane.YES_NO_OPTION);
				if(btn == JOptionPane.YES_OPTION)
				{
					dispose();
				}
				
			}
			
		});
		
	}
	
	
	
	private void resultatLoto(ActionEvent e) {
		
		int resultat1 = (int) (Math.random()*10);
		int resultat2 = (int) (Math.random()*10);
		int resultat3 = (int) (Math.random()*10);
		int somme = resultat1+resultat2+resultat3;
		
		result1.setText(""+resultat1 );
		result2.setText(""+resultat2 );
		result3.setText(""+resultat3 );
		String text = somme > 15 ? "Gagné !": "Perdu !";
		result4.setText(text);
		
	}
	
	private void retourBouton(ActionEvent e) {
 		
 		PrincipWindow window = new PrincipWindow();
 		window.setVisible(true);
 		this.dispose();
 	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
