import java.util.Scanner;


public class BooleanTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Please enter an A value");
		boolean a = keyboard.nextBoolean();
		System.out.println("Please enter a B value");
		boolean b = keyboard.nextBoolean();
		System.out.println("Please enter a C value");
		boolean c = keyboard.nextBoolean();
		System.out.println("Please enter a D value");
		boolean d = keyboard.nextBoolean();
		boolean logicGate = ((a && b) || (c && d)) || ((c && a) || (a && d)) || ((c && a) || (a && d)) || ((d && b) || (b && c));
		System.out.println("The final answer is " + logicGate);
		
		keyboard.close();
	}

}