public class Attack{

	//initialize variables
	private boolean flagWall = false;
    private boolean flagGate = false;

	//method executeObstacles(obstaclecode, choice)
	public String executeObstacles (int obstaclecode, String choice) {

		if (obstaclecode == 1) {
			//creating object for class Plain
			Plain p = new Plain();
			flagWall = false;
			flagGate = false;

			//returning the result of method plain() of class Plain (attack code)
			return p.plain();

		}else if (obstaclecode ==2) {
			if (choice.equals("W")) {
				flagWall=true;
				//returning the result of method wall1() of class Wall1 (attack code)
				return Wall1.wall1();
			}else if (choice.equals("G")) {
				flagGate=true;
				//returning the result of method gate1() of class Gate1 (attack code)
				return Gate1.gate1();
			}

		}else if (obstaclecode ==3) {
			//returning the result of method army1() of class Army1 (attack code)
			return Army1.army1();

		}else if (obstaclecode ==4) {
			if (choice.equals("W")) {

				if (flagWall==true) {
					//returning the result of method wall2() of class Wall2 (attack code)
					return Wall2.wall2();
				}
				else {
					//returning the result of method wall1() of class Wall1 (attack code)
					return Wall1.wall1();
				}
			}
			else {

				if (flagGate==true) {
					//returning the result of method gate2() of class Gate2 (attack code)
					return Gate2.gate2();
				}
				else {
					//returning the result of method gate1() of class Gate1 (attack code)
					return Gate1.gate1();
				}

			}

		}else{
			//returning the result of method army2() of class Army2 (attack code)
			return Army2.army2();
		}
		return " ";
	}
}






