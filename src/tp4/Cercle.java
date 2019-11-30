package tp4;

public class Cercle extends Figure {
	public final int rayon=20;
	

	
	
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	
	
	public String toString() {
		return "Le cercle "+super.toString()+" Rayon "+this.rayon;
	}

	public double aire() {
		return this.surface();
	};

}
