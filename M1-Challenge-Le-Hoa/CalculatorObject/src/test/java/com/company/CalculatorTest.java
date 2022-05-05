package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;
    @Before
    public void runBeforeEachIndividualTest(){
        calc = new Calculator();
    }

    @Test
    public void shouldAddInt(){
    assertEquals(2,calc.add(1,1));
    }
    @Test
    public void shouldSubtractInt(){
    assertEquals(-29,calc.subtract(23,52));
    }
    @Test
    public void shouldMultiplyInt(){
    assertEquals(68,calc.multiply(34,2));
    }
    @Test
    public void shouldDivideInt(){
    assertEquals(4,calc.divide(12,3));
    assertEquals(1,calc.divide(12,7));
    }
    @Test
    public void shouldAddDouble(){
    assertEquals(5.69,calc.add(3.4,2.3),0.05);

    }
    @Test
    public void shouldSubtractDouble(){
        assertEquals(5,calc.subtract(5.5,0.5),0.05);

    }
    @Test
    public void shouldMultiplyDouble(){
        assertEquals(29.48,calc.multiply(6.7,4.4),0.05);
    }
    @Test
    public void shouldDivideDouble(){
        assertEquals(4.90,calc.divide(10.8,2.2),0.05);

    }


}