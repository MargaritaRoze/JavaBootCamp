package sef.Final;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person thePerson;
    protected void setUp() throws Exception {
super.setUp();
thePerson = new Person();

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
public void testSetAndGetName () {
        String testName = "Margarita";
        assertEquals("Margarita", thePerson.getName() );
        assertEquals("O", thePerson.getName() );
    }
    public void testSetAndGetAge () {
        int testAge = 25;
        assertEquals(25, thePerson.getAge());
    }

}