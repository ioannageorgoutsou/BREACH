import java.util.Scanner;
public class ChooseObstacle {

	static Scanner in = new Scanner(System.in);
	private static String choice, a1 = "Wall", a2 = "Gate";

	//method obstacle1
	public static String obstacle1() {
		//displaying message
		System.out.println("You now have a choice for the next obstacle. This is either the wall, where the Troyans will attack with heating oil, rocks or archers, or the gate where the Troyans will attack with heating oil, rocks or spikes. Choose where you want to breach:");

		//choose W(:Wall) or G(:Gate)
		do {
			System.out.println("Option 1: " + a1);
			System.out.println("Option 2: " + a2);
			System.out.println("Press 'W' for the wall or 'G' for the gate \n");
			choice = in.nextLine();
		} while (!choice.equals("W") && !choice.equals("G"));
		return choice;

	}

	//method obstacle2
	public static String obstacle2() {
		//displaying message
		System.out.println("You now have a choice for the next obstacle. This is either the wall, where the Troyans will attack with heating oil, rocks or archers, or the gate where the Troyans will attack with heating oil, rocks or spikes. Choose where you want to breach:");

		//choose W(:Wall) or G(:Gate)
		do {
			System.out.println("Option 1: " + a1);
			System.out.println("Option 2: " + a2);
			System.out.println("Press 'W' for the wall or 'G' for the gate \n");
			choice = in.nextLine();
		} while (!choice.equals("W") && !choice.equals("G"));
		return choice;
	}
}