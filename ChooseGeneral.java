import java.util.Scanner;

public class ChooseGeneral {
	Scanner in = new Scanner(System.in);
	//initialize variable
	private int general;

	//method General()
	public String General() {

		//while general is not equal to 1,2 or 3
		do {
			//display messages in order to choose general
			System.out.println("Now it is time to pick a general");

			//Achilles
			System.out.println("Option 1: Achilles is the best warrior amongst Achaeans. " +
			"He is very brave and has weapons that don't get worn easily.");

			//Odysseus
			System.out.println("Option 2: Odysseus is a strong, courageous warrior and the most clever Achaean."+
			"He is a favorite of the goddess Athena, who often sends him divine aid.");

			//Agamemnon
			System.out.println("Option 3: Agamemnon is the commander-in-chief of the Achaeans during the Trojan War."+
			"He is presented as a great and ruthless warrior.");

			//player chooses 1,2 or 3
			this.general = in.nextInt();

			//display messages about the choice
			if (this.general == 1) {
				System.out.println("Great choice! Your general is Achilles.\n");
				return "Achilles";
			} else if (this.general == 2) {
				System.out.println("Great choice! Your general is Odysseus.\n");
				return "Odysseus";
			} else if (this.general == 3) {
				System.out.println("Great choice! Your general is Agamemnon.\n");
				return "Agamemnon";
			} else {
				System.out.println("Please choose one of the three generals.");
			}

		} while (this.general != 1 && this.general != 2 && this.general != 3 );

		return "Something went wrong";
	}
}