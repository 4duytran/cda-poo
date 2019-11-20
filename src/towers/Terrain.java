package towers;

public class Terrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ennemi grosMechant = new Ennemi();
		grosMechant.type = "Gros méchant";
		
		grosMechant.setPv(200);
		grosMechant.setSpeed(4);

		System.out.println(grosMechant);
			
		Ennemi leVraiGrosEnnemi = new Ennemi(500, 1, "tom");
		System.out.println(leVraiGrosEnnemi);
		
		grosMechant.seDeplace(5, 8);
		grosMechant.recevoirDegat(50);
		System.out.println(grosMechant);
		System.out.println("total ennemi "+Ennemi.compteur);
		
		Ennemi nouveauEnnemi = Ennemi.saisirEnnemi();
		System.out.println(nouveauEnnemi);
		
		
	}

}
