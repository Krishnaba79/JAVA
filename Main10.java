 class Person
{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

public class Main10
{
    public static void main(String[] args)
    {
        Person p1 = new  Person("Ean Craig",11);
        Person p2 = new Person("Ean Ross",12);
        System.out.println(p1.getName() + "is" + p1.getAge() + "years old." );
        System.out.println(p2.getName() + "is" + p2.getAge() + "years old. \n" );
    }
}
