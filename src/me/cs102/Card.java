package me.cs102;

public class Card {
	String suit = new String();
	int value;
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
}
