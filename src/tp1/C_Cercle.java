package tp1;

public class C_Cercle {

	int coordX;
	int coordY;
	int rayon;
	String type;
	
	C_Cercle(int abs, int ord, int rayon ) {
		this.coordX = abs;
		this.coordY = ord;
		this.rayon = rayon;
		System.out.println("Un nouveau cercle a créé: "+"\n"+"\r Rayon: "+this.rayon+"\r Coordx: "+this.coordX+"\r CoordY:"+coordY);
		
	}
	
	public void deplacer(int deltaX, int deltaY) {
		this.coordX = this.coordX + deltaX;
		this.coordX = this.coordY + deltaY;
		System.out.println(this.type+" a déplacé, le nouveau coords sont: "+coordX+" et "+coordY);
		
	}
	
	public void affiche() {
		System.out.println("info du Cercle "+this.type+"\n"+"\r Le rayon: "+this.rayon+"\r Coordx: "+this.coordX+"\r CoordY:"+coordY);
	}
	
	public boolean compare(C_Cercle cercleB) {
		if (this.rayon == cercleB.rayon) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double surface() {
		return rayon*rayon*Math.PI;
	}
}
