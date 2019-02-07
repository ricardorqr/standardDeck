package com.standardDeck;

import java.util.List;

import com.standardDeck.model.Card;
import com.standardDeck.service.Deck;
import com.standardDeck.service.Shuffle;
import com.standardDeck.service.Sort;

public class Main {
	
	public static void main(String[] args) {
		List<Card> deck1 = new Deck().getDeck();
		Shuffle.shuffle(deck1).stream().forEach(System.out::println);
		
		System.out.println();
		
		List<Card> deck2 = new Deck().getDeck();
		Sort.sortSuit(deck2).stream().forEach(System.out::println);
		
		System.out.println();
		
		List<Card> deck3 = new Deck().getDeck();
		Sort.sortRank(deck3).stream().forEach(System.out::println);
	}

}
