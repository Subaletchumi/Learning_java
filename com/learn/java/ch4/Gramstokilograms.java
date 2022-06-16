import java.util.Scanner;

public class Gramstokilograms {

	public static void main(String[] args) {

		double grams;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter grams:");
		grams = in.nextDouble();

		double kilograms = grams / 1000;
		System.out.println(kilograms + " Kilograms");
		
		double kgs;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter kilograms:");
		kilograms = in.nextDouble();

		double grms = kilograms * 1000;
		System.out.println(grams + " Grms");
	}
}
