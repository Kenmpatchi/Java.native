package editeur;

public class Editeurs {
	private String idEditeur;
	private String nomEditeur;
	private String site;
	public Editeurs(String idEdituer,String nomEditeur,String site) throws ReguliereException1,ReguliereException2 {
		this.idEditeur=idEditeur;
		if(nomEditeur.length()<4)throw new ReguliereException1("nom akther men 5 charactere");
		this.nomEditeur=nomEditeur;
		if(site.length() <= 5 || !site.substring(0, 5).equals("https"))throw new ReguliereException2("url must be start with https for security");
		this.site=site;
	}
	public String tostring() {
		return "id= "+idEditeur+" nom= "+nomEditeur+" site= "+site;
	}
}


