package exosexos;

public class MidiSoir extends Menu {
    public MidiSoir() {
    }
     String legume;
	String proteine;
    public void printMenuJournee() {
    	System.out.println("Le menu de ce matin est: " + getBoisson() + getFeculent() + getFruit() + getProduitLaitier() + getLegume() + getProteine());
    }
    
    public String getLegume() {
		return legume;
	}
	public void setLegume(String legume) {
		this.legume = legume;
	}
	public String getProteine() {
		return proteine;
	}
	public void setProteine(String proteine) {
		this.proteine = proteine;
	}
	
}
