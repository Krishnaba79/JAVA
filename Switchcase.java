import java.util.Scanner;
public class Switchcase{
public static void main(String [] args){
Scanner input=new Scanner(System.in);
int month=input.nextInt();
String monthString;
switch (month){
case 1: monthString="january";
           break;
case 2: monthString="february";
           break;
case 3: monthString="march";
           break;
case 4: monthString="april";
           break;

case 5: monthString="may";
           break;

case 6: monthString="june";
           break;

case 7: monthString="july";
           break;

case 8: monthString="auguest";
           break;
case 9: monthString="september";
           break;

case 10: monthString="october";
           break;

case 11:monthString="november";
           break;

case 12: monthString="december";
           break;

default : monthString="invalid month";
           break;
}
System.out.println(monthString);
}}





