package com.standardDeck;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.standardDeck.model.Card;
import com.standardDeck.model.Rank;
import com.standardDeck.model.Suit;
import com.standardDeck.service.Deck;
import com.standardDeck.service.Shuffle;

public class MainTest {

	private List<Card> deckSample = null;
	private Card card = null;

	@Before
	public void setUp() {
		deckSample = new ArrayList<Card>();

		for (Rank rank : Rank.values()) {
			card = new Card(Suit.CLUBS, rank);
			deckSample.add(card);
		}
	}

	@Test
	public void testShuffleDeck() {
		List<Card> deck = Shuffle.shuffle(new Deck().getDeck());

		assertThat(deck.size(), is(52));
		assertThat(deck, hasItems(
				new Card(Suit.CLUBS, Rank.ACES), 
				new Card(Suit.CLUBS, Rank.TWO),
				new Card(Suit.CLUBS, Rank.THREE), 
				new Card(Suit.CLUBS, Rank.FOUR), 
				new Card(Suit.CLUBS, Rank.FIVE),
				new Card(Suit.CLUBS, Rank.SIX), 
				new Card(Suit.CLUBS, Rank.SEVEN), 
				new Card(Suit.CLUBS, Rank.EIGHT),
				new Card(Suit.CLUBS, Rank.NINE), 
				new Card(Suit.CLUBS, Rank.TEM), 
				new Card(Suit.CLUBS, Rank.JACK),
				new Card(Suit.CLUBS, Rank.QUEEN), 
				new Card(Suit.CLUBS, Rank.KING)));
	}

}
