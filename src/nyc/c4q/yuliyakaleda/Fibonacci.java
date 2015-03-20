package nyc.c4q.yuliyakaleda;

/**
 * Yuliya Kaleda
 * C4Q Access Code
 * Fibonacci number
 * Created on 03-18-2015
 */

public class Fibonacci {

    public static int fibonacciList(int n) {
        int fibonacciNum = 0;
        int fibonacci1 = 0;
        int fibonacci2 = 1;

        if (n < 1) {
            System.out.println("Sorry, but the input is invalid!");
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            if (n == 1) {
                return 0;
            }
            else if (n == 2) {
                return 1;
            }
            else if (i>=3){
                fibonacciNum = fibonacci1 + fibonacci2;
                fibonacci1 = fibonacci2;
                fibonacci2 = fibonacciNum;
            }
        }
        return fibonacciNum;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciList(90));
    }
}
