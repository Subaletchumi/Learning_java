// This is a Java program which converts the value of Inches into Feet   
import java.io.*;   
class convert_InchesToFleet {   
static double Conversion_Inches_to_Feet(int Inches)   
{   
double Feet;  
Feet = inches / 12;    
System.out.printf("Value in Feet is: %.2f \n", Feet);   
return 0;   
}    
public static void main(String args [])   
{   
int Inches = 120;   
Conversion_Inches_to_Feet(Inches);   
}  
}  