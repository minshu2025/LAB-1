package MyPackage;
import java.util.Scanner;

public class MyFirstClass {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;  
            sum += factorial(digit);  
            num /= 10;
        }

        return sum == originalNum;
    }
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        int numberFactorial = factorial(number);
        System.out.println("Factorial of " + number + " is: " + numberFactorial);

        if (isStrong(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
        System.out.println("Number of digits in " + number + " is: " + countDigits(number));

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}


