package towers;

public class Terrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ennemi grosMechant = new Ennemi();
		grosMechant.type = "Gros m�chant";
		grosMechant.pv = 200;
		grosMechant.speed = 2;
		grosMechant.posx = 0;
		grosMechant.posy = 0;
		System.out.println(grosMechant.toString());
			
		Ennemi petitMechant = new Ennemi();
		petitMechant.type="Le petit m�chant";
		petitMechant.pv = 100;
		petitMechant.speed = 4;
		petitMechant.posx = 0;
		petitMechant.posy = 0;
		System.out.println(petitMechant.toString());
		
		
		Ennemi leVraiGrosEnnemi = new Ennemi(500, 1);
		leVraiGrosEnnemi.type ="Le vrai gros m�chant";

		
		grosMechant.seDeplace(5, 8);
		grosMechant.recevoirDegat(50);
		petitMechant.recevoirDegat(100);
		System.out.println(petitMechant.toString());
		System.out.println(grosMechant.toString());
		System.out.println(Ennemi.compteur);
		
		Ennemi nouveauEnnemi = Ennemi.saisirEnnemi();
		System.out.println(nouveauEnnemi);
		
		
	}

}
