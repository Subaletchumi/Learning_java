import java.util.Scanner;
public class GeoMetricalCalculations  // A - Area C - circle R - Rectangle
{
	
	public static void findAreaofSquare() //User defeined method
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for a");
		a = sc.nextInt();
		b = a * a;
		System.out.println("Area of square "+b);
	}
	
	public static void findAreaofCircle() //User defeined method
	{
	    int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
	}
	
	public static void findAreaofRectangle() //User defeined method
	{
		int a,w,l; // formaula is A=w*l
		w = 6;
		l = 9;
		a = w * l;
		System.out.println("Area of Rectangle is "+a);
	}
	
	
	
	public static void main(String args[])
	{
		
        findAreaofSquare();	//Method calling
		findAreaofCircle();
		findAreaofRectangle();
	}
	
	
} 

// Static - Without call object name it will work