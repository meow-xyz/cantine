package exosexos;

public class CreateMenu {

	public static void main(String[] args) {
		
		 Matin menuMatin = new Matin();
		 MidiSoir menuMidi = new MidiSoir();
		 MidiSoir menuSoir = new MidiSoir();
		 
		menuMatin.setBoisson("compote, ");
		menuMatin.setFeculent("mais, ");
		menuMatin.setFruit("orange, ");
		menuMatin.setProduitLaitier("lait, ");
		menuMatin.setCereale("flocons d'avoine.");		
		
		menuMidi.setBoisson("the, ");
		menuMidi.setFeculent("riz, ");
		menuMidi.setFruit("pomme, ");
		menuMidi.setProduitLaitier("creme fraiche, ");
		menuMidi.setLegume("tomate, ");
		menuMidi.setProteine("steak soja.");
		
		menuSoir.setBoisson("jus de fruits, ");
		menuSoir.setFeculent("frites, ");
		menuSoir.setFruit("mango, ");
		menuSoir.setProduitLaitier("yaourt, ");
		menuSoir.setLegume("poivrons, ");
		menuSoir.setProteine("pois chiche.");
		
		menuMatin.printMenuMatin();
		menuMidi.printMenuJournee();
		menuSoir.printMenuJournee();
		
	}
	    
}