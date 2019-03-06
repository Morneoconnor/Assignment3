import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static jdk.nashorn.internal.objects.NativeRegExp.test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TestProgram {
    private PersonModel personModelObj;
    private IPerson personObj;

    public TestProgram()
    {

    }
    @Before
    public void SetUp() throws Exception
    {
        personModelObj = new PersonModel();
    }
    @Test(timeout = 100)
    public void TestRealPerson() throws Exception
    {
        personObj = new Person();
        assertEquals("Morne",personObj.PersonName());
    }
    @Test(timeout = 100)
    public void TestWorkExperience() throws Exception
    {
        personObj = new Person();
        assertEquals(2,personObj.WorkExperience());
    }

}
