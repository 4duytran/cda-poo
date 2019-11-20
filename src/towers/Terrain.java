package towers;

public class Terrain {
	
	int mapx = 100;
	int mapy= 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ennemi grosMechant = new Ennemi();
		grosMechant.type = "Gros méchant";		
		grosMechant.setPv(300);
		grosMechant.setSpeed(4);

		System.out.println(grosMechant);
			
		Ennemi leVraiGrosEnnemi = new Ennemi(500, 1, "tom");
		System.out.println(leVraiGrosEnnemi);
		
		grosMechant.seDeplace(5, 8);
		System.out.println(grosMechant);
		System.out.println("total ennemi "+Ennemi.compteur);
		
//		Ennemi nouveauEnnemi = Ennemi.saisirEnnemi();
//		System.out.println(nouveauEnnemi);
		
		Tour tour1 = new Tour();
		
		tour1.attack(grosMechant);
		System.out.println(grosMechant);
		tour1.attack(grosMechant);
		tour1.attack(grosMechant);
		tour1.attack(grosMechant);
		System.out.println(grosMechant);
		
	}

}
