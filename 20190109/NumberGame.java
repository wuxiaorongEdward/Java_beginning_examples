/*
    generate a random number using Math.random(), then the user input a guess number
	if guessNumber greater the the randomm numbert , then print "greater"
	else if guessNumber less than the random number, then print "less"
	else, print "congratulations , you make it"
*/
import java.util.Scanner;

class NumberGame {
	public static void main(String[] args) {
   int randomNumber = (int) (Math.random() * 100 + 1 );
    // double random = Math.random();
	// System.out.println(randomNumber);
    System.out.println("enter a your guess number 1-100 :  ");

    Scanner input = new Scanner(System.in);
    
     while(true) {
		 
		  int guessNumber = input.nextInt();
		 if (guessNumber > randomNumber) {
			 System.out.println("Greater");
		 }
		 else if (guessNumber < randomNumber) {
			 System.out.println("Less");
		 }
		 else {
			 System.out.println("Congratulations, you make it");
			 break;
		 }
	 }
 
	}
}