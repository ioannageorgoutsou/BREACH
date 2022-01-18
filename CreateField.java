public class CreateField {

	//initializing variables
	//three weapons: Wooden arrows, Metallic arrows, Flaming arrows
	private String A11 = "Wooden arrows", A12 = "Metallic arrows", A13 = "Flaming arrows";
	private String[] ArrayField = {A11,A12,A13};
	private int obstaclecode = 1, weapon;
	private boolean flagField = false;
	private double px, py, pz;

	//method createField()
	public String createField() {

		//creating object for class Generator
		Generator GenField = new Generator();

		//calling method Generate(obstaclecode, flagField) of class Generator
		GenField.Generate(obstaclecode,flagField);

		//calling getters methods of class Generator
		px = GenField.getpx();
		py = GenField.getpy();
		pz = GenField.getpz();
		weapon = GenField.geti();

		//displaying messages about the possibility of each weapon
		String formattedDouble1 = String.format("%.02f", px);
		System.out.printf("The probability that " + A11 + " are at the field is " + formattedDouble1 + "\n");
		String formattedDouble2 = String.format("%.02f", py);
		System.out.printf("The probability that " + A12 + " are at the field is " + formattedDouble2 + "\n");
		String formattedDouble3 = String.format("%.02f", pz);
		System.out.printf("The probability that " + A13 + " are at the field is " + formattedDouble3 + "\n \n");

		//return defence code
		return "A1"+ Integer.toString(weapon);
	}

}
