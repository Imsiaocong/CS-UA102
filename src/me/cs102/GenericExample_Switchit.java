package me.cs102;
import java.util.ArrayList;

public class GenericExample_Switchit {

	public static void main(String[] args) {
	NYUStudent s1 = new NYUStudent("Alice","1234");
	NYUStudent s2 = new NYUStudent("Bob","5678");
	NYUStudent s3 = new NYUStudent("Carl","3456");
	NYUStudent s4 = new NYUStudent("Dan","7890");
	NYUFaculty f1 = new NYUFaculty("Ed","1111");
	NYUFaculty f2 = new NYUFaculty("Frank","2222");
	NYUFaculty f3 = new NYUFaculty("George","3333");
	NYUFaculty f4 = new NYUFaculty("Hannah","4444");
	
	ArrayList<NYUFaculty> f = new ArrayList<NYUFaculty>();
	f.add(f1);f.add(f2);f.add(f3);f.add(f4);
	printElements(f);
	f = switchit (f);
	printElements(f);
	
	ArrayList<NYUStudent> s = new ArrayList<NYUStudent>();
	s.add(s1); s.add(s2);s.add(s3); s.add(s4);
	printElements(s);
	s = switchit (s);
	printElements(s);
	}	
	
	public static <A> ArrayList<A> switchit ( ArrayList<A>   inarray) {
		ArrayList<A>  outarray= new ArrayList<A>();
	    A element1 =  inarray.get(0);
	    A element2 =  inarray.get(1);
	    outarray.add(element2);
	    outarray.add(element1);
	    for (int i = 2 ; i<inarray.size();i++) {
	    	element1 = inarray.get(i);
	    	outarray.add(element1);
	    }
	  return outarray ;
	  
	}
	
	public static <A> void printElements ( ArrayList<A>   inarray) {
		for (int i = 0 ; i<inarray.size();i++) {
	       A element = inarray.get(i);
	       System.out.println(element.toString());
	    }
	}
	
	
}
