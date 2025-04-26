class Parameterize_consructor{
private int a,b;
private Parameterize_consructor(int i ,int j ){
this.a = i;
this.b = j;
}

private Parameterize_consructor(int i){
this(i , i);
}
private Parameterize_consructor()
{
this(0);
}
public String toString()
{
return this.a+ "+" +this.b + "i";
}

public static void main(String [] args){
Parameterize_consructor c1 = new Parameterize_consructor(2,3);
Parameterize_consructor c2 = new Parameterize_consructor(3);
Parameterize_consructor c3 = new Parameterize_consructor();
System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
}
}