public class CreateArmy1 {

	//initializing variables
	//three weapons: Archers, Spearmen, Swordsmen
	protected static int weapon1, obstaclecode = 3;
	protected static String A31 = "Archers", A32 = "Spearmen", A33 = "Swordsmen";
	private static String[] ArrayArmy = {A31,A32,A33};
	private static boolean flagArmy = false;
	protected static double px, py, pz;

	public static String createArmy1() {

		//creating object of class Generator
		Generator GenArmy = new Generator();
		//calling method Generate(obstaclecode, flagArmy) of class Generator
		GenArmy.Generate(obstaclecode,flagArmy);

		//calling getters methods of class Generator
		px = GenArmy.getpx();
		py = GenArmy.getpy();
		pz = GenArmy.getpz();
		weapon1 = GenArmy.geti();

		//displaying messages about the possibility of each weapon
		String formattedDouble1 = String.format("%.02f", px);
		System.out.printf("The probability that " + A31 + " are at the army is " + formattedDouble1 + "\n");
		String formattedDouble2 = String.format("%.02f", py);
		System.out.printf("The probability that " + A32 + " are at the army is " + formattedDouble2 + "\n");
		String formattedDouble3 = String.format("%.02f", pz);
		System.out.printf("The probability that " + A33 + " are at the army is " + formattedDouble3 + "\n \n");

		//return defence code
		return "A3"+ Integer.toString(weapon1);
	}

}
