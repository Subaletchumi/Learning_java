import java.util.*;

public class DollarstoRupees {
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Amount in USD: ");
        double USD = sc.nextDouble();
        
        double INR = 74.42 * USD;
        
        System.out.println(""+USD+" USD in INR is equal to Rs "+INR);
        
        
        
		float rupees;
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter rupees:");

		rupees = in.nextLong();

		float dollars = rupees / 64;

		System.out.println(dollars + " Dollars");
    }}
