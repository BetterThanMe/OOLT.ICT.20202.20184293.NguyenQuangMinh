/*
 * Get from input 2 number and print
 */
import javax.swing.JOptionPane;


/**
 * The class is taking 2 number and return a message
 * @version 0.0
 * @author minh
 */
public class ShowTwoNumber {
	// inplementation
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";

		strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input the fisrt number",
											  JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";

		strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input the second number",
											  JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;

		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", 
									  JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}