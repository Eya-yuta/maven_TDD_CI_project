package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TDDTest {
    @Test
    void test_Sum(){
        //GIVEN
        int a=4;
        int b=2;
        int expected_c=6;
        //WHEN
        int actual_c=TDD.sum(a,b);
        assertEquals(expected_c,actual_c);
    }
    @Test
    void test_isEven(){
        //GIVEN
        int d=6;
        boolean expected=true;
        //WHEN
        boolean actual=TDD.isEven(d);
        assertEquals(expected,actual);

    }
    @Test
    void test_returnTrue_ifStringNull (){
        //GIVEN
        String str=null;
        //WHEN
        Character actual_str=TDD.getFirstCharacter(str);
        assertNull(actual_str);
    }
    @Test
    void test_returnTrue_ifStringEmpty (){
        //GIVEN
        String str="";
        //WHEN
        Character actual_str=TDD.getFirstCharacter(str);
        assertNull(actual_str);
    }
    @Test
    void test_returnTrue_ifFirstLetterExtracted (){
        //GIVEN
        String str="Hallo";
        Character expected_char='H';
        //WHEN
        Character actual_char=TDD.getFirstCharacter(str);
        assertEquals(expected_char,actual_char);
    }
    @Test
    void test_returnTrue_ifStringReversed () {
        //GIVEN
        String str = "Hallo";
        String expected_str = "ollaH";
        //WHEN
        String actual_str = TDD.reverseString(str);
        //THEN
        assertEquals(expected_str, actual_str);
    }
    @Test
    void test_isPalindrome() {
        //GIVEN
        String str = "Otto";
        boolean expected=true;
        //WHEN
        boolean actual= TDD.isPalindrome(str);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void test_countVowels() {
        //GIVEN
        String str = "Hallo";
        int expected=3;
        //WHEN
        int actual= TDD.countVowels(str);
        //THEN
        assertEquals(expected, actual);
    }


}