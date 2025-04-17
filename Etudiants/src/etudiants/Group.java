package etudiants;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Group {
	List<Etudiant> etudiant=new ArrayList<Etudiant>(3);
	String Nomgroupe;
	public Group(String Nomgroupe,List<Etudiant> etudiant) {
		this.Nomgroupe=Nomgroupe;
		this.etudiant=etudiant;
	}
	public void setEtudiant(List<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
	public void setNomgroupe(String nomgroupe) {
		Nomgroupe = nomgroupe;
	}
	public List<Etudiant> getEtudiant() {
		return etudiant;
	}
	public String getNomgroupe() {
		return Nomgroupe;
	}
	public void affiche() {
		ListIterator<Etudiant> et=etudiant.listIterator();
		System.out.println("nom de groupe est "+Nomgroupe+"les etudiant sont:");
		while(et.hasNext()) {
		System.out.println(et.next().tostring());
		}
		}
	public void ajout(Etudiant e) {
		etudiant.add(e);
	}
	public void meilleur() {
		ListIterator<Etudiant> et2=etudiant.listIterator();
		Etudiant etd=et2.next();
		while(et2.hasNext()) {
		Etudiant meilleur=et2.next();
		if(etd.moyenne<meilleur.moyenne) {
			etd=meilleur;
			}
		}
		
		System.out.println("le meilleur est "+etd.tostring());
	}
}
