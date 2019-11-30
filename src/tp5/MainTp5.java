package tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainTp5 {

	public static void main(String[] args) {
				
		List<Service> ligne_prix = new ArrayList<Service> ();
		
		ligne_prix.add(new Service(2.5f, "Coca"));
		ligne_prix.add(new Service(8.5f, "vin"));
		ligne_prix.add(new Service(3.5f, "bierre"));
		ligne_prix.add(new Service(21.43f, "Whisky"));
		ligne_prix.add(new Service(12.65f, "Rhum"));

		for (Service services : ligne_prix)
		{
			services.affiche();
		}
	}

}
