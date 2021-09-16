package com.bridgelabz.workshop.CardGame;
import java.util.*;

//Player with 9 cards
class player
{
	public player()
	{
		ArrayList<CardGame> player=new ArrayList<CardGame>(9);
	}
}

//Players method to initialize the number of players
public class Players {           
	public static int numPlayers;
	public Players(int numPlayers)
	{
		DeckCards cards=new DeckCards();
		ArrayList<player> players=new ArrayList<player>(numPlayers);
	}
	
	public static void sequencePlayer()
	{
		ArrayList<Integer> sequence=new ArrayList<Integer>(numPlayers);
		for(int i=0;i<numPlayers;i++)
			sequence.add(i);
		Collections.shuffle(sequence);
	}


    //Main method
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of players");
		num=sc.nextInt();
		if(num<2||num>4)
		{
			System.out.println("Enter the number of players more than 2 to max 4");
			num=sc.nextInt();
		}
		sc.close();
		Players add=new Players(num);
		Players.sequencePlayer();
	}
}


