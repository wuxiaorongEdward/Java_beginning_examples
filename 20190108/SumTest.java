/*
    use class to calculate the sum of a, b
*/

import java.util.Scanner;
class Sum {
	public int getSum(int a, int b) {
		return a + b;
	}
}

class SumTest {
	public static void main(String [] args) {
		Sum sum = new Sum();
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter the first number : ");
		int a = input.nextInt();
		System.out.print("enter the second number : ");
		int b = input.nextInt();
		int s = sum.getSum(a, b);
		System.out.println(s);
	}
}