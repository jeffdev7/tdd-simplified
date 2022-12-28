package CalculatorTest;

import Calculator.MathOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationSubstractionTest {
    @Test
    public void SubTest(){
        int result = MathOperations.Sub(2,2);
        int expectedResult = 0;
        assertEquals(result, expectedResult);
    }

    @Test
    public void SubTest2(){
        int result = MathOperations.Sub(-2,2);
        int expectedResult = -4;
        assertEquals(result, expectedResult);
    }
    @Test
    public void SubTest3(){
        int result = MathOperations.Sub(2,1);
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }
}