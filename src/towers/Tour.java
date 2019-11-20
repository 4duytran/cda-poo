package towers;

public class Tour {

	private int force;
	private int porte;
	private float posX;
	private float posY;
	
	
	public Tour(int force, int porte, int posX, int posY) {
		this.force = force;
		this.porte = porte;
		this.posX = posX;
		this.posY = posY;
	}
	
	
	
	public Tour() {
		this.force = 10;
		this.porte = 5;

	}
	
	public void attack(Ennemi target) {
		System.out.println(target.type+ " a été attaqué");
		target.recevoirDegat(this.force);
	}
}
