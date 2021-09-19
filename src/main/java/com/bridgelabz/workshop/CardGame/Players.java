package com.bridgelabz.workshop.CardGame;
import java.util.*;

/**Player with 9 cards and class to store
 * total players with cards
 * 
 *
 */
class player
{
	private ArrayList<CardGame> playerCards;
	public player()
	{
		playerCards=new ArrayList<CardGame>(9);
	}
	
	public List<CardGame> getplayerCards()
	{
		return this.playerCards;
	}
	
	public void setPlayerCards(CardGame card)
	{
		this.playerCards.add(card);
	}
}

//Players method to initialize the number of players
public class Players {           
	public int numPlayers;
	private static ArrayList<player> play;
	private ArrayList<Integer> sequence;
	private DeckCards deck;
	
	public Players(int numPlayers)
	{
		this.numPlayers=numPlayers;
		deck=new DeckCards();
		play=new ArrayList<player>(numPlayers);
		for(int i=0;i<numPlayers;i++)
			play.add(new player());
	}

	public void sequencePlayer()//Method to sequence the order of the players
	{
		sequence=new ArrayList<Integer>(numPlayers);
		for(int i=0;i<numPlayers;i++)
			sequence.add(i);
		Collections.shuffle(sequence);
	}
	
	public void distributeCard()//Method to distribute the cards to players after shuffling
	{
		deck.shuffle();
		ArrayList<CardGame> card=deck.getCards();
		Random random = new Random();
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<numPlayers;j++)
			{
				player seq=play.get(sequence.get(j));
				int x=random.nextInt(card.size());
				seq.setPlayerCards(card.get(x));
				card.remove(x);
			}
		}
	}
	
	public void verify()//Method to verify the different cards with player
	{
		for(player check :play)
		{
			List<CardGame> p = check.getplayerCards();
			int spade=0,heart=0,diamond=0,club=0;
			for(CardGame i:p)
			{
				String j = i.getSuit();
				switch(j)
				{
				case "Spades":spade++;
				break;
				case "Diamonds":diamond++;
				break;
				case "Hearts":heart++;
				break;
				case "Clubs":club++;
				break;
				
				}
			}
			System.out.println("check:"+play.indexOf(play));
			System.out.println("Clubs:" +club);
			System.out.println("Diamonds:" +diamond);
			System.out.println("Hearts:" +heart);
			System.out.println("Spades:" +spade);
		}
	}
}
	

	






	

