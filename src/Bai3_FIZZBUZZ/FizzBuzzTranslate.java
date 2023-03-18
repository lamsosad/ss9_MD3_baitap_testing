package Bai3_FIZZBUZZ;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FIZZBUZZ";
        if (isFizz)
            return "FIZZ";
        if (isBuzz)
            return "BUZZ";
        return number + "";
    }
}
