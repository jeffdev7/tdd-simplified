package CalculatorTest;

import Calculator.MathOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationMultiplicationTest {
    @Test
    public void MultiplyTest(){
        int result = MathOperations.Multiplication(2,2);
        int expectedResult = 4;
        assertEquals(result, expectedResult);
    }

    @Test
    public void MultiplyTest2(){
        int result = MathOperations.Multiplication(2,5);
        int expectedResult = 10;
        assertEquals(result, expectedResult);
    }

    @Test
    public void MultiplyTest3(){
        int result = MathOperations.Multiplication(2,-2);
        int expectedResult = -4;
        assertEquals(result, expectedResult);
    }
}