package Bai2_tamgiac_phanloai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testTriangle() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 2;
        assertEquals("Tam giác đều!",Triangle.checkTriangle(sideA,sideB,sideC));
    }
    @Test
    void testTriangle1() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 3;
        assertEquals("Tam giác cân!",Triangle.checkTriangle(sideA,sideB,sideC));
    }
    @Test
    void testTriangle2() {
        double sideA = 3;
        double sideB = 4;
        double sideC = 5;
        assertEquals("Tam giác thường!",Triangle.checkTriangle(sideA,sideB,sideC));
    }
    @Test
    void testTriangle3() {
        double sideA = 1;
        double sideB = -1;
        double sideC = 0;
        assertEquals("Không thể tạo thành 1 tam giác",Triangle.checkTriangle(sideA,sideB,sideC));
    }
}