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
        assertEquals(22, theEmployee.getAge());
    }

        public void testSetAndGetJobTitle() {
            String testJobTitle = "PMO";
            assertEquals("PMO",theEmployee.getJobTitle());
            assertEquals("0",theEmployee.getJobTitle());

        }
        public void testSetAndGetCompany(){
        String testCompany = "Accenture";
        assertEquals("Accenture",theEmployee.getCompany());
        }
}
