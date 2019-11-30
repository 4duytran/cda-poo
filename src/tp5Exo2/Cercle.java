package tp5Exo2;

public class Cercle extends Figure {
	public final int rayon=20;
	private String type="Le Cercle";

	
	
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	

	protected double aire() {
		return this.surface();
	}


	@Override
	public double getAire() {
		// TODO Auto-generated method stub
		return aire();
	}


	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	};
	
	public String toString() {
		return this.getType()+" "+super.toString()+" Rayon "+this.rayon;
	}

}
