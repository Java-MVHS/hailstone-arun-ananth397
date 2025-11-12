// Ananth Arun
// Date: 11/7/25
// Hailstone.java
// This program outputs the Hailstone Sequence for input numbers 1-10000
// Working On: Loops, if-else
/// Testing Plan: Test 10: numbers 5, 16, 8, 4, 2, 1 
/// Testing Plan: Test 20: numbers 10, 5, 16, 8, 4, 2, 1
import java.util.Scanner;
public class Hailstone 
{
	//Declare FV's, counter to tally the iterations of the loop in printSequence
	// - and inputNum, which is inputted in once and is modified every time the loop
	// - runs.
	
	private int counter;
	private int inputNum;
	
	public Hailstone()
	{
		counter = 0;
		inputNum = 0;
	}
	
	public static void main (String[] args)
	{
		Hailstone sequence = new Hailstone();
		sequence.findIt();
	}
	// doWhile loops runs the big picture: calls all the methods, which in turn 
	// have their own loops, and runs them in sequence until the user input 
	// ends the program. 
	public void findIt()
	{
		do 
		{
		  getInput();
		 
		  
		  if (inputNum >= 1 && inputNum <= 10000)
		  {
			  printSequence();
			  
		  }
		  printOut();
		  counter = 0;
		  
		} while (inputNum != -1);
		blankLines();
	}
	// This method gets the input of the user and initializes it to the FV inputNum
	// no matter what. This number is actually checked for validity in the previous 
	// method findIt.
	public void getInput()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("\n\n\n");
		System.out.print("Enter a positive integer (1-10000). To quit, enter -1: -> ");
		inputNum = kb.nextInt();
	}
	//This method actually manipulates the inputNum in accordance with the rules
	// of the Hailstone sequence, as well as printing the sequence, as the name 
	// suggests. 
	public void printSequence()
	{
		System.out.println();
		do 
		{
			counter++;
			//System.out.println(counter);
			
			System.out.printf("%8d", inputNum);
			
			if (counter % 10 == 0)
				System.out.printf("%n");
				
			/*if (counter % 10 != 0)
				System.out.printf("%6d", inputNum);
			else if (counter %10 == 0 && counter != 0)
			{
				System.out.printf("%n%6d", inputNum);
			}

			*/
			if (inputNum % 2 == 0)
				inputNum /= 2;
			else 
				inputNum = inputNum*3 + 1;
		
			
			
		} while (inputNum != 1);
		System.out.printf("%6d%n", inputNum);
		counter+=1;
		
	}	
	// This method prints out the thank you message if the program has ended
	// or tells the user to enter a better input. 
	public void printOut()
	{
		if (inputNum == -1)
		{
			System.out.println("\nThank you for playing Hailstone.");
		}
		else if (inputNum < 1 || inputNum > 10000)
		{

			System.out.println("\n\nEnter a value within the range, please!");
		}
		else 
			System.out.println("\nThe loop executed " +counter+" times.");
		
			
	}
	public void blankLines()
	{
		System.out.println("\n\n\n");
	}	
}
