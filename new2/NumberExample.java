import java.util.Scanner;
class NumberExample
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number :");
		// num is initi
		int num = new Scanner(System.in).nextInt();//123
		int dup = num;
		int sum = 0 ;//3
		// 0>0 -> false 
		while(num>0)
		{
			int rem = num%10; //last digit
			sum+=rem; // 5+1 ->6
			num/=10;
		}
			System.out.println(sum);
			System.out.println(dup);
	
	}
}
