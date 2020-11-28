//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 8; Working with the switch statement and for loops
//Write a code that displays the contents of the astrises half Christmas tree
//04-08-2014
import java.util.Scanner;


public class Full_XmasTree {

	public static void main(String[] args) {

		// initialize variables
		int numberOfRows = 0;
		String asterix = "* ";
		String emptySpace = " ";

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the amount of rows you would like: ");

		numberOfRows = userInput.nextInt();

		for (int row = 0; row <= numberOfRows; row++)
		{			
			for (int numberOfWhiteSpace = 0; numberOfWhiteSpace <= numberOfRows - row; numberOfWhiteSpace++)
			{
				System.out.print(emptySpace);
			}
			for (int numberOfAsterix = 0; numberOfAsterix < row; numberOfAsterix++)
			{
				System.out.print(asterix);
			}						
			System.out.println();

		}

		userInput.close();
	}

}
