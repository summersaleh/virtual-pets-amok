package virtualpetsamok;

public class RoboticCat extends Cats implements Robotic {

	private int catMaintainenceNeed;

	public RoboticCat(String name, int catMaintainenceNeed) {
		super(name, "Robotic Cat");
		this.catMaintainenceNeed = catMaintainenceNeed;
	}

	@Override
	public void performMaintainence() {
		health += 15;
		catMaintainenceNeed -= 40;

	}

	public String individualRobotCatStats() {
		return name + "\t|\t" + type + "\t|\t" + catMaintainenceNeed + "\t|\t" + health + "\t|\t";
	}

	@Override
	public void statScenarios() {
		if (health > 100) {
			health = 100;
		}
		if (health <= 0) {
			System.out.println("A robotic cat has malfunctioned, game over!");
			System.exit(0);
		}
		if (catMaintainenceNeed < 0) {
			catMaintainenceNeed = 0;
		}
		if (catMaintainenceNeed > 100) {
			catMaintainenceNeed = 100;
			health -= 30;
		}
		if (catMaintainenceNeed > 50) {
			health -= 10;
		}
	}

	public void tick() {
		catMaintainenceNeed += 8;
	}

}