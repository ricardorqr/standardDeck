package com.standardDeck.model;

public enum Rank {

	ACES(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NONE(9), TEM(10), JACK(11), QUEEN(12), KING(13);
	
	private final int rank;
	
	private Rank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}
	
}
