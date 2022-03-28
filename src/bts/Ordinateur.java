package bts;

public class Ordinateur {
	private String reference;
	private String processeur ;
	private int RAM ;
	private int disque_dur ;
	private String OS ;
	private int prix ;
	
	public Ordinateur(String reference,String processeur, int RAM,int disque_dur, String OS,int prix) {
		this.reference= reference;
		this.processeur=processeur;
		this.RAM=RAM;
		this.disque_dur=disque_dur;
		this.OS = OS;
		this.prix = prix;
		
	}
	public String toString() {
		return " reference : " + this.reference + " processeur : "+this.processeur + " Ram : "+ this.RAM + " Taille de disque dur : "+this.disque_dur + " Systeme d'exploitation : "+this.OS + " Prix : "+ this.prix;
	}

}
