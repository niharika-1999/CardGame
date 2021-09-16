package com.bridgelabz.workshop.CardGame;
/**
 * 
 * @author Niharika Rao
 * CardGame class with suit and rank *
 */

public class CardGame {
	public final String suit;
	public final String rank;
	
	public CardGame(String suit,String rank) //Card with rank and suit
	{
		this.rank=rank;
		this.suit=suit;
	}
	public String getRank() //Gets the rank of the card
	{
		return this.rank;
	}
	public String getSuit() //Set the suit of card
	{
		return this.suit;
	}

}
	

