package bts;


public class OrdiBureau extends Ordinateur  {
	private String carte_graphique ;
	private String chipset ;
	private String clavier ;
	

	public OrdiBureau(String reference,String processeur, int RAM,int disque_dur, String OS,int prix,String carte_graphique,String chipset , String clavier) {
		super(clavier, clavier, RAM, RAM, clavier, RAM);
		this.carte_graphique = carte_graphique; 
		this.chipset=chipset;
		this.clavier = clavier;

	}
	@Override
	public String toString() {
		
		return "carte graphique : "+this.carte_graphique + " carte mere : "+ this.chipset +  "clavier : "+this.clavier + super.toString();
	}
	

}
