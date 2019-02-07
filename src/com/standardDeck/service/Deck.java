package com.standardDeck.service;

import java.util.ArrayList;
import java.util.List;

import com.standardDeck.model.Card;
import com.standardDeck.model.Rank;
import com.standardDeck.model.Suit;

public class Deck {
	
	List<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>();

		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new Card(suit, rank));
			}
		}
	}
	
	public List<Card> getDeck() {
		return deck;
	}
	
}
