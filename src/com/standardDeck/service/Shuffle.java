package com.standardDeck.service;

import java.util.List;

import com.standardDeck.model.Card;

public class Shuffle {

	public static List<Card> shuffle(List<Card> deck) {
		int n = deck.size();

		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i)); // pick up a randon number between 0-52, 1-52, 2-52...
			Card temp = deck.get(r);
			deck.set(r, deck.get(i));
			deck.set(i, temp);
		}

		return deck;
	}

}
