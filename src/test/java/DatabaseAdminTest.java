import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Markus", "PP545454T", 32000);
    }

    @Test
    public void canGetBonus(){
        assertEquals(320, databaseAdmin.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(33000, databaseAdmin.getSalary(), 0);
    }

}
