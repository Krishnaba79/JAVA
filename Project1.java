   public class Project1{
        private static String str="HelloBook";
        //static class
        static class MyNestedClass
        {
            //non-static method
            public void disp()
            {
                System.out.println(str);
            }
       }
public static void main(String [] args)
{
Project1.MyNestedClass obj = new Project1.MyNestedClass ();
obj.disp();
}
}

