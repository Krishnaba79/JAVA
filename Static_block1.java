class Static_block1{
static int A=3;
static int B;
static int MAX;
static{
System.out.println("First sttaic block:");
B = A*4;
}
static {
System.out.println("Second Staic block.");
MAX= 10;
}
static void math(int x){
System.out.println("x = " +x);
System.out.println("A = " +A);
System.out.println("B = " +B);
System.out.println("MAX = " +MAX);
}
public static void main(String [] args)
{
math(42);
}
}
