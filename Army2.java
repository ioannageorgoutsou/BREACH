import java.util.Scanner;

public class Army2 extends Army1 {
	static Scanner in = new Scanner(System.in);
	private static int weapon2, code1, code2;

	//method army2
	public static String army2() {

		//displaying message
		System.out.println("Your fifth obstacle is the army.. Choose one of the two weapons:");

		//displaying two of the three weapons, not the one used in the 2nd obstacle
		do {
			if (weapon1 == 1) {
				System.out.println("Option 1: " + e32);
				code1 = 2;
				System.out.println("Option 2: " + e33);
				code2 = 3;
			} else if (weapon1 == 2) {
				System.out.println("Option 1: " + e31);
				code1 = 1;
				System.out.println("Option 2: " + e33);
				code2 = 3;
			} else {
				System.out.println("Option 1: " + e31);
				code1 = 1;
				System.out.println("Option 2: " + e32);
				code2 = 2;
			}

			//the player chooses a weapon
			do {
				weapon2 = in.nextInt();
			} while (weapon2 != 1 && weapon2 != 2);

			//checking
			if (weapon2 == 1 | weapon2 == 2) {
				System.out.println("Great choice! Time to attack!");
				switch(weapon2) {
				//returning attack code
				case 1:
					return ("E3" + Integer.toString(code1));
				case 2:
					return ("E3" + Integer.toString(code2));
				}
			} else {
				System.out.println("Please choose one of the two weapons.");
			}

		} while (weapon2 != 1 && weapon2 != 2);
		return " ";
	}
}