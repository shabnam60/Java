
public class myClass {
	   public static void main(String[] args) throws Exception
	   {
	      // declare the references
	      Galaxy gal1, gal2;
	      
	      // instantiate the objects
	      gal1 = new Galaxy();
	      gal2 = new Galaxy();
	      
	      // try to set the data
	      gal1.setName("X");
	      gal1.setMagnitude(100);
	      gal2.setName("Stephan's Third");
	      gal2.setMagnitude(13.2);
	      
	      // let's see what happened
	      System.out.println("Gal #1 name: " +  gal1.getName() );
	      System.out.println("Gal #1 mag: " +  gal1.getMagnitude() );
	      System.out.println("Gal #2 name: " +  gal2.getName() );
	      System.out.println("Gal #2 mag: " +  gal2.getMagnitude() );
	   }
	}

	class Galaxy
	{
	   // member data
	   private String name;
	   private double magnitude;
	      
	   // default constructor
	   Galaxy()
	   {
	      name = "undefined";
	      magnitude = 0.0;   
	   }
	  
	   // 2-parameter constructor (to be discussed)
	   Galaxy(String my_name, double my_mag)
	   {
	      if (my_name.length() > 2)
	         name = my_name;
	      else
	         name = "undefined";
	      if (my_mag >= -3 && my_mag <= 30)
	         magnitude = my_mag;
	      else
	         magnitude = 0.0;   
	   }
	   
	   // accessor "set" method -------------------------------
	   public boolean setMagnitude(double mag)
	   {
	      if (mag < -3 || mag > 30)
	         return false;
	      // else
	      magnitude = mag;
	      return true; 
	   }

	   public boolean setName(String theName)
	   {
	      if (theName == null || theName.length() < 2)
	         return false;
	      // else we fall through
	      name = theName;
	      return true;
	   }

	   // accessor "get" methods --------------------------------
	   public String getName()
	   {
	     return name;
	   }
	   public double getMagnitude()
	   {
	      return magnitude;
	   }
	}




