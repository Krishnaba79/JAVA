class Thisexample
{
int x;
int y;
Thisexample(int x , int y)
{
this.x = x;
this.y = y;
System.out.println("before passing this to add two() method:");
System.out.println("x = " + this.x + ",y=" + this.y);
addTwo(this);
System.out.println("x=" + this.x + ",y" + this.y);
}

void addTwo(Thisexample o)
{
	o.x+=2;
	o.y+=2;
}
}
class This_Argumnet
{
public static void main(String [] rags){
Thisexample obj = new Thisexample(1,-2);
}
} 
