package virtualpetsamok;

public class RoboticDog extends Dogs implements Robotic {

	private int dogMaintainenceNeed;

	public RoboticDog(String name, int dogMaintainenceNeed) {
		super(name, "Robotic Dog");
		this.dogMaintainenceNeed = dogMaintainenceNeed;
	}

	@Override
	public void performMaintainence() {
		health += 15;
		dogMaintainenceNeed -= 20;

	}

	public String individualRobotDogStats() {
		return name + "\t|\t" + type + "\t|\t" + dogMaintainenceNeed + "\t|\t" + health + "\t|\t";
	}

	public void walkRoboticDog() {
		dogMaintainenceNeed -= 20;
		health += 5;
	}

	@Override
	public void statScenarios() {
		if (health > 100) {
			health = 100;
		}
		if (health <= 0) {
			System.out.println("A robotic dog has malfunctioned, game over!");
			System.exit(0);
		}
		if (dogMaintainenceNeed < 0) {
			dogMaintainenceNeed = 0;
		}
		if (dogMaintainenceNeed > 100) {
			dogMaintainenceNeed = 100;
			health -= 30;
		}
		if (dogMaintainenceNeed > 50) {
			health -= 10;
		}
	}

	public void tick() {
		dogMaintainenceNeed += 8;
	}

}