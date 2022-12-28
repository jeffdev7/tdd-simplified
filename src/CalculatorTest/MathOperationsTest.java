package CalculatorTest;

import Calculator.MathOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationsTest {

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