import org.junit.Before;
import org.junit.Test;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Rick", "KX197506L", 60000, "Sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Rick", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("KX197506L", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000, manager.getSalary(), 0);
    }

    @Test
    public void canGetDepartment(){
        assertEquals("Sales", manager.getDepartment());
    }

    @Test
    public void canGetBonus(){
        assertEquals(600, manager.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(61000, manager.getSalary(), 0);
    }

    @Test
    public void cannotReduceSalary(){
        manager.raiseSalary(-1000);
        assertEquals(60000, manager.getSalary(), 0);
    }

    @Test
    public void canSetName(){
        manager.setName("Boyd");
        assertEquals("Boyd", manager.getName());
    }

    @Test
    public void cannotSetNameToNull(){
        manager.setName(null);
        assertEquals("Rick", manager.getName());
    }
}
