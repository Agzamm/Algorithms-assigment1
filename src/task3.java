import java.util.Scanner;

public class task3 {
    static Scanner sc = new Scanner(System.in);

    public static boolean calc(int num, int div){
        if (num < 2){
            return false;
        }
        if (div * div > num){
            return true;
        }
        if (num % div == 0){
            return false;
        }
        return calc(num, div + 1);
    }

    public static void main(String[] args){
        System.out.print("enter number: ");
        int input = sc.nextInt();

        if (calc(input, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
