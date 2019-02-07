package com.standardDeck.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.standardDeck.model.Card;
import com.standardDeck.model.Rank;
import com.standardDeck.model.Suit;

public class Sort {

	public static List<Card> sortSuit(List<Card> deck) {
		deck = new ArrayList<Card>();

		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}

		return deck;
	}

	public static List<Card> sortRank(List<Card> deck) {
		deck.sort(Comparator.comparing(Card::getRank));
		return deck;
	}

}
