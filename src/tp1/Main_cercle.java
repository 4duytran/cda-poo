package tp1;

import java.util.Scanner;

public class Main_cercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_Cercle cercleA = new C_Cercle(5, 2, 4);
		cercleA.type = "Alpha";
		cercleA.deplacer(3, 8);
		System.out.println("Surface "+cercleA.type+" "+cercleA.surface());
		
		C_Cercle cercleB = new C_Cercle(13, 6, 2);
		cercleB.type = "Beta";
		cercleB.deplacer(12, 5);
		System.out.println("Surface "+cercleB.type+" "+cercleB.surface());
		
		System.out.println(cercleA.compare(cercleB));
		
		//Exo2
		
		C_Cercle tab[] = {cercleA,cercleB};
		
		for(C_Cercle elt : tab) {
			elt.affiche();;
		}
		
		//Exo3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de Cercle?");
		int nb_cercle = sc.nextInt();
		
		C_Cercle tableau[] = new C_Cercle [nb_cercle];
		
		for (int i=0; i<(tableau.length); i++) 
		{
			System.out.println("Cercle "+(i+1));
			System.out.println("Rayon");
			int rayon = sc.nextInt();
			System.out.println("Abs");
			int abs = sc.nextInt();
			System.out.println("Ord");
			int ord = sc.nextInt();

			C_Cercle cercle = new C_Cercle(abs, ord, rayon);
			tableau[i]= cercle;
			tableau[i].affiche();
		}
		
		sc.close();
	}

}
