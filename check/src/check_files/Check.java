package check_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Check {
	public static void main(String []args) {
		try {
			int nbr=0;
			Scanner scanner=new Scanner(System.in);
			String path=scanner.nextLine();
			File file=new File(path);
			if(!file.isDirectory()) {
				FileReader fr=new FileReader(path);
				BufferedReader br=new BufferedReader(fr);
				System.out.println(br.readLine());
				fr.close();
				br.close();
			}
			else {
				File[] files=file.listFiles();
				for (File file1 : files) {
					System.out.println(file1.getName());
					nbr++;
				}
				System.out.println("there is "+nbr+" files");
			}
		}
		catch(IOException e) {
			System.err.println("io err");
			
		}
	}
}
