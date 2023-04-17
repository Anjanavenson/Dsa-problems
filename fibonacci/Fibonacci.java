import java.util.*;
public class Fibonacci {
    public static void main (String[ ] args) {
        System.out.println("Enter the number of terms : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        fibonacciSeries(i);
    }
    public static final void fibonacciSeries(long n){
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; ++i) {
            System.out.println(a + " ");
            final int temp = b;
            b= b+ a;
            a = temp;
        }
    }
}