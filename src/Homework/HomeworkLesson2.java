package Homework;

public class HomeworkLesson2 {
    public static void main(String[] args) {
        System.out.println(sum(5, 15));
        checkPlusOrMinus(-10);
        System.out.println(bool(7));
        printString("HelloWorld!", 3);
        System.out.println(leapYear(2021));
    }

    static boolean sum(int a, int b) {
        System.out.println("Задание №1");
        int c = a + b;
        if (c >= 10 && c <= 20) return true;
        return false;
    }

    static void checkPlusOrMinus(int a) {
        System.out.println();
        System.out.println("Задание №2");
        if (a >= 0) System.out.println(a + " это положительное число");
        else System.out.println(a + " это отрицательное число");
    }

    static boolean bool(int a) {
        System.out.println();
        System.out.println("Задание №3");
        if (a <= 0) return true;
        return false;
    }

    static void printString(String a, int b) {
        System.out.println();
        System.out.println("Задание №4");
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }
    }
    static boolean leapYear(int a) {
        System.out.println();
        System.out.println("Задание №5");
        if (a % 4 == 0)
            if (a % 100 != 0 || a % 400 == 0) return true;
        return false;
    }
}



