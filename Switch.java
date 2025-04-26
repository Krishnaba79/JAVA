import java.util.Scanner;
public class Switch
{
	public static void main(String[] args)
	{
 		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		String monthString;
 		switch(month)
 		{
 			case 1: monthString="January";
      			break;
			 case 2: monthString="February";
     				 break;
 			case 3: monthString="March";
     				 break;
 			case 4: monthString="april";
     				 break;
 			case 5: monthString="may";
     				 break;
 			case 6: monthString="June";
    				  break;
			 case 7: monthString="july";
     				 break;
 			case 8: monthString="August";
     				 break;
 			case 9: monthString="Septmber";
     				 break;
			 case 10: monthString="October";
     				 break;
 			case 11: monthString="November";
     				 break;
 			case 12: monthString="december";
      			break;
			 default: monthString="Invalid month";
      			break;
 		}
System.out.println(monthString);
	}
}