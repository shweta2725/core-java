enum TrafficLight {
	RED(10),
	GREEN(20),
	YELLOW(30);

	private int duration;

	TrafficLight(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
}

public class Q4_TestTrafficLight {
	public static void main(String[] args) {
		for(TrafficLight light : TrafficLight.values()) {
			System.out.println(light + " : " + light.getDuration() + " sec");
		}
	}
}
