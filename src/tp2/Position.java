package tp2;

public class Position {
	
	int x;
	int y;
	
	public Position(int pX, int pY) {
		this.x = pX;
		this.y = pY;
	}
	
	public void deplace(int dX, int dY) {
		this.x = dX;
		this.y = dY;
		
	}
	
	public void affiche() {
		System.out.println("( "+this.x+" , "+this.y+" )");
	}

}
