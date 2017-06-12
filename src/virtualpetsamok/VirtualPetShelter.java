package virtualpetsamok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, RoboticDog> roboticDogRoster = new HashMap<String, RoboticDog>();

	public void intakeNewRoboticDog(RoboticDog dog) {
		roboticDogRoster.put(dog.getName().toLowerCase(), dog);
	}

	Map<String, OrganicDog> organicDogRoster = new HashMap<String, OrganicDog>();

	public void intakeNewOrganicDog(OrganicDog dog) {
		organicDogRoster.put(dog.getName().toLowerCase(), dog);
	}

	Map<String, RoboticCat> roboticCatRoster = new HashMap<String, RoboticCat>();

	public void intakeNewRoboticCat(RoboticCat cat) {
		roboticCatRoster.put(cat.getName().toLowerCase(), cat);
	}

	Map<String, OrganicCat> organicCatRoster = new HashMap<String, OrganicCat>();

	public void intakeNewOrganicCat(OrganicCat cat) {
		organicCatRoster.put(cat.getName().toLowerCase(), cat);
	}

	public String roboticDogRoster() {
		String rosterMenu = "Name" + "\t\t" + "  Type" + "\t" + "\t" + "Maintainence Need" + "      Health";
		String menuDivider = "-----------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our robotic dogs and how they are currently feeling: " + "\n");
		for (RoboticDog entry : roboticDogRoster.values()) {
			menuLine = entry.individualRobotDogStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String roboticCatRoster() {
		String rosterMenu = "Name" + "\t\t" + "  Type" + "\t" + "\t" + "Maintainence Need" + "      Health";
		String menuDivider = "-----------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our robotic cats and how they are currently feeling: " + "\n");
		for (RoboticCat entry : roboticCatRoster.values()) {
			menuLine = entry.individualRobotCatStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String organicDogRoster() {
		String rosterMenu = "Name" + "\t\t" + "  Type" + "\t\t" + "    Cage Filth" + "\t" + "      Hunger" + "\t"
				+ "      Thirst" + "\t" + "      Health" + "\t" + "  Bathroom Need";
		String menuDivider = "-----------------------------------------------------------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our dogs and how they are currently feeling: " + "\n");
		for (OrganicDog entry : organicDogRoster.values()) {
			menuLine = entry.individualOrganicDogStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public String organicCatRoster() {
		String rosterMenu = "Name" + "\t\t" + "   Type" + "\t\t" + " Litterbox Filth" + "      Hunger" + "\t"
				+ "     Thirst" + "\t" + "      Health" + "\t";
		;
		String menuDivider = "-------------------------------------------------------------------------------------------------";
		String menuLine = "";
		System.out.println("Here are our cats and how they are currently feeling: " + "\n");
		for (OrganicCat entry : organicCatRoster.values()) {
			menuLine = entry.individualOrganicCatStats();
			rosterMenu = rosterMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	public void giveFoodToAllOrganicPets() {
		for (OrganicDog current : organicDogRoster.values())
			current.feed();
		for (OrganicCat current : organicCatRoster.values())
			current.feed();
		System.out.println("You gave the organic dogs and cats food.");
	}

	public void giveWaterToAllOrganicPets() {
		for (OrganicDog current : organicDogRoster.values())
			current.giveWater();
		for (OrganicCat current : organicCatRoster.values())
			current.giveWater();
		System.out.println("You gave the organic dogs and cats water.");
	}

	public void walkAllDogs() {
		for (OrganicDog current : organicDogRoster.values())
			current.takeToBathroom();
		for (RoboticDog current : roboticDogRoster.values())
			current.walkRoboticDog();
		System.out.println("The dogs and robotic dogs enjoyed their walk!");
	}

	public void oilRobots() {
		for (RoboticDog current : roboticDogRoster.values())
			current.performMaintainence();
		for (RoboticCat current : roboticCatRoster.values())
			current.performMaintainence();
		System.out.println("You oiled and maintained the robotic pets!");
	}

	public void cleanDogCages() {
		for (OrganicDog current : organicDogRoster.values())
			current.cleanCage();
		System.out.println("Cleaned all dog cages.");
	}

	public void cleanLitterboxes() {
		for (OrganicCat current : organicCatRoster.values())
			current.cleanLitterbox();
		System.out.println("Cleaned all litter boxes.");
	}

	public void statScenarios() {
		for (OrganicCat current : organicCatRoster.values())
			current.statScenarios();
		for (OrganicDog current : organicDogRoster.values())
			current.statScenarios();
		for (RoboticCat current : roboticCatRoster.values())
			current.statScenarios();
		for (RoboticDog current : roboticDogRoster.values())
			current.statScenarios();

	}

	public String getMenu() {
		return "What would you like to do? " + "\n" + "1. Feed all the organic pets. (- Hunger, + Dog Bathroom Need)"
				+ "\n" + "2. Give water to the organic pets. (- Thirst, + Dog Bathroom Need" + "\n"
				+ "3. Walk All Dogs. (- Organic Dog Bathroom Need, - Robotic Dog Maintainence Need" + "\n"
				+ "4. Oil Robotic Pets. (- Robotic Pet Maintainence Need)" + "\n"
				+ "5. Clean Organic Dog Cages. (- Cage Filth, + Health)" + "\n"
				+ "6. Clean Organic Cat Litter Boxes. (- Litterbox Filth, + Health) \n" + "7. Quit Game" + "\n";
	}

	public void tick() {
		for (OrganicCat current : organicCatRoster.values())
			current.tick();
		for (OrganicDog current : organicDogRoster.values())
			current.tick();
		for (RoboticCat current : roboticCatRoster.values())
			current.tick();
		for (RoboticDog current : roboticDogRoster.values())
			current.tick();
		System.out.println("A day has passed. Pet attributes have changed.");
	}
}