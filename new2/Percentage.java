import java.util.Scanner;
class  Percentage
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter the marks scored by user")

			float marks = 457f;
			 float total = 600f;
			 float percent = (marks*100)/total; 
			 String result = (percent>=35||percent<=35)?("you are pass"):("you are fail");
				 System.out.println(result);
	}
}
