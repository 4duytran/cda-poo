package tp5Exo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTp5Exo2 {

	public static void main(String[] args) {
		
		List<Figure> figures = new ArrayList<Figure>();
		
		Scanner sc = new Scanner(System.in);	
		boolean flag = true;
		while(flag)
		{
			System.out.println("Cercle ou Carre? q pour quitter: ");
			String choix = sc.nextLine();
			if (choix.equals("q"))
			{
				System.out.println("Bye Bye!");
				flag = false;
			}
			else
			{
				if (!choix.equalsIgnoreCase("cercle")  &&  !choix.equalsIgnoreCase("carre")) 
				{
					System.out.println("Mauvais choix");
				}
				else
				{
					for(int i=0; i<100;i++)
					{
						if(choix.equalsIgnoreCase("cercle"))
						{
							figures.add(i, new Cercle());
							
							
						}
						else
						{
							figures.add(i, new Carre());
							
						}
					}
					flag = false;
				}
			}
			
		}	
		
		int count = 1;
		for (Figure figure : figures)
		{
			System.out.println(count+ " - "+figure);
			count++;
		}
		
		System.out.println("Aire totale : "+aire_totale(figures));
		sc.close();	
	}
	
	
	public static double aire_totale(List<Figure> list) {
		double aire_totale=0;
		for (int i =0; i<list.size(); i++) {
			double aire = list.get(i).getAire();
			aire_totale+= aire;
		}
		return aire_totale;
	}
	
	
}
