import java.io.*;   
class convert_MetertoCM {   
static double Conversion_meter_to_cm(int meter)   
{   
double centimeter;  
centimeter  = 100 * meter;    
System.out.printf("Value in Centimeter is: %.2f \n", centimeter);   
return 0;   
}    
public static void main(String args [])   
{   
int meter = 20;   
Conversion_meter_to_cm(meter);   
}  
}  