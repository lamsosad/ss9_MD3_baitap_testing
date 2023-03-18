package Bai1_Next_day;

import java.time.LocalDate;
import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("day : ");
        int day = scanner.nextInt();
        System.out.print("month: ");
        int month = scanner.nextInt();
        System.out.print("year : ");
        int year = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.plusDays(1));
    }
    public static String nextDay(int year, int month, int day){
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate newDate = date.plusDays(1);
        return "" + newDate.getDayOfMonth() + newDate.getMonthValue() + newDate.getYear();
    }
}

