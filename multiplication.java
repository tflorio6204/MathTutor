package math;

import java.util.Scanner;
import java.util.Random;

public class multiplication 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Random increment = new Random();
		String response = "y";
		int levelCount = 0;
		int percentCount = 0;
		String str = "cat";
		
		System.out.println("Welcome to Tommy's Math Lab. You will be testing your knowledge in 5 Levels: Addiction/Subtraction, Multiplication/Division, Square Roots, Exponents, Factorials, and Logs!");
		System.out.println();
		System.out.println("Press enter to continue: ");
		in.nextLine();
		System.out.println();
		System.out.print("The levels get harder as you progress. You can quit whenever you want. Are you ready to practice different forms of math? Enter y/n: ");
	
		while(response.equalsIgnoreCase("y"))
		{
			if(in.nextLine().equalsIgnoreCase("n"))
			{
				break;
			}
			System.out.println();
			System.out.print("Please enter a number to test your addition skills! ");
			int num = in.nextInt();
			int correctCount = 0;
			for(int i = 1; i < 51; i += increment.nextInt(20))
			{
				System.out.println();
				System.out.print("What is " + num + " plus " + i + "? ");
				int sum = in.nextInt();
				int answer = i + num;
				if(sum == answer)
				{
					correctCount++;
					System.out.println("Nice job! Correct!");
				}
				else
				{
					while(sum != answer)
					{
						System.out.println("Not quite! Try again. What is " + num + " plus " + i + "?");
						sum = in.nextInt();
					}
					System.out.println("Nice job! Correct!");
				}
			}
			if(correctCount/10 == 1)
			{
				percentCount++;
			}
			System.out.println();
			System.out.println("You got through them all. Practice makes perfect! You got " + correctCount + " correct on the first try!");
			System.out.println();
			if(percentCount == 3)
			{
				System.out.println("You've mastered the addition portion! Time to try the sublevel: subtraction.");
				break;
			}
			System.out.print("Would you like to try again? Enter y/n: ");
			response = in.next();
			if(response.equalsIgnoreCase("y"))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.println();
		System.out.println("Hit the books!");
	}
}