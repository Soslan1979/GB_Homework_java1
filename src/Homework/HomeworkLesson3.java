/**
 * Java_1 Homework 3
 * @author Kalabekov Soslan
 * @date 13/10/2021
 */

import java.util.Arrays;

public class HomeworkLesson3{

    public static void main(String[] args) {
        change0To1();
        createAnArray100();
        lessSixMultiplyByTwo();
        createSquareArray(6);
        createSquareArray(8);
        System.out.println(Arrays.toString(lenArr(3, 7)));
        System.out.println(Arrays.toString(lenArr(5, 3)));
        System.out.println();
        maxAndMinNumber();
    }

    static void change0To1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Initial array  " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.println("Modified array " + Arrays.toString(arr));
        System.out.println();
    }

    static void createAnArray100() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    static void lessSixMultiplyByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Initial array  " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] *= 2 : arr[i];
        }
        System.out.println("Modified array " + Arrays.toString(arr));
        System.out.println();
    }


    static void createSquareArray(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == a - i - 1)
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[] lenArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    static void maxAndMinNumber() {
        int arr[] = {3, 5, 7, 11, 99, 78, 90, 65};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}






