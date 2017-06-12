package virtualpetsamok;

public class OrganicDog extends Dogs implements Organic {
	private int cageFilth;
	private int bathroomNeed;
	private int thirst;
	private int hunger;

	public OrganicDog(String name, int bathroomNeed, int thirst, int hunger, int cageFilth) {
		super(name, "Real Dog");
		this.bathroomNeed = bathroomNeed;
		this.thirst = thirst;
		this.hunger = hunger;
		this.cageFilth = cageFilth;
	}

	public int getCageFilth() {
		return cageFilth;
	}

	public int getBathroomNeed() {
		return bathroomNeed;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public String individualOrganicDogStats() {
		return name + "\t|\t" + type + "\t|\t" + cageFilth + "\t|\t" + hunger + "\t|\t" + thirst + "\t|\t" + health
				+ "\t|\t" + bathroomNeed + "\t|\t";
	}

	@Override
	public void feed() {
		hunger -= 30;
		bathroomNeed += 10;
		health += 3;
	}

	@Override
	public void giveWater() {
		thirst -= 30;
		bathroomNeed += 10;
		health += 3;
	}

	public void takeToBathroom() {
		bathroomNeed -= 30;
		health += 3;
	}

	public void cleanCage() {
		cageFilth -= 40;
		health += 15;
	}

	@Override
	public void statScenarios() {
		if (hunger < 0) {
			hunger = 0;
		}
		if (hunger > 100) {
			hunger = 100;
			health -= 20;
		}
		if (hunger > 50) {
			health -= 10;
		}
		if (thirst < 0) {
			thirst = 0;
		}
		if (thirst > 100) {
			thirst = 100;
			health -= 20;
		}
		if (thirst > 50) {
			health -= 10;
		}
		if (health > 100) {
			health = 100;
		}
		if (health <= 0) {
			System.out.println("An organic dog has died, game over!");
			System.exit(0);
		}
		if (cageFilth < 0) {
			cageFilth = 0;
		}
		if (cageFilth > 100) {
			cageFilth = 100;
			health -= 30;
		}
		if (cageFilth > 50) {
			health -= 15;
		}
		if (bathroomNeed < 0) {
			bathroomNeed = 0;
		}
		if (bathroomNeed > 100) {
			bathroomNeed -= 50;
			cageFilth += 30;
		}
		if (bathroomNeed > 50) {
			cageFilth += 15;
			health -= 3;
		}
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		bathroomNeed += 5;
		cageFilth += 5;
	}
}