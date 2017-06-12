package virtualpetsamok;

abstract class VirtualPets {

	protected String name;
	protected int health;
	protected String type;

	public VirtualPets(String name, String type) {
		this.name = name;
		this.health = 100;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	@Override
	public String toString() {
		return name + ":" + " Health: " + health + ", type " + type + ", isReal = ";
	}

}
