 import java.util.Scanner;

class poundsTokg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter a Number in Pounds:");
			double pounds = sc.nextDouble();
			double kilograms = pounds*0.454;

			System.out.println(pounds + "pound is :" +kilograms+"kilograms");
		
	}
}
