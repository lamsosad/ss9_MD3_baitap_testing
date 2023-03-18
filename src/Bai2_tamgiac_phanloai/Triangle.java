package Bai2_tamgiac_phanloai;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a: ");
        double sideA = input.nextDouble();
        System.out.println("Nhập độ dài cạnh b: ");
        double sideB = input.nextDouble();
        System.out.println("Nhập độ dài cạnh c: ");
        double sideC = input.nextDouble();
        checkTriangle(sideA, sideB, sideC);
    }

    static String checkTriangle(double sideA, double sideB, double sideC) {
        boolean checkIsTriangle = (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA) && (sideA > 0) && (sideB > 0) && (sideC > 0);
        if (checkIsTriangle) {
            boolean checkIsTriangleDeu = (sideA == sideB) && (sideB == sideC);
            if (checkIsTriangleDeu) {
                return ("Tam giác đều!");
            } else {
                boolean checkIsTriangleCan = (sideA == sideB) || (sideA == sideC) || (sideB == sideC);
                if (checkIsTriangleCan) {
                    return ("Tam giác cân!");
                } else {
                    boolean checkIsTriangleVuong = (sideA * sideA == sideB * sideB + sideC * sideC) ||
                            (sideB * sideB == sideA * sideA + sideC * sideC) ||
                            (sideC * sideC == sideA * sideA + sideB * sideB);
                    if (checkIsTriangleVuong) {
                        return ("Tam giác vuông!");
                    } else {
                        boolean checkIsTriangleVuongCan = ((sideA * sideA + sideB * sideB == sideC * sideC) && (sideA == sideB)) ||
                                ((sideA * sideA + sideC * sideC == sideB * sideB) && (sideA == sideC)) ||
                                ((sideB * sideB + sideC * sideC == sideA * sideA) && (sideB == sideC));
                        if (checkIsTriangleVuongCan) {
                            return ("Tam giác vuông cân!");
                        } else {
                            return ("Tam giác thường!");
                        }
                    }
                }
            }
        } else {
            return ("Không thể tạo thành 1 tam giác");
        }
    }
}
