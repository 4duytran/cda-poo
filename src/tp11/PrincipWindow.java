package tp11;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrincipWindow extends JFrame implements ActionListener{
	

	private static final long serialVersionUID = 298886436253483460L;
	private JButton buttonCalcul = new JButton("Calcul Somme");
	private JButton buttonLoto = new JButton("Loto");
	
	
	
	public PrincipWindow() {
		
		// Creer fenetre
		super("Java Application Graphic");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		
		// creer contenue principale
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		buttonCalcul.setPreferredSize(new Dimension(140,40));
		panel.add(buttonCalcul);
		
		buttonLoto.setPreferredSize(new Dimension(140,40));
		panel.add(buttonLoto);
		
		// Action Listener
		
		buttonCalcul.addActionListener(this::calculSomme);
		buttonLoto.addActionListener(this::loto);
		
		// Action close window (Bonus)
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				int btn = JOptionPane.showConfirmDialog(PrincipWindow.this, "Vous voulez quitter? ", "Confirmation", JOptionPane.YES_NO_OPTION);
				if(btn == JOptionPane.YES_OPTION)
				{
					dispose();
				}
				
			}
			
		});
					
	}
	
	private void calculSomme(ActionEvent e) {
		Calcul window1 = new Calcul();
		window1.setVisible(true);
		this.dispose();
	}
	
	private void loto(ActionEvent e) {
		Loto window1 = new Loto();
		window1.setVisible(true);
		this.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
}
