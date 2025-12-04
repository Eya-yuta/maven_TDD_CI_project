package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class level1_testTest {
    @Test
    void isPositive_shouldReturnTrue_whenPositive()
    {//Given
        int number1=5;
        boolean expected1=true;
     //WHEN
        boolean actual1=level1_test.isPositive(number1);
     //THEN
     assertEquals(expected1,actual1);
    }

}