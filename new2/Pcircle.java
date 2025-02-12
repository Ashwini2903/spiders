import java.util.*;
import java.util.Scanner;
class Pcircle 
{
	public static void main(String[] args) 
	{
		int radius;
		double pi = 22/7;
		double perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius = sc.nextInt();
		perimeter = 2*pi*radius;
		System.out.println("Perimeter of circle:" +perimeter);
	}
}
