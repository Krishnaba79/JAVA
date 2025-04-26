class Static_block{
static int num ;
static String mystr;
static{
num=97;
mystr = "Static keyword in java";
System.out.println("Static block 1");
num=68;

mystr = "Block1";

}
//second static block
static{
System.out.println("Static block 2");
num = 98;
mystr="Block2";
}
public static void main(String [] args)
{
System.out.println("value of num:"+num);
System.out.println("Value of mystr:"+mystr);
}
}