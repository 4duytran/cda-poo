package tp5Exo2;

abstract public class Figure implements Calcul_Geo, Type{
	
	private int x=0;
	private int y=0;
	

	public String toString() {
		return "Position x "+this.x+" Position y "+this.y;
	}
	
	abstract double aire();
	
	protected void dessine() {
		this.toString();
	}
	
}
