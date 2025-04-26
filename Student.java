//object and class example:main within the class

class Student
{
//defining fields
int id;   //field or data member or instance variable
String name;
//creating main method inside the Student class
public static void main(String args[])
{
//creating an object or instance
Student s1=new Student(); //creating an object of student
//printing values of the objects

System.out.println(s1.id);  //accessing member through reference variable
System.out.println(s1.name); 
}
}