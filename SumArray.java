import java.util.Scanner;
class SumArray{
public static void main(String args[]){

System.out.print("enter an required size of array:");
Scanner s = new Scanner(System.in);
int number = s.nextInt();
int array [] = new int[number];
int sum = 0;
System.out.println("enter the element of the array:");

for(int i=0; i<number; i++){
array[i] = s.nextInt();
sum = sum+ array[i];
}

System.out.println("sum of the elements of the array:"+sum);
}}

