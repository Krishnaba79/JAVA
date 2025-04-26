public class Access_Modifier{
{
private String name;
public String getName()
{
return this.name;
}
public void setName(String name)
{
this.format = name ;
}
}
public class Logger{
public static void main(String [] main)
{
Access_Modifier d = new Access_Modifier();
d.setName ("programiz");
System.out.println(d.getName());
}
} 