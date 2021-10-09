/**
 * Java_1 Homework 2
 * @author Kalabekov Soslan
 * @date 7/10/2021
 */

public class HomeworkLesson2 {
    public static void main(String[] args) {
        System.out.println(сheckAmount(5, 15));
        System.out.println(сheckAmount(10, 15));
        checkPlusOrMinus(-10);
        checkPlusOrMinus(10);
        System.out.println(checkTrueOrFalse(7));
        System.out.println(checkTrueOrFalse(-7));
        printString("Hello world!", 3);
        printString("Hi guys!", 5);
        System.out.println(leapYear(2021));
        System.out.println(leapYear(2020));
    }

    static boolean сheckAmount(int a, int b) {
        int c = a + b;
        return c >= 10 && c<= 20;

    }

    static void checkPlusOrMinus(int a) {
        System.out.println(a >= 0? "Passed a positive number" : "Passed a negative number");
    }

    static boolean checkTrueOrFalse(int a) {
        return a <= 0;
    }

    static void printString(String text, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(text);
        }
    }

    static boolean leapYear(int a) {
        if (a % 4 == 0)
            if (a % 100 != 0 || a % 400 == 0) return true;
        return false;

    }
}



