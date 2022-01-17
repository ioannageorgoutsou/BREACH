import java.util.Scanner;

public class Army1 {
	static Scanner in = new Scanner(System.in);
	//initializing variables
	protected static int weapon1;
	//three weapons: Archers, Spearmen, Swordsmen
	protected static String e31 = "Archers", e32 = "Spearmen", e33 = "Swordsmen";

	//method army1
	public static String army1() {
		//Choose one of the three weapons: Archers, Spearmen, Swordsmen
		System.out.println("Your third obstacle is the army... Either Troyans archers, spearmen or swordmen will attack you. Choose one of the three weapons:");

		do {
			//options
			System.out.println("Option 1:" + e31);
			System.out.println("Option 2:" + e32);
			System.out.println("Option 3:" + e33);

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
		return "E3" + Integer.toString(weapon1);
	}

}