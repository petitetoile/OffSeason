import java.util.ArrayList;

/**
 * This class is for testing out GitHub.
 *
 * @author Daniel Law
 * @version 11/7/2018
 */
public class BotDogs_GitHub1
{
    // instance variables
    private ArrayList<String> names;

    /**
     * Constructor for objects of class BotDogs_GitHub1
     */
    public BotDogs_GitHub1()
    {
        names = new ArrayList<String>();
    }

    public void test()
    {
        
    }
    
    
    /**
     * Prints all the strings in names onto separate lines
     */
    public void printList()
    {
        for ( String n : names )
        {
            System.out.println(n);
        }
    }
}
