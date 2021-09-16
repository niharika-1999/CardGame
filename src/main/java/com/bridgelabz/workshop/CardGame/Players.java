package com.bridgelabz.workshop.CardGame;
import java.util.*;

class player
{
	public player()
	{
		ArrayList<CardGame> player=new ArrayList<CardGame>(9);
	}
}

public class Players {
	public static int numPlayers;
	public Players(int numPlayers)
	{
		DeckCards cards=new DeckCards();
		ArrayList<player> players=new ArrayList<player>(numPlayers);
	}



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
	}
}


