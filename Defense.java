public class Defense {

	//initializing variables
	private static boolean flagWall = false;
    private static boolean flagGate = false;

	//method executeCreate(obstaclecode, choice)
	public String executeCreate(int obstaclecode, String choice) {

		if (obstaclecode == 1) {
			//creating object for class CreateField
			CreateField field = new CreateField();
			flagWall = false;
			flagGate = false;

			//returning the result of method createField() of class CreateField (defence code)
			return field.createField();

		}else if (obstaclecode == 2 && choice.equals("W")) {
			//creating object for class CreateWall1
			CreateWall1 wall1 = new CreateWall1();
			flagWall = true;

			//returning the result of method createWall1() of class CreateWall1 (defence code)
			return wall1.createWall1();

		}else if (obstaclecode == 2 && choice.equals("G")) {
			//creating object for class CreateGate1
			CreateGate1 gate1 = new CreateGate1();
			flagGate = true;

			//returning the result of method createGate1() of class CreateGate1 (defence code)
			return gate1.createGate1();

		}else if (obstaclecode == 3) {
			//creating object for class CreateArmy1
			CreateArmy1 army1 = new CreateArmy1();

			//returning the result of method createArmy1() of class CreateArmy1 (defence code)
			return army1.createArmy1();

		}else if (obstaclecode == 4) {
			if (choice.equals("W")) {
				if (flagWall == true) {

					//creating object for class CreateWall2
					CreateWall2 wall2 = new CreateWall2();
					//returning the result of method createWall2() of class CreateWall2 (defence code)
			        return wall2.createWall2();
				}
				else {

					//creating object for class CreateWall1
					CreateWall1 wall1 = new CreateWall1();

					//returning the result of method createWall1() of class CreateWall1 (defence code)
			        return wall1.createWall1();
				}
			}
			else {
				if (flagGate == true) {

					//creating object for class CreateGate2
					CreateGate2 gate2 = new CreateGate2();
					//returning the result of method createGate2() of class CreateGate2 (defence code)
					return gate2.createGate2();
				}
				else {

					//creating object for class CreateGate1
					CreateGate1 gate1 = new CreateGate1();

					//returning the result of method createGate1() of class CreateGate1 (defence code)
			        return gate1.createGate1();
				}

			}

	//Obstacle code 5
		}else{

			//creating object for class CreateField
			CreateArmy2 army2 = new CreateArmy2();

			//returning the result of method createArmy2() of class CreateArmy2 (defence code)
			return army2.createArmy2();
		}

	}
}
















