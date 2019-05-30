package me.cs102;

import java.util.ArrayList;

public class StudentDeck {
	public static void main(String args[]) {
		NYUStudent a = new NYUStudent("D W","222");
		NYUStudent b = new NYUStudent("D W","333");
		NYUStudent c = new NYUStudent("D W","444");
		NYUStudent d = new NYUStudent("D W","555");
		NYUStudent e = new NYUStudent("D W","666");
		ArrayList<NYUStudent> students = new ArrayList<NYUStudent>();
		students.add(a);
		students.add(b);
		students.add(c);
		students.add(d);
		students.add(e);
		Deck<NYUStudent> studentDeck = new Deck<NYUStudent>(students);
		System.out.println(students);
		studentDeck.deck_shuffle(students);
		System.out.println(students);
	}
}
