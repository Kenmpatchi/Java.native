package entreprise;

public class Entreprise {
	private int Nb;
	private int capital;
	private String Nom;
	private String mission;
	public Entreprise(int Nb,int capital,String Nom,String mission) {
		this.capital=capital;
		this.mission=mission;
		this.Nb=Nb;
		this.Nom=Nom;
	}
	public String mission()throws SecretMissionException {
		if(mission.length()<=0)throw new SecretMissionException();
		else {
			return mission;
		}
	}
	public int capital()throws NonProfitExcepption {
		if(Nb<0)throw new NonprofitException();
		else {
			return Nb;
		}
	}

}
