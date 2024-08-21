package MyPackage1;
import java.util.Scanner;

import MyMathematics.MyIntegerMath;

public class MyDemo {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt(); 
	        int numberFactorial = MyIntegerMath.factorial(number);
	        System.out.println("Factorial of " + number + " is: " + numberFactorial);

	        if (MyIntegerMath.isStrong(number)) {
	            System.out.println(number + " is a Strong number.");
	        } else {
	            System.out.println(number + " is not a Strong number.");
	        }
	        System.out.println("Number of digits in " + number + " is: " + MyIntegerMath.countDigits(number));

	        if (MyIntegerMath.isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	}