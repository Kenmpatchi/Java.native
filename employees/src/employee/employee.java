package employee;

import java.io.Serializable;

public class employee implements Serializable{
	private int salaire;
	private String matricule; 
	private String nom;
	private String fonction;
	public employee(String nom,String matricule,int salaire,String fonction){
		this.salaire=salaire;
		this.nom=nom;
		this.matricule=matricule;
		this.fonction=fonction;
	}
	public String getNom() {
		return nom;
	}
	public int getSaliare() {
		return salaire;
	}
	public String getmatricule() {
		return matricule;
	}
	public String getFonction() {
		return fonction;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setSalaire(int salaire) {
		this.salaire=salaire;
		
	}
	public void setMatricule(String matricule) {
		this.matricule=matricule;
	}
	public void setFonction(String fonction) {
		this.fonction=fonction;
	}
	public String tostring() {
		return "nom de employee est "+nom+" salare "+salaire+" matricule= "+matricule+" fonction "+fonction;
	}
}
