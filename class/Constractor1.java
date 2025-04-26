class Constractor1
{
int x;
int y;
Constractor1(int x,int y)
{
this.x = x;
this.y = y;
System.out.println("Before passing this to add two() mathod:");
System.out.println("x =" + this.x + ",y =" + this.y);
addTwo(this);
System.out.println("After passing this to add two() mathod:");
System.out.println("x =" + this.x + ",y =" + this.y);
}
void addTwo(Constractor1 o)
{
o.x += 2;
o.y += 2;
}
}

class Demo1
{
public static void main(String[] args)
{
Constractor1 obj = new Constractor1 (1,-2);
}
}
