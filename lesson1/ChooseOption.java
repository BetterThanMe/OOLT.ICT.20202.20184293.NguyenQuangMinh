/*
 * Choose an option 
 */
import javax.swing.JOptionPane;


/**
 * the class get the decision
 * @version 0.0
 * @author minh
 */
public class ChooseOption {
	// implementation
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to try your best?");

		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION? "Yes" : "No"));
		
		System.exit(0);
	}	
}