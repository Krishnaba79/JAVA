class Student1
{
int id;
String name;
}
//creating another class teststudent1 which contains the main method
class TestStudent1
{
public static void main(String[]args)
{
Student s1=new Student();
System.out.println(s1.id);
System.out.println(s1.name);

Student s2=new Student();
s2.id=2;
s2.name="lija";
System.out.println(s2.id);
System.out.println(s2.name);

}
}