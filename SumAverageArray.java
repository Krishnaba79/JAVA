//com stored putes sum and average of values  stored in an array odf type int
class SumAverageArray{
public static void main(String args[]){
int [] numbers={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
Double average;

for(int number:numbers){
sum += number;
}

int  arrayLength=numbers.length;

//changes sum and Arraylength to double as average is in double
average=((double)sum/(double)arrayLength);

System.out.println("Sum=" +sum);
System.out.println("Average=" +average);
}}