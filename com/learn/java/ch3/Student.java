
public class Student 
{
	public static void main(String args[])
	{
		int Tamil,English,Maths,Science,Social,Total,Avg, Max;
		float Percentage;
		Tamil = 98;
		English = 96;
		Maths = 93;
		Science = 87;
		Social = 83;
		Total = Tamil + English + Maths + Science + Social;
		Avg = Total/5;
		Max = 500;
		Percentage = (float)((Total/500.0) * 100);
				
		
		System.out.println("******Student Score******** ");
		System.out.println(" Overall total is :"+Max);
		System.out.println("Student total mark is :"+Total);
		System.out.println("Average mark is :"+Avg);
		System.out.println("Scored Perecentage is :"+Percentage);
		
		
	}

}
