import java.io.IOException;

/**
 * This class has only one responsibility: start the ATM program!
 */

public class Tester {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		ATM Atm = new ATM();
		
		Atm.Menu();
		
		/*
		 * Rather than hard coding one or more BankAccount objects, you'll need to read them in
		 * from our very primitive database (i.e., a flat-file). After making changes, of course,
		 * you'll need to update the database accordingly.
		 */
	}
}