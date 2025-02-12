import java.util.*;
import java.util.Scanner;
class Circle 
{
	public static void main(String[] args) 
	{
		int radius;
		double pi = 22/7;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius = sc.nextInt();
		area = pi*radius*radius;
		System.out.println("Area of circle:" +area);
	}
}
