package towers;

import java.util.Scanner;

public class Ennemi {
	private int pv;
	private float posx;
	private float posy;
	private int speed;
	String type;
	static int compteur;
	
	public Ennemi(int pv, int speed, String type) {
		compteur++;
		this.pv = pv;
		this.speed = speed;
		this.type = type;
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
		System.out.println("Ennemie "+this.type+" a touché");
		this.pv = this.pv - deg;
	}
	
	public void seDeplace (float posx, float posy) {
		System.out.println("Ennemi "+this.type+" se deplace");
		this.posx = posx;
		this.posy = posy;
		
	}
	
	public boolean estVivant() {
		boolean reponse = true;
		
		reponse = this.pv<=0 ? false : true;
		
		return reponse;
	}
	
	public String toString() {
		String status = "";
		
		status = estVivant() ? "il est vivant" : "il est mort" ; 
		
    	return "Résumer d'ennemi "+this.type + "\r Point de vie: "+this.pv+"\r La vitesse: "+this.speed+"\r La position X: "+this.posx+"\r La position Y: "+this.posy+"\r Status: "+status+"\n";
	    	
	    }
	
	public static Ennemi saisirEnnemi() {
		Ennemi unEnnemi = new Ennemi();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner un nom pour l'ennemi: ");
		unEnnemi.type = sc.nextLine();
		System.out.println("Donner les points de vie: ");
		int pointsDeVie = sc.nextInt();
		unEnnemi.pv = pointsDeVie > 1000 || pointsDeVie < 0 ? 100:pointsDeVie;
		System.out.println("Donner la vitesse: ");
		int vitesse = sc.nextInt();
		unEnnemi.speed = vitesse;
		sc.close();
		return unEnnemi;
	}
	
//    public void affichage() {
//    	
//    	System.out.println(" Point de vie: "+this.pv+"\r La vitesse: "+this.speed+"\r La position X: "+this.posx+"\r La position Y: "+this.posy);
//    }
	
    
    public int getPv() {
    	return this.pv;
    }
    
    public int getSpeed() {
    	return this.speed;
    }
    
    public float getPosx() {
    	return this.posx;
    }
    
    public float getPosy() {
    	return this.posy;
    }
 
   /* public void setPosx(float nouvelleValeur) {
    	this.posx = nouvelleValeur; 	
    }
    
    public void setPosy(float nouvelleValeur) {
    	this.posy = nouvelleValeur; 	
    }
    */
   
    
    public void setPv(int nouvelleValeur) {
    	this.pv = nouvelleValeur > 1000 || nouvelleValeur < 0 ? 100:nouvelleValeur;

    	
    }
    
    public void setSpeed(int nouvelleValeur) {
    	this.speed = nouvelleValeur; 	
    }
}
