import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
	
	boolean isprime = true;
	String jazz = JOptionPane.showInputDialog("Tell me a number");
	int jojo = Integer.parseInt(jazz);
	for (int i = 2; i < jojo; i++) {
		if (jojo % i ==0) {
			isprime = false;
		}
	}
	if(isprime == false) {
		JOptionPane.showMessageDialog(null, "Your number is composite");	
		}
	else {
		JOptionPane.showMessageDialog(null, "Your number is prime");
	}
	
	
	
	
	
	
	
	
	
}
}
