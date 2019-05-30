package me.cs102;

import java.util.*;

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
		
		/*
		String[] strs = new String[] {"a","b","c","d","e"};
		ArrayList<String> suits = new ArrayList<String> ();
		for (int j = 0; j < 5; j++) {
			suits.add(strs[j]);
		}
		int[] values = new int[] {1,2,3,4,5};
		ArrayList<Integer> vals = new ArrayList<Integer>();
		for (int x = 0; x < 5; x++) {
			vals.add(values[x]);
		}
		
		Collections.shuffle(suits);
		Collections.shuffle(vals);
		
		String[] s = (String[]) suits.toArray();
		Object[] v    = vals.toArray();
		*/
		String[] strs = new String[] {"a","b","c","d","e"};
		int[] values = new int[] {1,2,3,4,5};
		ArrayList<Card> cards = new ArrayList<Card>();
		for (int i = 0; i < 5; i++) {
			cards.add(new Card(strs[i], values[i]));
		}
		///System.out.println(cards);
		Deck<Card> card_deck = new Deck<Card>(cards);
		System.out.println(cards.toString());
		card_deck.deck_shuffle(cards);
		System.out.println(cards.toString());
	}
}
