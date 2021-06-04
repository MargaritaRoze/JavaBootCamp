package sef.Final;

import junit.framework.TestCase;

public class StudentsTest extends TestCase {
    private Students theStudents;
    protected void setUp() throws Exception {
        super.setUp();
        theStudents = new Students();}

    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testSetAndGetName() {
        String testName = "Danny";
        assertEquals("Danny", theStudents.getName());
        assertEquals("56", theStudents.getName());
    }
    public void testSetAndGetSchoolName() {
        String tesSchoolName = "Baltic University";
        assertEquals("Baltic University", theStudents.getschoolName());
}}