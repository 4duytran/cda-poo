package tp4;

abstract public class Figure {
	
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
