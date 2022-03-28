package bts;

public class Netbook extends Ordinateur {
	private int taille;
	private int poids ;
	private String webcam ;
	private String carte_memoire;


	public Netbook(String reference,String processeur, int RAM,int disque_dur, String OS,int prix,int taille,int poids,String webcam , String carte_memoire) {
		super(carte_memoire, carte_memoire, poids, poids, carte_memoire, poids);
		this.carte_memoire= carte_memoire;
		this.poids = poids;
		this.taille = taille;
		this.webcam= webcam;
	}
	
	@Override
	public String toString() {
		return "taille : "+this.taille + " poids : "+this.poids  + " webcam : "+this.webcam + " carte memoire : "+this.carte_memoire + super.toString();
	}

}
