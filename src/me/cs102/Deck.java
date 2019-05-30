package me.cs102;

import java.util.ArrayList;
import java.util.Collections;

public class Deck <A> {
	ArrayList<A> students;
	public Deck(ArrayList<A> sstudent) {
		students = sstudent;
	}
	
	public ArrayList<A> deck_shuffle(ArrayList<A> lst) {
		ArrayList<A> lst_new = new ArrayList<A>();
		Collections.shuffle(lst_new);
		return lst_new;
	}
	
}