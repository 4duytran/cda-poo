package tp2;

public class Point extends Position{
	char nom;

	public Point(int pX, int pY, char name) {
		super(pX, pY);
		this.nom = name;
	
	}
	
	public Point(Point point)
	{
		super(point.x, point.y);
		nom = point.nom;
	}
	
	
	public void affiche() {
		System.out.print(this.nom);
		super.affiche();
	}
	

}
