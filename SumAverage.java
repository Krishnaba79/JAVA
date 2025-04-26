class SumAverage{
	public static void main(String [] args)
	{

	int[] numbers = {2, -9, 0, 5, 12, -25, 22,9 ,8, 12};
	int sum = 0;
	Double average;

	for(int number: numbers){
	sum += numbers;
	}
	
	int arreyLength= numbers.Length;

	average = ((Double)sum/(Double)arreyLength);

	System.out.println("Sum = "+sum);
	System.out.println("Average = " +average);
}
}