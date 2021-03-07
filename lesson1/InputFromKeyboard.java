/*
 * Get some data from keyboard - input stream?
 */
import java.util.Scanner;


/**
 * class takes some informatio from keyboard
 * @version 0.0
 * @author minh
 */
public class InputFromKeyboard {
	// Not sure if it need a comment?
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is ur name? ");
		String strName = keyboard.nextLine();

		System.out.println("How old are you? ");
		int age = keyboard.nextInt();

		System.out.println("How tall are you(m)? ");
		double height = keyboard.nextDouble();

		System.out.println("Mrs/Mr. " + strName + ", age: " + age + " years old.\n"
						    + "Height: " + height + ".");
	}
}