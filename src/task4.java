import java.util.Scanner;

public class task4 {
    static Scanner sc = new Scanner(System.in);

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        factorial(5);
    }
}