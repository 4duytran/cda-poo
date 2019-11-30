package tp5;

public class Service implements Payant {

	public float prix;
	public String name;
	
	public Service(float prix, String name) {
		this.prix = prix;
		this.name = name;
	}
	
	@Override
	public float getPrix() {
		
		return this.prix;
	}
	
	public void affiche() {
		System.out.println("Le prix de "+this.name+" est: "+getPrix());
	}

}
