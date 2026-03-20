import java.util.Scanner;

public class task8 {
    public static boolean digits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return digits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string: ");
        String s = scanner.nextLine();

        System.out.println(digits(s, 0) ? "Yes" : "No");

        scanner.close();
    }
}
