package bts;

import java.util.ArrayList;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		Collection<Ordinateur> collection = new ArrayList<Ordinateur>();
		Ordinateur ordinateur = new Ordinateur("LENOVO Ideacentre 3 24IIL05","Intel Core i5-1035G4", 8, 1000, "Windows 10", 699);
		Netbook netbook = new Netbook("LENOVO Ideacentre 3 24IIL05","Intel Core i5-1035G4", 8, 1000, "Windows 10", 699,14, 1400, "false", "false");
		OrdiBureau ordibureau = new OrdiBureau("LENOVO Ideacentre 3 24IIL05","Intel Core i5-1035G4", 8, 1000, "Windows 10", 699,"ASUS Carte Graphique - RTX 3080 Ti ", "GIGABYTE - Carte mère Z590 VISION G", "Log0itech - MX KEYS ");
		Portable portable = new Portable("LENOVO Ideacentre 3 24IIL05","Intel Core i5-1035G4", 8, 1000, "Windows 10", 699,14,1400 , "Webcam 1080P", "Carte Mémoire 256 Go");
		collection.add(ordinateur);
		collection.add(ordibureau);
		collection.add(netbook);
		collection.add(portable);
		System.out.println("la collection : " + collection);
		System.out.println("taille du tableau : "+collection.size());
		System.out.println("ordinateur : " +ordinateur.toString());
		System.out.println("ordibureau : " + ordibureau.toString());
		System.out.println("portable : " + portable.toString());
		System.out.println("netbook : " + netbook.toString());
		
		
		

	}

}
