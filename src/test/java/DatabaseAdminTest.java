import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jim", "KG 80 45 88B", 40000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jim", databaseAdmin.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("KG 80 45 88B", databaseAdmin.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(50000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00 ,databaseAdmin.payBonus(), 0.01);
    }
}
