import java.util.Scanner;
class CharTONumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the column");
		String column = sc.next().toUpperCase();
		int result=0;

		for(char ch : column.toCharArray())
		{
			result = result*26+(ch-'A'+1);
		}
		System.out.println("Number" + result);
	}
}
