package package2;
import package1.Logger;

public class MainextendsLogger 
{

    public static void main(String [] args)
   {
        Main logger = new Main();

        // invokes debug() from Logger class
        logger.debug("hello from main");
    }
}
