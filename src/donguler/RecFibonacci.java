package donguler;
import java.util.Scanner;


public class RecFibonacci {
    static int fib(int n){
        if(n == 1 || n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }


static void main(String[] args) {
    System.out.println(fib(7));
}
}