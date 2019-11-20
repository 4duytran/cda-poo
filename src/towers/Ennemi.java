package towers;

import java.util.Scanner;

public class Ennemi {
	int pv;
	float posx;
	float posy;
	int speed;
	String type;
	static int compteur;
	
	public Ennemi(int pv, int speed) {
		this.pv = pv;
		this.speed = speed;
	}
	
	public Ennemi() {
		System.out.println("Un ennemi est née:");
		compteur++;
		this.posx = 0;
		this.posy = 0;
		this.pv = 100;
		this.speed = 2;
				
	}
	
	
	public void recevoirDegat (int deg) {
		System.out.println("Ennemie a touché");
		this.pv = this.pv - deg;
	}
	
	public void seDeplace (float posx, float posy) {
		System.out.println("Ennemi se deplace");
		this.posx = posx;
		this.posy = posy;
		
	}
	
	public boolean estVivant() {
		boolean reponse = true;
		if (this.pv <= 0) 
		{
			reponse = false;
		}
		else
		{
			reponse = true;
		}
		return reponse;
	}
	
	public String toString() {
		String status = "";
		if (estVivant()) 
		{
			status = "il est vivant";
		}
		else
		{
			status = "il est mort";
		}
	    	
	    	return this.type + "\r Point de vie: "+this.pv+"\r La vitesse: "+this.speed+"\r La position X: "+this.posx+"\r La position Y: "+this.posy+"\r Status: "+status;
	    	
	    }
	
	public static Ennemi saisirEnnemi() {
		Ennemi unEnnemi = new Ennemi();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner les points de vie: ");
		int pointsDeVie = sc.nextInt();
		unEnnemi.pv = pointsDeVie;
		System.out.println("Donner la vitesse: ");
		int vitesse = sc.nextInt();
		unEnnemi.speed = vitesse;
		sc.close();
		return unEnnemi;
	}
	
    public void affichage() {
    	
    	System.out.println(" Point de vie: "+this.pv+"\r La vitesse: "+this.speed+"\r La position X: "+this.posx+"\r La position Y: "+this.posy);
    }
	
}
