class ByteandInt {
	public static void main(String[] args)
	{
      //************* Byte to INt convertion**********************
		// byte value
		byte a = 17;

		// wrapping the byte value
		// in the wrapper class Byte
		Byte b = new Byte(a);

		// intValue of the Byte Object
		int output = b.intValue();

		
		System.out.println("Integer value of "+ a + " is : " + output); 
		
		
		// ***************************Int to Byte conversion*****************
		
	       Integer c = new Integer(34);
 
        // Converting integer number to byte value
        // using byteValue() method
        byte d = c.byteValue();
 
        // Printing the corresponding byte value
        System.out.println("Byte value is "+d);
	}
}

public class FloatCon {
	//********** int to float **************
	public static void main(String args[])
	{  
        int i = 10;  
        float f1 = i;  
        System.out.println("int value: " + i);  
        System.out.println("Converted float value: " + f1);  
        
      // *************Float to int *************
        int number;  
        float fval = 32.33f;  
        number = (int) fval;  
        System.out.println("float value: "+fval);
        System.out.println("Converted int value: "+number);
    } 

}
public class longtoint {  
	public static void main(String args[])
	{  
		//************* Long to int ****************
		long l=500;  
		int i=(int)l;  
		System.out.println("Long to Integer value is :"+i);  
		
		//************ Int to Long ****************
		
		int a=400;
		long b=(long)a;
		System.out.println("Integer to long value is :"+b);  

		}
} 

import java.lang.*;  
  
  
public class FloattoDouble {  
   
  public static void main(String[] args) {  
       //********* Float to double ************
       
	  float float_obj = 55.055F;  
   
        Float float_obj1= new Float(float_obj);  
  
        //widening the float object  
        double sc= float_obj1.doubleValue();  
  
        System.out.println("Float to double  value is = "+sc);  
        
        // *************Double to float***************
        
        Double d = new Double(23);
        
        // Typecasting the value using
        // floatValue() method of Double class
        float output = d.floatValue();
 
        // Printing the double value on console
        System.out.println("Double to float value is :"+output);
        
    }  
} 
public class IntToDoubleExample1
{  
public static void main(String args[])
// ******** Int to Double **************
{  
int i=200;  
double d=i;  
System.out.println("Int to double value is "+d);  

// ******* Double to Int***********

// Get the double value
double data = 3452.345;
System.out.println("Double - " + data);

// convert into int
int value = (int)data;

// print the int value
System.out.println("Integer - " + value);
}
}  

public class IntToDoubleExample1
{  
public static void main(String args[])
// ******** Int to Double **************
{  
int i=200;  
double d=i;  
System.out.println("Int to double value is "+d);  

// ******* Double to Int***********

// Get the double value
double data = 3452.345;
System.out.println("Double - " + data);

// convert into int
int value = (int)data;

// print the int value
System.out.println("Integer - " + value);
}
}  

public class IntToDoubleExample1
{  
public static void main(String args[])
// ******** Int to Double **************
{  
int i=200;  
double d=i;  
System.out.println("Int to double value is "+d);  

// ******* Double to Int***********

// Get the double value
double data = 3452.345;
System.out.println("Double - " + data);

// convert into int
int value = (int)data;

// print the int value
System.out.println("Integer - " + value);
}
}  

public class ChartoString
{  
public static void main(String args[])
{  
	// Java program for convert char to string
char c='S';  
String s=String.valueOf(c);  
System.out.println("String is: "+s); 


   // Java program for convert string to char
String a = "Chennai";
char b = a.charAt(2);
System.out.println("Second value is :"+b );
}
} 