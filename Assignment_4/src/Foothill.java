import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;

public class Foothill {
	
	public static void main(String[] args)
	{
		boolean keepRunning;
		int bar,moneyOwed,barsEaten,barsBought;
		String userChoice;
		Scanner inputScanner = new Scanner(System.in);
		Scanner menuInput = new Scanner(System.in);
		
		moneyOwed = 15;
		bar = 15;
		keepRunning = true;
		
		System.out.println("You have " + bar + " bars and owe $" + moneyOwed);
	      while (keepRunning)
	      {
	         // Print options
	         System.out.println("[A] Show available capacity for the current month");
	         System.out.println("[B] Show bill and start a new month");
	         System.out.println("[C] Consume bars now");
	         System.out.println("[P] Purchase additional bars for the current month");
	         System.out.println("[Q] Show final bill and quit");
	         System.out.print(">");
	         // Convert take the input's first letter and convert it to upper case
	         userChoice = menuInput.nextLine();
	         Character.toUpperCase(userChoice.charAt(0));
	         
	         if (Character.toUpperCase(userChoice.charAt(0)) == 'Q')
	         {
	        	 System.out.println("You have " + bar + " bars and owe $" + moneyOwed);
	               // Break while loop
	               keepRunning = false;
	               break;
	         }
	         
	         if (Character.toUpperCase(userChoice.charAt(0)) == 'A')
	         {
	        	 System.out.println("available capacity for the current month is : " + bar);
	        	 continue;
	         }
	         else if (Character.toUpperCase(userChoice.charAt(0)) == 'B')
	         {
	        	 System.out.println("available capacity for the current month is : " + moneyOwed);
	        	 bar += 15 ;
	        	 moneyOwed += 15;
	        	 continue;
	         }
	         else if (Character.toUpperCase(userChoice.charAt(0)) == 'C')
	         {
	        	 
	        	 System.out.println("how many bars would you like to eat ? (1-10) : " + bar);
	        	 barsEaten = inputScanner.nextInt();
	        	 if (barsEaten <=0 || barsEaten >10)
	        	 {
	        		 
	        	 }
	         }
	         else if (Character.toUpperCase(userChoice.charAt(0)) == 'P')
	         {
	        	 System.out.println("How many bars would you like to purchase ( 1-10) ?");
	        	 barsBought = inputScanner.nextInt();
	        	 if ( barsBought > 0 || barsBought <= 30)
	        	 {
	        		 bar += barsBought;
	        		 moneyOwed += 11;
	        	 }
	        	 else 
	        	 {
	        		 
	        	 }
	         
	
}
}
}


		 

