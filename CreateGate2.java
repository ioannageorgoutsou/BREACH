public class CreateGate2 extends CreateGate1{

	//initializing variables
	private static int weapon2, obstaclecode = 4;
	private static String[] ArrayGate2 = {"null", "null"}, ArrayCodes = {"null", "null"};;
	private static boolean flagGate2 = true;

	public static String createGate2() {

		//keep two weapons, not the one used in the 2nd obstacle
		if (weapon1 == 1) {
			ArrayGate2[0] = A22 ;
			ArrayCodes[0] = "A22";
			ArrayGate2[1] = A23 ;
			ArrayCodes[1] = "A23";
		}
		else if (weapon1 == 2) {
			ArrayGate2[0] = A21 ;
			ArrayCodes[0] = "A21";
			ArrayGate2[1] = A23 ;
			ArrayCodes[1] = "A23";

		}
		else {
			ArrayGate2[0] = A21 ;
			ArrayCodes[0] = "A21";
			ArrayGate2[1] = A22 ;
			ArrayCodes[1] = "A22";
		}

		//creating object of class Generator
		Generator GenGate2 = new Generator();
		//calling method Generate(obstaclecode, flagGate) of class Generator
		GenGate2.Generate(obstaclecode,flagGate2);

		//calling getters methods of class Generator
		px = GenGate2.getpx();
		py = GenGate2.getpy();
		weapon2 = GenGate2.geti();

		//displaying messages about the possibility of each weapon
		String formattedDouble1 = String.format("%.02f", px);
		System.out.printf("The probability that " + ArrayGate2[0] + " is/are at the gate is " + formattedDouble1 + "\n");
		String formattedDouble2 = String.format("%.02f", py);
		System.out.printf("The probability that " + ArrayGate2[1] + " are at the gate is " + formattedDouble2 + "\n \n");

		//return defence code
		return (ArrayCodes[weapon2-1]);
	}
}