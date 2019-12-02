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

public class Calcul extends JFrame implements ActionListener{

	private static final long serialVersionUID = 8275574169625698626L;

	private JLabel tex1 = new JLabel("Entrer valeur 1: ");
	private JLabel tex2 = new JLabel("Entrer valeur 2: ");
	private JLabel tex3 = new JLabel("La somme est: ");
	private JLabel tex4 = new JLabel();
	private JTextField val1 = new JTextField();
	private JTextField val2 = new JTextField();
	private JButton buttonSomme = new JButton("Addition");
	private JButton buttonMultiple = new JButton("Multiplication");
	private JButton buttonRetour = new JButton("Retour");
	
public Calcul() {
		
		// Creer fenetre
		super("Java Application Graphic");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		// creer contenue principale
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		panel.setLayout(new GridLayout(4,1));
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
		
		val1.setPreferredSize(new Dimension(150, 30));
		panel1.add(tex1);
		panel1.add(val1);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
		
		val2.setPreferredSize(new Dimension(150, 30));
		panel2.add(tex2);
		panel2.add(val2);
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
		panel3.add(tex3);
		panel3.add(tex4);
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER,50,20));
		panel4.add(buttonSomme);
		panel4.add(buttonMultiple);
		panel4.add(buttonRetour);
		
		
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		
		
		// Action listener
		
		buttonSomme.addActionListener(this::calculerLaSomme);
		buttonMultiple.addActionListener(this::calculerMultiple);
		buttonRetour.addActionListener(this::retourBouton);
			
		
this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				int btn = JOptionPane.showConfirmDialog(Calcul.this, "Vous voulez quitter? ", "Confirmation", JOptionPane.YES_NO_OPTION);
				if(btn == JOptionPane.YES_OPTION)
				{
					dispose();
				}
				
			}
			
		});
		
	}
	
	
 	private void calculerLaSomme(ActionEvent e) {
 		try 
		{
		String total="";
		int a = Integer.parseInt(val1.getText());
		int b = Integer.parseInt(val2.getText());
		int somme = a+b;
		total += somme;
		tex4.setText(total);
		}
		catch (NumberFormatException error) 
		{
			tex4.setText("Error entry or empty case");
		}	
 	}
 	
 	private void calculerMultiple(ActionEvent e) {
 		try 
		{
		String total="";
		int a = Integer.parseInt(val1.getText());
		int b = Integer.parseInt(val2.getText());
		int somme = a*b;
		total += somme;
		tex4.setText(total);
		}
		catch (NumberFormatException error) 
		{
			tex4.setText("Error entry or empty case");
		}	
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
