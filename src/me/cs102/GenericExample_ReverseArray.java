package me.cs102;
import java.util.ArrayList;

public class GenericExample_ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<NYUFaculty>  sarray= new ArrayList<NYUFaculty>();
       sarray.add(new NYUFaculty("abc","123"));
       sarray.add(new NYUFaculty("def","456"));
       sarray.add(new NYUFaculty("ghi","789"));
        printarray(sarray);
        sarray=reverse(sarray);
        printarray(sarray);
	}
	
	public static   <A> ArrayList<A> reverse( ArrayList<A>   inarray) {
		ArrayList<A>  outarray;
		outarray = new  ArrayList<A>();
		for (int i =inarray.size()-1; i>=0;i--) {
			outarray.add(inarray.get(i));
		}		
		return  outarray;
	}
	public  static <B> void printarray(ArrayList<B> inarray) {
		B element;
		for (int i =0; i < inarray.size() ; i++) {
			System.out.println(inarray.get(i).toString());;
		}
	}

}
