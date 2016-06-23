
public class Foothill 
{
   public static void main(String[] args)
   {             
	//int answer1 ,answer2,answer3,answer4,num1,num2,num3,num4 ;
     System.out.println ("What n is \t"+ "Problem1 \t"+"Problem2 \t"+"Problem3 \t"+"Problem4 \t");
     printer(3);
    printer(6);
    printer(11);
   }
   public static void printer(int n)
   { 
	   int probAns1,probAns2,probAns3,probAns4;
	   probAns1 = problem1(n);
	   probAns2 = problem2(n);
	   probAns3 = problem3(n);
	   probAns4 = problem4(n);
	   System.out.println("n="+ n +"\t \t" + probAns1 + "\t \t" + probAns2 +  "\t \t" + probAns3 +" \t \t "+probAns4);
			   
   }
   public static int problem1(int enteredNumber)
   {
	   int answer1=0;
	   if (enteredNumber==3)
	   {
		   answer1 = 2+3+(enteredNumber +1);
		   
	   }
	   else if(enteredNumber==6)
	   {
		   answer1 =2+3+4+5+6+(enteredNumber +1);            
		   
	   }
	   else if(enteredNumber==11)
	   {
		   answer1=1+2+3+4+5+6+7+8+9+10+11+ (enteredNumber+1);
		   
	   }
	   return answer1;
   }
   public static int problem2(int enteredNumber)
   {
	   int answer2=0;
	   if (enteredNumber==3)
	   {
		   answer2 = ((enteredNumber +1)*(enteredNumber +2)/2)-7;
		   
	   }
	   else if(enteredNumber==6)
	   {
		   answer2 =((enteredNumber +1)*(enteredNumber +2)/2)-7;         
		   
	   }
	   else if(enteredNumber==11)
	   {
		   answer2=((enteredNumber +1)*(enteredNumber +2)/2)-7;
		   
	   }
	   return answer2;
   }
   public static int problem3(int enteredNumber)
   {
	   int answer3=0;
	   if (enteredNumber==3)
	   {
		   answer3 = 3 + (2 * enteredNumber - 1);
		   
	   }
	   else if(enteredNumber==6)
	   {
		   answer3 = 3 + 5 + 7 + 9 + (2 * enteredNumber - 1);        
		   
	   }
	   else if(enteredNumber==11)
	   {
		   answer3= 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 + (2 * enteredNumber - 1);
		   
	   }
	   return answer3;
   }
   public static int problem4(int enteredNumber)
   {
	   int answer4=0;
	   if (enteredNumber==3)
	   {
		   answer4 = enteredNumber * enteredNumber * enteredNumber ;
		   
	   }
	   else if(enteredNumber==6)
	   {
		   answer4 = enteredNumber * enteredNumber * enteredNumber ;       
		   
	   }
	   else if(enteredNumber==11)
	   {
		   answer4= enteredNumber * enteredNumber * enteredNumber ;
		   
	   }
	   return answer4;
   }
   
   
}
