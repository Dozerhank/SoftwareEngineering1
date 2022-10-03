import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class TurtleTest    {
    @Test 
    public void test_SingleSeen()  {
        Turtle turtle = new Turtle();
        turtle.seen();

        assertEquals(-2, turtle.bravery());
    } 

    @Test
    public void test_SeenRace() {
        Turtle turtle = new Turtle();

        turtle.seen();
        assertEquals(-2, turtle.bravery());

        turtle.lose(1);
        assertEquals(-3, turtle.bravery());
    }

    @Test
    public void test_BelowLimit()   {
        Turtle turtle = new Turtle();

        turtle.lose(1);
        assertEquals(-3, turtle.bravery());
    }

    @Test
    public void test_AboveLimit()   {
        Turtle turtle = new Turtle();
        for (int i = -3; i != 3; i++)   {
           turtle.seen(); 
        }

        assertEquals(3, turtle.bravery());

        turtle.seen();
        assertEquals(3, turtle.bravery());
    }

    @Test
    public void test_Liked()    {
        Turtle turtle = new Turtle();
        for (int i = -3; i != 3; i++)   {
            turtle.seen(); 
        }

        assertEquals("liked",turtle.socialstatus());
    }

    @Test
    public void test_Disliked()    {
        Turtle turtle = new Turtle();

        assertEquals("disliked",turtle.socialstatus());
    }
}