import org.junit.Before;
import org.junit.Test;
import staff.Management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Orb", "NI111111T", 90000, "IT", 200000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(200000, director.getBudget(), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1800, director.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(95000, director.getSalary(), 0);
    }
}
