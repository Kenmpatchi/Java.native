package etudiants;

public class Etudiant {
	String name;
	int moyenne;
	String code;
	public Etudiant(String code,String name,int moyenne) {
		this.code=code;
		this.moyenne=moyenne;
		this.name=name;
	}
	public String getCode() {
		return code;
		}
	
	public int getMoyenne() {
		return moyenne;
	}
	public String getName() {
		return name;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setMoyenne(int moyenne) {
		this.moyenne = moyenne;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String tostring() {
		return "code : "+code+" name : "+name+" moyenne : "+moyenne;
	}
}
