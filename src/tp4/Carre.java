package tp4;

public class Carre extends Figure {
	
	public final int cote=20;
	

	public double surface() {
		return cote*cote;
	}
	
	public String toString() {
		return "Le Carre "+super.toString()+" Cote "+this.cote;
	}
	
	public double aire() {
		return this.surface();
	};

}
