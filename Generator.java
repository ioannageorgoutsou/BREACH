import java.util.Random;

public class Generator {

	//initializing variables
	private double px;
	private double py;
	private double pz;
	private int i;

	//method Generate(obstaclecode, flag)
	public void Generate(int obstaclecode,boolean flag) {

		//object of class Random
		Random rand = new Random();

		double randx = rand.nextDouble() + 0.3;
		double randy = rand.nextDouble() + 0.3;
		double randz = rand.nextDouble() + 0.3;

		if ((obstaclecode == 4 && flag == true) || obstaclecode == 5) {
				randz = 0.0;
		}

		double Sum = randx + randy + randz;

		this.px = (float)randx / Sum;
		this.py = (float)randy / Sum;
		this.pz = (float)randz / Sum;

		int randC = rand.nextInt(100);
  		randC = randC + 1;
		this.i = 0;
		if (randC <= px * 100) {
			i = 1;
		} else if (randC <= (px + py) * 100) {
			i = 2;
		} else {
			if (randz != 0) {
				i = 3;
			}
		}

	}

	//Getters


	public double getpx(){
		return px;
	}

	public double getpy(){
		return py;
	}

	public double getpz(){
		return pz;
	}

	public int geti(){
		return i;
	}

}


