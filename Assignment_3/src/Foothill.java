import java.util.Scanner;

public class Foothill {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int height, weight;

		// find out the weight
		System.out.print( "How much do you weight in lb? ");
		weight = input.nextInt();
		// find out the height
		System.out.print( "How tall are you in inches? ");
		height = input.nextInt();
		
		// check for invalid enteries
		if (weight <= 0)
		{
			System.out.println("you have entered wrong data");
			System.exit(-1);
		}
		if (height<=0)
		{
			System.out.println("you have entered wrong data");
			System.exit(-1);
			
		}
		findBMI (weight,height);
	}
		
		 public static void findBMI (int weight, int height)
		 {
			 int feet,inches;
			 double BMI;
			 
			 //converting inches to feet
			 feet= height / 12;
			 inches= height % 12;
			 //calculating BMI
			 BMI= (weight * 703.0) / (height * height);
			 
			 System.out.print("Your weight is " + weight + " and your height is ");
			 
			 if (feet == 1)
			 {
				 System.out.print(feet + "foot," + inches + " inches.So your BMI is :" );
			 }
			 else 
			 {
				 System.out.print(feet + "feet," + inches + " inches.So your BMI is :" );
			 }
			 
			 if ((0.0 <= BMI ) && (BMI < 18.5))
			 {
				 System.out.print(BMI + " you are under weight !" );
			 }
			 else if ((18.5 <=BMI) && (BMI< 25))
			 {
				 System.out.print(BMI + " you are normal" );
			 }
			 else if (BMI >= 25)
			 {
				 System.out.print(BMI + " you are over weight !" );
			 }
			 else 
			 {
				 System.out.println("impossible to determine. Go to a doctor ;)");
			 }
		 }

		
	}
	     

