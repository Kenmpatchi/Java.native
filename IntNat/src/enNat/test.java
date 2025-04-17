package enNat;

public class test  {
	public static void main(String[]arg) {
		try {
			EntNat a=new EntNat(2);
			System.out.println(a.getN());
			
		}
		catch(ErrorConst e) {
			System.err.println("there is an error");
		}
	}

}
