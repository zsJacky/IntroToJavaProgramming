package exercise;
import java.util.Scanner;

public class SumInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		int digit = input.nextInt();
		
		int a = digit % 10; // ��λ
		int b = digit % 100 / 10; // ʮλ
		int c = digit / 100;	// ǧλ
		int sumOfDigit = a + b + c;
		
		System.out.println("The sum of the digits is " + sumOfDigit);
	}
}
