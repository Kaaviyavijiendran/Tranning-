package trainee.chainsys.java;

import java.util.Scanner;

public class CricketTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cricket = new Scanner(System.in);
		System.out.println("Enter your team1 name: ");
		String name1 = cricket.next();
		System.out.println("Enter a team2 name: ");
		String name2 = cricket.next();
		System.out.println("Enter your team1 score: ");
		int score = cricket.nextInt();
		

		int team2score;
		team2score = 165;
		
		

		if(score>165)
		{
			System.out.println("You won the match ");
		}
		else
		{
			System.out.println("You lose the match");
			}
	}

}
