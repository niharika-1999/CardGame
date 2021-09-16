package com.bridgelabz.workshop.CardGame;
import java.util.*;

public class DeckCards {
	private List<CardGame> cards;
	private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	public DeckCards() //DeckCards method to obtain unique cards 
	{
		this.cards=new ArrayList<CardGame>(52);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				cards.add(new CardGame(suits[i],ranks[j]));
			}
		}
	}
	public void shuffle()
	{
		Collections.shuffle(cards);
	}

}
