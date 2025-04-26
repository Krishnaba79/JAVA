 class Timepass
{
    String color;
    String type;
    public void write()
    {
        System.out.println("write something");
    }
    public void printcolor()
    {
        System.out.println(this.color);
    }
    public void printtype()
    {
        System.out.println(this.type);
    }
}
    public class OOPS
    {
        public static void main(String[] args)
        {
            Timepass Timepass1 = new Timepass();
            Timepass1.color = "blue";
            Timepass1.type = "gel";
            Timepass1.write();

            Timepass Timepass2 = new Timepass();
            Timepass2.color = "black";
            Timepass2.type = "ball point";


            Timepass1.printtype();
            Timepass1.printcolor();



            Timepass2.printcolor();
            Timepass2.printtype();
        }
    }

