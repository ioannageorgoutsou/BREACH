import java.util.Random;
import java.util.Scanner;

public class Output {

	//initializing variables
	//Table1 for obstacle1 // Table2 for obstacles 2,4 / Table3 for obstacles 3,5
	//1: win, 2: defeat, 0: 50% win- 50% defeat
	private String [] [] Table1 = {{"T1", "A11", "A12", "A13"}, {"E11", "1", "0", "2"}, {"E12", "2", "1", "0"}, {"E13", "0", "2", "1"}};
	private String [] [] Table2 = {{"T21", "A21", "A22", "A23"}, {"E21", "1", "0", "2"}, {"E22", "0", "1", "2"}, {"E23", "2", "0", "1"}};
	private String [] [] Table3 = {{"T3", "A31", "A32", "A33"}, {"E31", "1", "0", "2"}, {"E32", "2", "1", "0"}, {"E33", "0", "2", "1"}};
	private String [] [] Table = {{"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}};
	private int p,j;

	//method getOutput(t = obstaclecode, a = defence code, b = attack code)
	public boolean getOutput(int t, String a, String b) {

		//creating objects of classes Random, Scanner
		Random random = new Random();
		Scanner in = new Scanner (System.in);

		//selecting obstacle code (t)
		switch (t) {

		//if t = 1, choose Table1 [i] [j]
		case 1:
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					Table [i] [j] = Table1 [i] [j];
				}
			}
			break;
		//if t = 2, choose Table2 [i] [j]
		case 2:
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					Table [i] [j] = Table2 [i] [j];
				}
			}
			break;

		//if t = 3, choose Table3 [i] [j]
		case 3:
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					Table [i] [j] = Table3 [i] [j];
				}
			}
			break;

		//if t = 4, choose Table2 [i] [j]
		case 4:
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					Table [i] [j] = Table2 [i] [j];
				}
			}
			break;

		//if t = 5, choose Table3 [i] [j]
		case 5:
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					Table [i] [j] = Table3 [i] [j];
				}
			}
			break;
		}

		//keeping the place of a and b on the table
		for (int i = 0; i < 4; i++) {
			if (a.equals(Table [0] [i])) {
				p = i;
			}
			if (b.equals(Table [i] [0])) {
				j = i;
			}
		}

		//finding the result(1, 2 or 0)
		if ((Table [j] [p]).equals("1")) {
			return true;
		} else if ((Table [j] [p]).equals("2")) {
			return false;
		} else {
			//if the result is zero, we calculate it with 50% possibility to win and 50% possibility to lose
			int r = new Random().nextBoolean() ? 1 : 2;
			if (r == 1) {
				return true;
			}else {
				return false;
			}

		}
	}
}


