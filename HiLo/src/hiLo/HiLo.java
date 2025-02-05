package hiLo;
import java.util.Scanner;
public class HiLo {

	public static void main(String[] args) {
		//Scanner to read user input directly from the keyboard
		
		Scanner scan = new Scanner(System.in);
		/*int number = scan.nextInt();
		String string = scan.nextLine();*/
		//.create a random number for the user to guess
		
		int theNumber = (int)(Math.random() * Math.pow(10, 2) + 1);
		//System.out.println(theNumber);
		
		int guess = 0;
		System.out.println("Guess a number between 0 to 100: ");
		guess = scan.nextInt();
		System.out.println("You entered "+guess+"." );
	}

}
