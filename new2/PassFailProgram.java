import java.util.Scanner;
class  PassFailProgram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the marks scored by user")

			float marks = 457f;
			 float total = 600f;
			 float percent = (marks/total)*100;
			 String result = (percent>=35||percent<=35)?("you are pass"):("you are fail");
				 System.out.println(result);
	}
}
