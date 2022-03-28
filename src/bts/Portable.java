package bts;

public class Portable extends Ordinateur {
	private int taille;
	private int poids ;
	private String webcam ;
	private String carte_memoire ;
	public Portable(String reference,String processeur, int RAM,int disque_dur, String OS,int prix,int taille, int poids,String webcam,String carte_memoire) {
		super(OS, OS, prix, prix, OS, prix);
		this.taille=taille;
		this.poids = poids;
		this.webcam = webcam;
		this.carte_memoire = carte_memoire;
	}
	@Override
	public String toString() {
		return "taille : " +this.taille +" poids : " +this.poids  +" webcam : " +this.webcam +" carte memoire : " +this.carte_memoire + super.toString();
	}
}
