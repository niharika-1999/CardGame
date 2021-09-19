package com.bridgelabz.workshop.CardGame;
import java.util.*;

public class CardMain {
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
			add.sequencePlayer();
			add.distributeCard();
		}
	}



