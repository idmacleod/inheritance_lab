import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before() {
        director = new Director("Kyle", "UJ 56 23 18K", 150000.00, "Technology", 5000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Kyle", director.getName());
    }

    @Test
    public void hasNi() {
        assertEquals("UJ 56 23 18K", director.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(150000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Technology", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(5000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(160000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1500.00 ,director.payBonus(), 0.01);
    }

    @Test
    public void raiseCannotBeNegative() {
        director.raiseSalary(-1000.00);
        assertEquals(150000.00, director.getSalary(), 0.01);
    }
}
