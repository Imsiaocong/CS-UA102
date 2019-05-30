package me.cs102;

import java.util.*;

public class Deck <A> {
	ArrayList<A> lst;
	public Deck(ArrayList<A> llsstt) {
		lst = llsstt;
	}
	
	public ArrayList<A> deck_shuffle(ArrayList<A> lst_) {
		ArrayList<A> lst_new = new ArrayList<A>();
		Collections.shuffle(lst_);
		return lst_new;
	}
	
}