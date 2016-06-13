
##Resources 
https://github.com/billybobjoeaglt/Java-Projects

## Getting Started

### Basic concepts

* data types 
  * __Primitive__ (int,float,double,char,long,...)
  * __Classes__ (classes : Some data types are more complicated and contain an internal structure.  These are usually called classes.  Therefore, a class is nothing more than a fancy data type)
  
  ###### I use the term __variable__ or __object__ to refer to the memory location that holds the data. You can think of a variable or object as an entity that can take on different values as the program progresses

Variables are normally used to refer to instances of primitive data types while objects are used to refer to instances of complex data types (instances of classes).


### Casting 
``` java
 c = Double.parseDouble(s);  // convert String s to double c
   
  int ageAsInt = Integer.parseInt(ageAsString);
  
```  
##### other direction
   
   The other direction is easier. If you want to change any primitive type to String, you do it like so: 
``` java   
   s = String.valueOf(c);
   
   where c can be double, float, int, etc. It can even be an expression: 
   s = String.valueOf( 3.7/(x+y) ); // x, y assumed double
 ``` 
##### Converting between string and chars 
``` java   
   String myString;
   char myChar;
   
   myString = "Hi Mom. Hi Alan";
   myChar = myString.charAt(3);
``` 
----------------------------------------------------------------------------

if we want to make sure the user types some word or phrase, exactly?  We have to compare the entire string.  The way to do this in Java is using the equals() method. It is very simple:
``` java
   if ( userString.equals("Yes") )
      System.out.println("You typed Yes");
``` 
