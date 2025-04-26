class Data
{
private String name;
public String getName()

{
return this.name;
}
public void setName(String name)
{
this.name = name ;
}
}
public class Logger1{
public static void main(String [] main)
{
Data d = new Data();
d.setName("programiz");
System.out.println(d.getName());
}
}