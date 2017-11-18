import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		Random ran = new Random ();
		
		// any number out of 0 and 100;
		int result = -1;
		int random = ran.nextInt(101);  // picking a number between 0 - 100;
		int count = 0;
		
		while (result != random) {
		
			if(count ==0) {
				
				System.out.println("please guss the number");
				
			} else {
				System.out.println("Please guess a number again");
			}
			
			result = scn.nextInt();

				if (result < random) {
					System.out.println("Too low");
					
				} else if (result > random) {
					System.out.println("too high");
					
				} else {
					
					System.out.println("You got it");
					
				}
				count++;
			}
	
		System.out.println("Thanks for playing my game");
		System.out.println("It took you  " + count + "  tries");
		
			
		}
		
		
	}

