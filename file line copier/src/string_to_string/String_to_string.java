package string_to_string;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class String_to_string {
	public static void main(String [] args) {
		try {
			FileReader fr=new FileReader("C:/Users/hamza bettaibi/Desktop/fichier1.txt");
			BufferedReader br=new BufferedReader(fr);
			
			Scanner s=new Scanner(System.in);
			String b=s.nextLine();
			System.out.println(b);
			FileWriter fw=new FileWriter("C:/Users/hamza bettaibi/Desktop/fichier2.txt");
			PrintWriter pw=new PrintWriter(fw);
			
			String ligne=br.readLine();
				pw.write(ligne);
				System.out.println(ligne);
			
			fr.close();
			fw.close();
		}
		catch(IOException e){
			System.err.println(e.getMessage());
			
		}
	}

}
