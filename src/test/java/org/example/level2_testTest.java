package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class level2_testTest {
@Test
    void getFirstLetter_returnsFirstLetter(){
    //GIVEN
    //String text="Hallo";
    String text=null;
    //WHEN
    Character actual_letter = level2_test.getFirstLetter(text);
    //THEN
    assertNull(actual_letter);
    //assertNotNull(actual_letter);
}
@Test
    void test_Divide_byZero(){
    //GIVEN
    int x=10;
    int z=0;//z = 0, otherwise no exception will be thrown

    /*assertThrows takes two arguments:
    the expected exception class
    a lambda expression that calls the method that should fail*/

    assertThrows(IllegalArgumentException.class, ()->{level2_test.divide(x,z);});
}
}