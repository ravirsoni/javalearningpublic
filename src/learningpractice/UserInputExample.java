package learningpractice;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {

		try (Scanner myScanner = new Scanner(System.in)) {
			System.out.println("Enter your name :");

			String userName = myScanner.nextLine();
			System.out.println("Your name is : " + userName);
		}
		System.out.println("Thanks you" + " ");
	}

}
