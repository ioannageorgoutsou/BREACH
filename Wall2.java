import java.util.Scanner;

public class Wall2 extends Wall1 {

		static Scanner in = new Scanner(System.in);
		private static int weapon2, code1, code2;

		//method wall2
		public static String wall2() {
			//displaying message
			System.out.println("You chose the wall as your fourth obstacle. You now have to choose one of the two weapons left to attack: ");

			//displaying two of the three weapons, not the one used in the 2nd obstacle
			do {
				if (weapon1 == 1) {
					System.out.println("Option 1:" + e22);
					code1 = 2;
					System.out.println("Option 2:" + e23);
					code2 = 3;
				} else if (weapon1 == 2) {
					System.out.println("Option 1:" + e21);
					code1 = 1;
					System.out.println("Option 2:" + e23);
					code2 = 3;
				} else {
					System.out.println("Option 1:" + e21);
					code1 = 1;
					System.out.println("Option 2:" + e22);
					code2 = 2;
				}
				//player's choice
				do {
					weapon2 = in.nextInt();
				} while (weapon2 != 1 && weapon2 != 2);

				//checking
				if (weapon2 == 1 | weapon2 == 2) {
					System.out.println("Great choice! Time to attack!");
					switch(weapon2) {
					//returning attack code
						case 1:
							return ("E2" + Integer.toString(code1));
						case 2:
							return ("E2" + Integer.toString(code2));
					}
				} else {
					System.out.println("Please choose one of the two weapons.");
				}

		} while (weapon2 != 1 && weapon2 != 2);

		return " ";
		}
	}

