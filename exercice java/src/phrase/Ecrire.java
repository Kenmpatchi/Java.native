package phrase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ecrire {
	public static void main(String [] args) {
		try {
			FileWriter fw =new FileWriter("C:/Users/hamza bettaibi/Desktop/file1.txt");
			PrintWriter pw=new PrintWriter(fw);
			pw.println("salem salem salem barra zid 3la goddem");
			fw.close();
			pw.close();
		}
		catch(IOException e) {
			
		}
		try {
			int j=0;
			FileReader fr=new FileReader("C:/Users/hamza bettaibi/Desktop/file1.txt");
			BufferedReader br=new BufferedReader(fr);
			Scanner scanner=new Scanner(System.in);
			String occ=scanner.nextLine();
			String ligne=br.readLine();
			String[] t=ligne.split(" ");
			System.out.println(ligne.toUpperCase());
			System.out.println(t.length);
			for (String string : t) {
				if(string.equals(occ)) {
					j++;
				}
			}
			System.out.println(j);
			fr.close();
			br.close();
			
		}
		catch(IOException e1) {
			
		}
	}
}
