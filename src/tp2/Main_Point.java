package tp2;

public class Main_Point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Position [] points = {new Point(2, 2, 'A') , new Point(4, 4, 'B') , new Point(6, 6, 'C')};
		
		for (Position p: points) {
			p.affiche();
		}
		
	}


}
