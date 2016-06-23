import java.util.Scanner;

public class Foothill {
	
	public static void main(String[] args)
	{
		showIntro();
		getInputAndMorgageCalc();
		sayBye();
		
	}
	public static void showIntro()
	{
		String instructions = "The following program will calculate the"+ 
							"monthly payment  required for a loan of D dollars"+ 
							"over a period of Y years at an annual interest rate of %R." ;
		System.out.println(instructions);
		System.out.println("----------------------------------------------");
	}
	
	public static void getInputAndMorgageCalc()
	{
		Scanner input = new Scanner(System.in);
		double loanAmt, rate , numYr ,monthlyRate,monthlyPay,temp ,numMonth;
		String userRes;
		
		System.out.println("Enter amount of the loan. (only use numbers,"+ 
							"please, no commas or characters like '$' \n" + "Your load amount :");
		userRes = input.nextLine() ;
		loanAmt = Double.parseDouble(userRes);
		
		System.out.println("\n Now enter the interest rate (If the quoted rate is "
         + " 6.5%, \nfor example, enter 6.5 without the %.)\n"
         + "Your annual interest rate: \n "+ "Your annual interest rate :");
		userRes = input.nextLine() ;
		rate = Double.parseDouble(userRes);
		
		System.out.println("\n Enter term of the loan in years: ");
				userRes = input.nextLine() ;
				numYr = Double.parseDouble(userRes);
				
		numMonth = (numYr* 12) ;
		monthlyRate = rate /( 100*12) ;
		
		temp =  Math.pow((1+monthlyRate),numMonth);
		System.out.println("" + temp);
		monthlyPay = loanAmt * (monthlyRate*temp) / (temp - 1);
		
		System.out.println("\n your monthly payment would be : " + String.format( "%.2f" ,monthlyPay));
		
		
	}
	public static void sayBye ()
	{
		System.out.println("\n Thanks for usng my stupid prog !! Bye ");
	}

}
