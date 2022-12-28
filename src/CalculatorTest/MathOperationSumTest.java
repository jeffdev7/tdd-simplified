package CalculatorTest;

import Calculator.MathOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationSumTest {

    @Test
    public void SumTest(){
        int result = MathOperations.Sum(2,2);
        int expectedResult = 4;
        assertEquals(result, expectedResult);
    }

    @Test
    public void SumTest2(){
        int result = MathOperations.Sum(-2,-2);
        int expectedResult = -4;
        assertEquals(result, expectedResult);
    }

    @Test
    public void SumTest3(){
        int result = MathOperations.Sum(2,-2);
        int expectedResult = 0;
        assertEquals(result, expectedResult);
    }
    @Test
    public void SumTest4(){
        int result = MathOperations.Sum(-2,1);
        int expectedResult = -1;
        assertEquals(result, expectedResult);
    }
}