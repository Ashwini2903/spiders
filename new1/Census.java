import java.util.*;
class Census 
{
	public static void main(String[] args) 
	{
		Long currPop = 312032486l;
		final Long seconds = (365*24*60*60)*5l;
		Long birth = seconds/7;
		Long death = seconds/13;
		Long imm = seconds/45;

		Long newPop = currPop+birth-death+imm;
		System.out.println("Currrent Population is"+ currPop);
		System.out.println("New Population is"+ newPop);
	}
}
 