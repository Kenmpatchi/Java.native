package country;

import java.util.LinkedList;

public class Main {
public static void main(String[]args) {
	LinkedList<String> country=new LinkedList<String>();
	country.add("egypt");
	country.add("libya");
	country.addFirst("tunisie");
	country.addLast("France");
	System.out.println(country);
	System.out.println(country.indexOf("egypt")+1);
	country.set(1, "palestine");
	System.out.println(country);
	country.clear();
	System.out.println(country);
}
}
