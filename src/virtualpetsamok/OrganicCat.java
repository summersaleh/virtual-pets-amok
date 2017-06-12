package virtualpetsamok;

public class OrganicCat extends Cats implements Organic {
	private int litterboxFilth;
	private int thirst;
	private int hunger;

	public OrganicCat(String name, int thirst, int hunger) {
		super(name, "Real Cat");
		this.thirst = thirst;
		this.hunger = hunger;
		this.litterboxFilth = 0;
	}

	public int getLitterboxFilth() {
		return litterboxFilth;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public String individualOrganicCatStats() {
		return name + "\t|\t" + type + "\t|\t" + litterboxFilth + "\t|\t" + hunger + "\t|\t" + thirst + "\t|\t" + health
				+ "\t|\t";
	}

	@Override
	public void feed() {
		hunger -= 30;
		litterboxFilth += 3;
		health += 3;
	}

	@Override
	public void giveWater() {
		thirst -= 30;
		litterboxFilth += 3;
		health += 3;
	}

	public void cleanLitterbox() {
		litterboxFilth -= 40;
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
			System.out.println("An organic cat has died, game over!");
			System.exit(0);
		}
		if (litterboxFilth < 0) {
			litterboxFilth = 0;
		}
		if (litterboxFilth > 100) {
			litterboxFilth = 100;
			health -= 30;
		}
		if (litterboxFilth > 50) {
			health -= 15;
		}
	}

	public void tick() {
		hunger += 5;
		thirst += 5;
		litterboxFilth += 5;
	}
}
