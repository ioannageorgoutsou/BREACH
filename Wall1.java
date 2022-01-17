import java.util.Scanner;

public class Wall1 {
	static Scanner in = new Scanner(System.in);

	//initializing variables
	protected static int weapon1;
	//three weapons: Battering ram, Breaching tower, Ladder
	protected static String e21 = "Battering ram", e22 = "Breaching tower", e23 = "Ladder";

	//method wall1
	public static String wall1() {
		System.out.println("You chose the wall as your next obstacle. You now have to choose one of the three weapons to attack: ");

		//Choose one of the three weapons: battering ram, breaching tower, ladder
		do {
			//options
			System.out.println("Option 1: " + e21);
			System.out.println("Option 2: " + e22);
			System.out.println("Option 3: " + e23);

			//player's choice
			do {
				weapon1 = in.nextInt();
			} while (weapon1 != 1 && weapon1 != 2 && weapon1 !=3);

			//checking
			if (weapon1 == 1 | weapon1 == 2 | weapon1 == 3) {
				System.out.println("Great choice! Time to attack!");
			} else {
				System.out.println("Please choose one of the three weapons.");
			}

		} while (weapon1 != 1 && weapon1 != 2 && weapon1 != 3 );

		//returning attack code
		return "E2"+ Integer.toString(weapon1);

	}

}


