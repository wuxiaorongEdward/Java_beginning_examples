/*
   input a, n
   sn = a + aa + aaa + aaaa + .....
*/

import java.util.Scanner;

class AnSum {
	public static void main(String[] args) {
		int sum = 0;
		int an = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = input.nextInt();
		System.out.print("Enter n : ");
		int n = input.nextInt();
         for(int i = 0; i < n; i++) {
			 an += a;
			 sum += an;
			 an = an * 10;
		 }
        System.out.println(sum);		 
	}
}