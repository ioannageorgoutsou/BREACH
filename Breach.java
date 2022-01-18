import java.util.Scanner;

public class Breach {

	static Scanner in = new Scanner(System.in);

	//initializing variables
	private static int obstaclecode;
	private static String choice = "A", e, a;
	private static boolean con;

	//creating objects for the following classes: Defense, ChooseGeneral, ChooseObstacle, Attack, Output
	static Defense d = new Defense();
	static ChooseGeneral c = new ChooseGeneral();
	static Output o = new Output();
	static Attack p = new Attack();

	public static void breachTroia() {
		obstaclecode = 1;
		//calling method General() of class Choose General
		c.General();

		//loop while the player is winning and the obstacle code is between 1-5
		do {
			System.out.println("\nObstacle: " + obstaclecode + " -------------------------------------------------------\n \n");
			//calling method executeCreate(obstaclecode, choice) of class Defense
			//a : defence code
			a = d.executeCreate(obstaclecode, choice);

			//calling method executeObstacles(obstaclecode, choice) of class Attack
			//e : attack code
			e = p.executeObstacles(obstaclecode, choice);

			//calling method getOutput(obstaclecode, a, e) of class Output
			//con is either true(win) or false(defeat)
			con = o.getOutput(obstaclecode, a, e);

			if (con == true) {
				System.out.println("You won! \n");

				//obstacle code is increased by 1
				obstaclecode ++;

				if (obstaclecode == 2) {

					//calling method obstacle1() of class ChooseObstacle
					//choice is either "W" (wall) or "G" (gate)
					choice = ChooseObstacle.obstacle1();

				} else if(obstaclecode == 4) {

					//calling method obstacle2() of class ChooseObstacle
					//choice is either "W" (wall) or "G" (gate)
					choice = ChooseObstacle.obstacle2();

				}

			}else {
				System.out.println ("You lost! \n");
			}

		} while (con == true && obstaclecode < 6);

		if (obstaclecode == 6) {
			System.out.println("You won the Trojans! Congratulations! \n END OF THE GAME");
		}

	}
}