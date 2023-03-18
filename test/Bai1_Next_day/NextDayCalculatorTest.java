package Bai1_Next_day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void testNextDay(){
        int day = 1;
        int month = 1;
        int year = 2020;
        assertEquals("" + day + month + year ,NextDayCalculator.nextDay(2019, 12, 31));
    }
    @Test
    void testNextDay2(){
        int day = 1;
        int month = 2;
        int year = 2020;
        assertEquals("" + day + month + year ,NextDayCalculator.nextDay(2020, 1, 31));
    }
    @Test
    void testNextDay3(){
        int day = 1;
        int month = 5;
        int year = 2020;
        assertEquals("" + day + month + year ,NextDayCalculator.nextDay(2020, 4, 30));
    }
    @Test
    void testNextDay4(){
        int day = 1;
        int month = 3;
        int year = 2018;
        assertEquals("" + day + month + year ,NextDayCalculator.nextDay(2018, 2, 28));
    }
    @Test
    void testNextDay5(){
        int day = 29;
        int month = 2;
        int year = 2020;
        assertEquals("" + day + month + year ,NextDayCalculator.nextDay(2020, 2, 28));
    }

}