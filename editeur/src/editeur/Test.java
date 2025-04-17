package editeur;

public class Test {
	public static void main(String[]args) {
		try {
			Editeurs p=new Editeurs("001","nomfghftgh","ffdddddddd");
			System.out.println(p.tostring());
		}
		catch(ReguliereException1 e){
			System.err.println(e.getmessage());
			
		}
		catch(ReguliereException2 e1) {
			System.out.println(e1.getMessage());
		}
	}
}
