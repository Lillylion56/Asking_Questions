import java.util.*;

public class Asking_Questions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);		//creates a Scanner object to allow user input.
		
		System.out.print("How old are you? ");		//Prompting user to enter their age.
		int age = keyboard.nextInt();
		
		System.out.print("How tall are you? ");		//Asking user how tall they are.
		String height = keyboard.nextLine();
		
		System.out.print("How much do you weigh? ");	//Asking for user's weight.
		double weight = keyboard.nextDouble();
		
		//Should print out Age, height, and weight in a sentence.
		System.out.println("So you're " + age + " year(s) old, " + height + ", and weigh " + weight + " lbs.");
	}//end of main method
}//end of Asking_Questions
