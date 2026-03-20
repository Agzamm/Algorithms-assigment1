import java.util.Scanner;

public class task2 {
    static Scanner sc = new Scanner(System.in);

    public static int avg(int size) {
        if (size == 0) {
            return 0;
        }

        int num = sc.nextInt();
        return num + avg(size - 1);
    }

    public static void main(String[] args) {
        System.out.print("enter array length: ");
        int length = sc.nextInt();

        System.out.print("enter numbers: ");
        int sum = avg(length);

        System.out.println((double) sum / length);
        sc.close();
    }
}