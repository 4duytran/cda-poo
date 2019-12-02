package tp11;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main11 {

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		PrincipWindow window = new PrincipWindow();

	}

}
