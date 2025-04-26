class condoper
{
public static void main(String[ ] args)
{
int a,b,c,result;
Scanner input=new Scanner(System.in);
System.out.print("Enter the Three Number:");
a=input.nextlnt();
b=input.nextlnt();
c=input.nextlnt();
result = (a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println(result + "is Greatest");
}
}
