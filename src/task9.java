import java.util.Scanner;

public class task9 {
    public static int count(String s, int i) {
        if (i == s.length()) return 0;
        return 1 + count(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String s = scanner.nextLine();

        System.out.println(count(s, 0));

        scanner.close();
    }
}
