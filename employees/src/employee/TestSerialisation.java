package employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialisation {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			FileOutputStream fo=new FileOutputStream("C:/Users/hamza bettaibi/Desktop/file1.txt");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			employee employee1=new employee("hedi","123",22,"devolaper");
			os.writeObject(employee1);
			os.close();
			fo.close();
		}
		catch(IOException e) {
			System.err.println("file not found");
		}
		try {
			FileInputStream fi=new FileInputStream("C:/Users/hamza bettaibi/Desktop/file1.txt");
			ObjectInputStream obj=new ObjectInputStream(fi);
			employee employee2=(employee)obj.readObject();
			System.out.println(employee2.tostring());
			fi.close();
			obj.close();
		}
		catch(IOException e1) {
			System.err.println("error");
		}
	}
}
