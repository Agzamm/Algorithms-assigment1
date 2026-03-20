import java.util.Scanner;

public class task7{
    static Scanner sc = new Scanner(System.in);

    public static void rev(int n) {
        if (n == 0) return;
        int num = sc.nextInt();
        rev(n - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        System.out.print("enter array length: ");
        int n = sc.nextInt();

        System.out.print("enter numbers: ");
        rev(n);

        sc.close();
    }
}
