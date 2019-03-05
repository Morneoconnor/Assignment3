import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TestProgram {
    public TestProgram()
    {

    }
    @Test
    public void getName() throws Exception
    {
        Person personObj = new Person("Morne");
        assertEquals("Morne",personObj.getName());
    }
    @Test
    public void DisplayMessageTest() throws Exception
    {
        Person personObj = new Person();
        assertEquals("Hi Morne",personObj.DisplayName("Morne"));
    }
    @Test
    public void GetNumberOfPersons() throws Exception
    {
        Person personObj = new Person();
        assertEquals(1,personObj.NumberOfPersons());
    }
    @Test(expected = NullPointerException.class)
    public void GetNumber() throws Exception
    {
        Person personObj = null;
        personObj.getName();
    }
    @Test(timeout = 100)
    public void CheckEquality() throws Exception
    {
        Person personObj = new Person("Morne");
        Alien alienObj = new Alien("Morne");
        assertSame(personObj.getName(),alienObj.getName());
        assertThat("testing if object is the same",personObj.DisplayName("Morne"),is(alienObj.DisplayName("Morne")));
    }
    @Ignore
    @Test(timeout = 100)
    public void CheckInEquality() throws Exception
    {
        Person personObj = new Person("Morne");
        Alien alienObj = new Alien("Bob");
        assertNotSame(personObj.getName(),alienObj.getName());
        assertThat("testing if object is the same",personObj.DisplayName("Morne"),is(alienObj.DisplayName("Morne")));
    }

}
