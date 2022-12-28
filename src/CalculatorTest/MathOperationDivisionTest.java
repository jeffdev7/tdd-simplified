package CalculatorTest;

import Calculator.MathOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationDivisionTest {
    @Test
    public void DivisionTest(){
        int result = MathOperations.Division(2,2);
        int expectedResult = 1;
        assertEquals(result, expectedResult);
    }

    @Test
    public void DivisionTest2(){
        int result = MathOperations.Division(2,1);
        int expectedResult = 2;
        assertEquals(result, expectedResult);
    }
}
