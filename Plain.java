import java.util.Scanner;

public class Plain {
	Scanner in = new Scanner (System.in);

	//initializing variables
	private int weapon1;

	//three weapons: Wooden shields, Metallic shields, Chariots
	private String e11 = "Wooden shields", e12 = "Metallic shields", e13 = "Chariots";

	//method plain()
	public String plain() {

		//displaying messages about the first obtacle
		System.out.println("The battle begins! Your first obstacle is ... the plain. You will try to reach the castle's outer walls."+
			"Troyans will try to stop you by using either wooden, metallic or fiery arrows. ");
		System.out.println("You now need to choose ONE weapon to attack.");

		// while weapon1 isn't equal to 1,2 or 3
		do {

			//displaying the three choices
			System.out.println("Option 1: " + this.e11);
			System.out.println("Option 2: " + this.e12);
			System.out.println("Option 3: " + this.e13);

			//the player chooses a weapon
			do {
				this.weapon1 = in.nextInt();
			} while (weapon1 != 1 && weapon1 != 2 && weapon1 !=3);

			if (this.weapon1 == 1 | this.weapon1 == 2 | this.weapon1 == 3) {
				System.out.println("\nGreat choice! Time to attack!");
			} else {
				System.out.println("Please choose one of the three weapons.");
			}

			//returning the attack code
			return "E1"+ Integer.toString(this.weapon1);

		} while (this.weapon1 != 1 && this.weapon1 != 2 && this.weapon1 != 3 );

	}
}