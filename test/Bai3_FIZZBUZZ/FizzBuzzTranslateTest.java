package Bai3_FIZZBUZZ;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate3() {
        int number = 3;
        assertEquals("FIZZ",FizzBuzzTranslate.translate(number));
    }
    @Test
    void translate5() {
        int number = 5;
        assertEquals("BUZZ",FizzBuzzTranslate.translate(number));
    }
    @Test
    void translate15() {
        int number = 15;
        assertEquals("FIZZBUZZ",FizzBuzzTranslate.translate(number));
    }
    @Test
    void translate7() {
        int number = 7;
        assertEquals("FIZZ",FizzBuzzTranslate.translate(number));
    }
}