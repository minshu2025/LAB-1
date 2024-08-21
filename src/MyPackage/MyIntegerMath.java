package MyPackage;

public class MyIntegerMath {
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

	    // Method to check if a number is an Armstrong number
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

}
