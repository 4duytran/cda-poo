package minuteur;

public class Minuteur {
	private int minute;
	
	
	public void tic() {
		
		this.minute = this.minute == 59 ? 0:(++this.minute);
		
	}
	
	
	public void avancer(int n) {
		for (int i=0; i<n; i++) 
		{
			this.tic();
		}
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public void setMinute(int nouvelleValeur) {
		
		this.minute = this.minute >59 || this.minute < 0 ? 0:nouvelleValeur;
		
	}


}
