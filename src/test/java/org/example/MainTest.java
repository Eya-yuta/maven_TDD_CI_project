package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void isEven_shouldReturnTrue_whenCalledWith2(){
        //Given
        int number = 2;
        boolean expected=true;
        //WHEN
        boolean actual=Main.isEven(number);
        //THEN
        assertEquals(expected,actual);
    }
    @Test
    void multiply_returnDerProduktErgebnis(){
        //GIVEN
        int a=3,b=4;
        int expected_result=12;
        //WHEN
        int actual_result=Main.multiply(a,b);
        //THEN
        assertEquals(expected_result,actual_result);
    }



}