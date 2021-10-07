package Homework;

public class HomeworkLesson2 {
    public static void main(String[] args) {
        System.out.println(sum(5, 15));
        System.out.println(sum(10, 15));
        checkPlusOrMinus(-10);
        checkPlusOrMinus(10);
        System.out.println(checkTrueOrFalse(7));
        System.out.println(checkTrueOrFalse(-7));
        printString("Hello world!", 3);
        printString("Hi guys", 5);
        System.out.println(leapYear(2021));
        System.out.println(leapYear(2020));
    }

    static boolean sum(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) return true;
        return false;
    }

    static void checkPlusOrMinus(int a) {
        if (a >= 0) System.out.println(a + " это положительное число");
        else System.out.println(a + " это отрицательное число");
    }

    static boolean checkTrueOrFalse(int a) {;
        if (a <= 0) return true;
        return false;
    }

    static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean leapYear(int a) {
        if (a % 4 == 0)
            if (a % 100 != 0 || a % 400 == 0) return true;
        return false;

    }
}



