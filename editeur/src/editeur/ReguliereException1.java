package editeur;

public class ReguliereException1 extends Exception{
	String message;
	public ReguliereException1(String message){
		this.message=message;
	}
	public String getmessage(){
		return message;
	}
}
