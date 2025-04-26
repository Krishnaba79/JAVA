class This_Argument{
int x;
int y;
This_Argument(int x , int y)
{
this.x = x;
this.y = y;

System.out.println("before passing this to add two() method:");
System.out.println("x = " + this.x + ",y=" + this.y);
addTwo(this);
System.out.println("x=" + this.x + ",y" + this.y);
}

void addTwo(This_Argument o)
{
o.x+=2;
0.y+=2;
}

class Demo
{
public static void main(String [] args){
This_Argument obj = new This_Argument(1,-2);
}
} 
}