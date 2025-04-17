package etudiants;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[]args) {
		List<Etudiant> etd=new ArrayList<Etudiant>(3);
		Etudiant e1=new Etudiant("001","hamza",16);
		Etudiant e2=new Etudiant("002","samir",12);
		Etudiant e3=new Etudiant("003","bchir",13);
		Etudiant e4=new Etudiant("004","samir 2.0",12);
		etd.add(e1);
		etd.add(e2);
		etd.add(e3);
		etd.add(e4);
		Group group1=new Group("groupe1",etd);
		group1.affiche();
		group1.meilleur();
	}
}
