package minuteur;

public class Main_minuteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Minuteur minuteur = new Minuteur();
		minuteur.setMinute(20);
		minuteur.avancer(10); 		
		minuteur.avancer(10); 
		int n = minuteur.getMinute();
		System.out.println(n);
		
		
		
	}

}
