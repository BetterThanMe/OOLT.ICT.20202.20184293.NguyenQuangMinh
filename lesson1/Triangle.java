/*
 * Display a triangle with height f n stars
 */
import java.util.Scanner;


/**
 * Class to display a triangle
 * @version 0.0
 * @author minh
 */
public class Triangle {

	// Display triangle with height n
	public static void display(int n) {
		for (int i = 0; i < n; i++) {
			// print spaces
			for (int j = 0; j < n -i -1; j++){
				System.out.print(" ");
			}
			// print stars
			for (int j = 0; j < i * 2 + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Input n : int
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number n = ");
		int n = keyboard.nextInt();

		// Display
		display(n);

		System.exit(0);
	}
}