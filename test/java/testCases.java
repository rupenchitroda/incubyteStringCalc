package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import main.java.simpleCalc;

public class testCases {
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("test.java.testCases");
    }

    @Before
    public void setUp(){
        new simpleCalc();
    }

    @Test
    /**
     * testing for empty string, should return empty string
     * @param void
     * @return null
     */
	public void testEmptyString() throws Exception {
		assertEquals(0, simpleCalc.add(""));
	}

    @Test
    /**
     * testing for one input, should return number itself
     * @param string x
     * @return int x
     */
    public void test_should_return_passed_string()throws Exception {
        assertEquals(1, simpleCalc.add("1"));
    }

    @Test
    /**
     * testing for two input, should return sum of that two number
     * @param string x
     * @return int sum
     */
    public void test_should_return_sum_of_two_numbers()throws Exception {
        assertEquals(3, simpleCalc.add("1,2"));
    }

    @Test
    /**
     * testing for multiple inputs, should return sum of that all numbers
     * @param string x
     * @return int sum
     */
    public void test_should_return_sum_of_multiple_inputs() throws Exception {
        assertEquals(3, simpleCalc.add("1,1,1"));
    }

    @Test
    public void test_should_return_sum_of_multiple_inputs_newline() throws Exception {
        assertEquals(9, simpleCalc.add("3\n3,3"));
    }


    @Test
    /**
     * testing for multiple inputs as well as delimeters, should return sum of that all numbers
     * @param string x
     * @return int sum
     */
    public void test_should_return_sum_of_multiple_inputs_even_with_multiple_deleimeters() throws Exception {
        assertEquals(3, simpleCalc.add("//;\n1;2"));
    }

    @Test
    public void test_should_return_sum_of_multiple_inputs_even_with_different_deleimeters() throws Exception {
        assertEquals(15, simpleCalc.add("//!\n1!2!3!4!5"));
    }

    @Test
    /**
     * testing for negative inputs , should throws a exception
     * @param string x
     * @return error
     */
    public void test_should_not_accept_negatives() throws Exception {
        try{
            simpleCalc.add("-1");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test_should_not_accept_multiples_negatives() throws Exception {
        try{
            simpleCalc.add("-1-2-3");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    /**
     * testing for values which are >1000, that number should be ignored
     * @param string x
     * @return sum y
     */
    public void test_should_not_accept_values_greater_than_1000() throws Exception {
        assertEquals(2, simpleCalc.add("1000,2"));
    }

}
