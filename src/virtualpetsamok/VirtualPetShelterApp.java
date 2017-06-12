package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		OrganicDog dogGary = new OrganicDog("Gary", 11, 17, 12, 13);
		OrganicDog dogFluff = new OrganicDog("Fluff", 13, 14, 19, 6);

		OrganicCat catBill = new OrganicCat("Bill", 20, 21);
		OrganicCat catCloud = new OrganicCat("Cloud", 18, 11);

		RoboticDog dogAstro = new RoboticDog("Astro", 26);
		RoboticDog dogBolt = new RoboticDog("Bolt", 18);

		RoboticCat catGears = new RoboticCat("Gears", 31);
		RoboticCat catKit = new RoboticCat("Kit", 23);

		VirtualPetShelter allPetShelter = new VirtualPetShelter();

		allPetShelter.intakeNewOrganicDog(dogGary);
		allPetShelter.intakeNewOrganicDog(dogFluff);

		allPetShelter.intakeNewOrganicCat(catBill);
		allPetShelter.intakeNewOrganicCat(catCloud);

		allPetShelter.intakeNewRoboticDog(dogAstro);
		allPetShelter.intakeNewRoboticDog(dogBolt);

		allPetShelter.intakeNewRoboticCat(catGears);
		allPetShelter.intakeNewRoboticCat(catKit);

		System.out.println(
				"Welcome to the virtual pet shelter. We have a collection of real and robotic dogs for you to play with.\n");
		System.out.println(
				"You are welcome to help take care of the pets. Beware, that if you allow any pet's health to drop to 0, the game will be over. \n");
		System.out.println("Robotic pets will lose health if their maintainence need goes over 50.\n");
		System.out.println(
				"Real pets will lose health if their hunger, thirst, bathroom need or filthiness goes over 50. \n");
		System.out.println("Robotic pets will lose extra health if their maintainence need rises to 100. \n\n"
				+ "Real pets will lose extra health if their cages or litterboxes filthiness rises to 100, their hunger rises to 100 or their thirst rises to 100. \n");

		do {
			allPetShelter.statScenarios();
			System.out.println(allPetShelter.roboticDogRoster());
			System.out.println(allPetShelter.roboticCatRoster());
			System.out.println(allPetShelter.organicDogRoster());
			System.out.println(allPetShelter.organicCatRoster());

			System.out.println(allPetShelter.getMenu());

			String choice = input.next();
			switch (choice) {
			case "1":
				allPetShelter.giveFoodToAllOrganicPets();
				break;
			case "2":
				allPetShelter.giveWaterToAllOrganicPets();
				break;
			case "3":
				allPetShelter.walkAllDogs();
				break;
			case "4":
				allPetShelter.oilRobots();
				break;
			case "5":
				allPetShelter.cleanDogCages();
				break;
			case "6":
				allPetShelter.cleanLitterboxes();
				break;
			case "7":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
			allPetShelter.statScenarios();
			allPetShelter.tick();

		} while (!allPetShelter.organicDogRoster.isEmpty());
	}
}