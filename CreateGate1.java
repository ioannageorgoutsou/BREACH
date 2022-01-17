public class CreateGate1 {

	//initializing variables
	//three weapons: Hot oil, Launching stones, Spikes
	protected static String A21 = "Hot oil", A22 = "Launching stones", A23 = "Spikes";
	protected static int weapon1, obstaclecode = 2;
	private static String[] ArrayGate = {A21,A22,A23};
	protected static boolean flagGate = false;
	protected static double px, py, pz;

	public static String createGate1() {

		//creating object of class Generator
		Generator GenGate = new Generator();
		//calling method Generate(obstaclecode, flagGate) of class Generator
		GenGate.Generate(obstaclecode,flagGate);

		//calling getters methods of class Generator
		px = GenGate.getpx();
		py = GenGate.getpy();
		pz = GenGate.getpz();
		weapon1 = GenGate.geti();

		//displaying messages about the possibility of each weapon
		String formattedDouble1 = String.format("%.02f", px);
		System.out.printf("The probability that " + A21 + " is at the gate is " + formattedDouble1 + "\n");
		String formattedDouble2 = String.format("%.02f", py);
		System.out.printf("The probability that " + A22 + " are at the gate is " + formattedDouble2 + "\n");
		String formattedDouble3 = String.format("%.02f", pz);
		System.out.printf("The probability that " + A23 + " are at the gate is " + formattedDouble3 + "\n \n");

		//return defence code
		return "A2"+ Integer.toString(weapon1);
	}

}