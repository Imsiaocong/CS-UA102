package me.cs102;
import javax.swing.JOptionPane;

public class GenericExample_Compare {
	public static void main(String[] args) {
	float y=4.0F;
	double d=4.0;
	int x = 4;
	String z  = "4.0";
	System.out.println(valueCompare(x,y));
	System.out.println(valueCompare(d,y));
	System.out.println(valueCompare(d,z));
	System.out.println(valueCompare(x,z));
	}
	
	public static <E,F> boolean valueCompare (E  value1 , F value2) {;
	
	if (value1.toString().equals(value2.toString())) { return true;}
		 return false;
	}
}
 
