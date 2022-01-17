public class CreateWall2 extends CreateWall1 {

	//initializing variables
	private static int weapon2, obstaclecode = 4;
	private static String[] ArrayWall2 = {"null", "null"}, ArrayCodes = {"null", "null"};
	private static boolean flagWall2 = true;

	public static String createWall2(){

		//keep two weapons, not the one used in the 2nd obstacle
		if (weapon1 == 1) {
			ArrayWall2[0] = A22 ;
			ArrayCodes[0] = "A22";
			ArrayWall2[1] = A23 ;
			ArrayCodes[1] = "A23";
		}
		else if (weapon1 == 2) {
			ArrayWall2[0] = A21 ;
			ArrayCodes[0] = "A21";
			ArrayWall2[1] = A23 ;
			ArrayCodes[1] = "A23";

		}
		else {
			ArrayWall2[0] = A21 ;
			ArrayCodes[0] = "A21";
			ArrayWall2[1] = A22 ;
			ArrayCodes[1] = "A22";
		}

		//creating object of class Generator
		Generator Gen = new Generator();
		//calling method Generate(obstaclecode, flagWall2) of class Generator
		Gen.Generate(obstaclecode,flagWall2);

		//calling getters methods of class Generator
		px = Gen.getpx();
		py = Gen.getpy();
		weapon2 = Gen.geti();

		//displaying messages about the possibility of each weapon
		String formattedDouble1 = String.format("%.02f", px);
		System.out.printf("The probability that " + ArrayWall2[0] + " is/are at the wall is " + formattedDouble1 + "\n");
		String formattedDouble2 = String.format("%.02f", py);
		System.out.printf("The probability that " + ArrayWall2[1] + " are at the wall is " + formattedDouble2 + "\n \n");

		//return defence code
		return ArrayCodes[weapon2-1];
	}
}
