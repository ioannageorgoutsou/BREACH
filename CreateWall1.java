public class CreateWall1 {

	//initializing variables
	//three weapons: Hot oil, Launching stones, Spikes
	protected static int weapon1, obstaclecode = 2;
	protected static String A21 = "Hot oil", A22 = "Launching stones", A23 = "Archers";
	private static String[] ArrayWall = {A21,A22,A23};
	private static boolean flagWall = false;
	protected static double px, py, pz;

	public static String createWall1() {

		//creating object of class Generator
		Generator GenWall = new Generator();
		//calling method Generate(obstaclecode, flagWall) of class Generator
		GenWall.Generate(obstaclecode,flagWall);

		//calling getters methods of class Generator
		px = GenWall.getpx();
		py = GenWall.getpy();
		pz = GenWall.getpz();
		weapon1 = GenWall.geti();

		//displaying messages about the possibility of each weapon
		String formattedDouble1 = String.format("%.02f", px);
		System.out.printf("The probability that " + A21 + " is at the wall is " + formattedDouble1 + "\n");
		String formattedDouble2 = String.format("%.02f", py);
		System.out.printf("The probability that " + A22 + " are at the wall is " + formattedDouble2 + "\n");
		String formattedDouble3 = String.format("%.02f", pz);
		System.out.printf("The probability that " + A23 + " are at the wall is " + formattedDouble3 + "\n \n");

		//return defence code
		return "A2" + Integer.toString(weapon1);

	}

}