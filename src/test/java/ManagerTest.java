import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "XY 77 55 66A", 100000.00, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("XY 77 55 66A", manager.getNi());
    }
    
    @Test
    public void hasSalary(){
        assertEquals(100000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000.00);
        assertEquals(110000.00, manager.getSalary(), 0.01);
    }
}
