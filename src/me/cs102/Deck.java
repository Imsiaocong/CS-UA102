package me.cs102;

import java.util.ArrayList;
import java.util.Collections;

public class Deck <A> {
	//private Random shuffle = new Random();
	static ArrayList<NYUStudent> students = new ArrayList<NYUStudent>();
	public static void createItem(String sname, String sid) {
		NYUStudent student = new NYUStudent(sname,sid);
		students.add(student);
	}
	
	public static void main(String[] args) {
		createItem("Di Wang", "666");
		createItem("Di Wang2", "777");
		createItem("Di Wang3", "888");
		createItem("Di Wang4", "999");
		createItem("Di Wang5", "000");
		System.out.println(students);
		Collections.shuffle(students);
		System.out.println(students);
	}
}
