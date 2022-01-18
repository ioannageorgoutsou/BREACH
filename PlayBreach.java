import java.util.Scanner;

public class PlayBreach {

	//initializing variables
	static Scanner in = new Scanner(System.in);
	private static int answer;
	//creating an object of class Intro
	static Intro i = new Intro();

	public static void main(String [] args) {
		//calling the method introduction() of class Intro
		i.introduction();
		//calling the static method breachTroia() of class Breach
		Breach.breachTroia();
		do {
			//printing the menu
			System.out.println("Press 1 to play again \nPress 2 to exit\nPress 3 to see the instructions\n");

			//the player chooses a number 1-3
			do {
				answer = in.nextInt();
			} while ((answer != 1) && (answer != 2) && (answer != 3));

			switch(answer) {
				case (1):
					System.out.println("\n NEXT GAME -------------------------------------------------------");
					//calling the static method breachTroia() of class Breach
					Breach.breachTroia();
					answer = 0;
					break;
				case (2):
					System.exit(0);
				case (3):
					System.out.println("Instructions");
					answer = 0;
					//calling the method introduction() of class Intro
					i.introduction();
					break;
			}
		} while ((answer != 1) && (answer != 2) && (answer != 3));
	}
}