package tp5Exo2;

public class Carre extends Figure {
	
	public final int cote=20;
	private String type="Le Carre";
	

	private double surface() {
		return cote*cote;
	}
	
	protected double aire() {
		return this.surface();
	}

	@Override
	public double getAire() {
		// TODO Auto-generated method stub
		return this.surface();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}
	
	
	public String toString() {
		return  this.getType()+" "+super.toString()+" Cote "+this.cote;
	}
	

}
