package me.cs102;

@SuppressWarnings({"unchecked"})
public class GenericClass_Pair {
	
	public static void main(String[] args) {
		System.out.println("Hdd");
		Pair<String, Double>  a = new Pair<String, Double>("Dg",3.4);
		System.out.println(a.toString());
		Pair<Integer, Double>  b = new Pair<Integer, Double>(4,3.4);
		System.out.println(b.toString());
	}
	 
}


 