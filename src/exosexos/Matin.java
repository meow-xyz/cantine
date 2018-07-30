package exosexos;

public class Matin extends Menu {
	public Matin() {
	}
	String cereale;
	public void printMenuMatin() {
		System.out.println("Le menu de ce matin est: " + getBoisson() + getFeculent() + getFruit() + getProduitLaitier() + getCereale());
	}
	
	public String getCereale() {
		return cereale;
	}
	public void setCereale(String cereale) {
		this.cereale = cereale;
	}

}
