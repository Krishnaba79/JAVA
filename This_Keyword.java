class This_Keyword{
int instVar;
This_Keyword(int instVar)
{
this.instVar = instVar;
System.out.println("this reference = " +this);
}
public static void main(String [] args){
This_Keyword obj = new This_Keyword(8);
System.out.println("object reference = "+obj);
}
}
