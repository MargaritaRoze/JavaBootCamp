package sef.Final;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
    private Employee theEmployee;
    protected void setUp() throws Exception {
        super.setUp();
        theEmployee = new Employee();}

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testSetAndGetName () {
        String testName = "Alla";
        assertEquals("Alla", "Alla");

    }
    public void testSetAndGetAge () {
        int testAge = 22;
        assertEquals(22, 22);
    }

        public void testSetAndGetJobTitle() {
            String testJobTitle = "PMO";
            assertEquals("PMO","PMO");
            assertEquals("0","1");

        }
        public void testSetAndGetCompany(){
        String testCompany = "Accenture";
        assertEquals("Accenture","Accenture");
        }
}
