/*
	Johan Pena
	01-19-2020
	Array Example Class
*/
import java.util.Scanner;

public class ArrayExample
{
	public static void main(String[] args)
	{
		int userPick = 0;	// Used to get user's number.
		int i = 0;			// Counter loop to promt user.

		// Create an single array of intagers.
		int[] accountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
								 8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
								 1005231, 6545231, 3852085, 7576651, 7881200, 458100};

		// Loop to keep user guessing.
		while(i == 0)
		{
			// Create an instance of the Scanner class, to get keyboard information.
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter number: "); //Promt user.
			userPick = keyboard.nextInt();

			if(checkNumbers(userPick, accountNumbers))
				System.out.println("Number matches.");
			else
				System.out.println("Number does not match.");

			System.out.println("Hit 0(zero) to continue.");
			i = keyboard.nextInt();
		}
	}

	// This method checks the numbers.
	public static boolean checkNumbers(int userPick, int[] accountNumbers)
	{
		// For each loop to go through the array.
		for(int var: accountNumbers)
		{
			// If there is a match return true.
			if(var == userPick)
				return true;
		}

		// If not match is found return false.
		return false;
	}
}