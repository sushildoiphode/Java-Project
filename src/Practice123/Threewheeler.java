package Practice123;

public class Threewheeler extends vehicle{

	@Override
	public int setMaxSpeed(int maxSpeed) {
		if(maxSpeed>70) {
			System.err.println("Three wheeler speed exceed 70kmph");
		}else {
			maxSpeed=maxSpeed;
		}
		return maxSpeed;
	}

}
