import java.util.Scanner;
public class Main {
    public static int sumDigits(long n) {
        int sum = 0;
        n = Math.abs(n);

        while (n > 0) {
            int lastDigit = (int) (n % 10);
            sum += lastDigit;
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to sum its digits:");
        long number = scanner.nextLong();

        int result = sumDigits(number);
        System.out.println("The sum of the digits: " + result);

        scanner.close();
    }
}