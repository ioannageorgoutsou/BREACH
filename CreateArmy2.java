public class CreateArmy2 extends CreateArmy1{

	//initializing variables
	private static int weapon2, obstaclecode = 5;
	private static String[] ArrayArmy2 = {"null", "null"}, ArrayCodes = {"null", "null"};;
	private static boolean flagArmy2 = true;

	public static String createArmy2() {

		//keep two weapons, not the one used in the 2nd obstacle
		if (weapon1 == 1) {
			ArrayArmy2[0] = A32;
			ArrayCodes[0] = "A32";
			ArrayArmy2[1] = A33;
			ArrayCodes[1] = "A33";
		}
		else if (weapon1 == 2) {
			ArrayArmy2[0] = A31;
			ArrayCodes[0] = "A31";
			ArrayArmy2[1] = A33;
			ArrayCodes[1] = "A33";

		}
		else {
			ArrayArmy2[0] = A31;
			ArrayCodes[0] = "A31";
			ArrayArmy2[1] = A32;
			ArrayCodes[1] = "A32";
		}

		//creating object of class Generator
		Generator GenArmy2 = new Generator();
		//calling method Generate(obstaclecode, flagWall2) of class Generator
		GenArmy2.Generate(obstaclecode,flagArmy2);

		//calling getters methods of class Generator
		px = GenArmy2.getpx();
		py = GenArmy2.getpy();
		weapon2 = GenArmy2.geti();

		//displaying messages about the possibility of each weapon
		String formattedDouble1 = String.format("%.02f", px);
		System.out.printf("The probability that " + ArrayArmy2[0] + " are at the army is " + formattedDouble1 + "\n");
		String formattedDouble2 = String.format("%.02f", py);
		System.out.printf("The probability that " + ArrayArmy2[1] + " are at the army is " + formattedDouble2 + "\n \n");

		//return defence code
		return ArrayCodes[weapon2-1];
	}
}
