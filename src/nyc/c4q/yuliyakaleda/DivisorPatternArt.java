package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Divisor Pattern Art
 * Created on 03-18-2015
 */

public class DivisorPatternArt {

    //choose '@' or ' ' to print
    public static String division(int num1, int num2) {
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            return "@ ";
        }
        else {
            return "  ";
        }
    }

    //print rows and columns
    public static void print(int n) {
        int i, j;
        for (j = 1; j <= n; j++) {
            for (i = 1; i < n; i++) {
                System.out.print(division(i, j));
            }
            System.out.println(division(i,j));
        }
    }

    public static void main(String[] args) {
        print(7);
    }
}


