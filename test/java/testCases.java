package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import main.java.simpleCalc;

public class testCases {
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("test.java.testCases");
    }

    private simpleCalc calc;

    @Before
    public void setUp(){
        calc = new simpleCalc();
    }

    @Test
    /**
     * testing for empty string, should return empty string
     * @param void
     * @return null
     */
	public void testEmptyString() {
		assertEquals(0, simpleCalc.add(""));
	}

    @Test
    /**
     * testing for one input, should return number itself
     * @param string x
     * @return int x
     */
    public void test_should_return_passed_string(){
        assertEquals(1, simpleCalc.add("1"));
    }

    @Test
    /**
     * testing for two input, should return sum of that two number
     * @param string x
     * @return int sum
     */
    public void test_should_return_sum_of_two_numbers(){
        assertEquals(3, simpleCalc.add("1,2"));
    }

    @Test
    /**
     * testing for multiple inputs, should return sum of that all numbers
     * @param string x
     * @return int sum
     */
    public void test_should_return_sum_of_multiple_inputs(){
        assertEquals(3, simpleCalc.add("1\n1,1"));
    }
  
}
