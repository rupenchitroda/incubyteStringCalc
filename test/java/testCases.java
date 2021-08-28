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


}
