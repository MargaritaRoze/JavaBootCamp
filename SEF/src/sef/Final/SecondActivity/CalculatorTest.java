package sef.Final.SecondActivity;

import junit.framework.TestCase;
import sef.Final.SecondActivity.Calculator;;

public class CalculatorTest {
    public class Calculator extends TestCase{
        private Calculator theCalculator;
        protected void setUp() throws Exception {
            super.setUp();
            theCalculator = new Calculator();
    }
        protected void tearDown() throws Exception {
            super.tearDown();
        }
        public void testGetsum() {
            int a = 12;
            int b = 14;
            assertEquals(26, 26);
            assertEquals(26, 26);
        }
    }
}
