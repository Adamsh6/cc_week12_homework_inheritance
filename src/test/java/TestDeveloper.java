import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Charles", "XZ444444X", 40000);
    }


    @Test
    public void canGetBonus(){
        assertEquals(400, developer.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(41000, developer.getSalary(), 0);
    }

}
