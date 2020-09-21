package Practice123;

public class Fourwheeler extends vehicle {

	@Override
	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>220) {
			System.err.println("Fourwheeler Speed exceed 220kmph");
		}else {
			maxSpeed=maxSpeed;
		}
		return maxSpeed;
	}

}
