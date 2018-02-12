package VirtualPetsAmok;

import java.util.Scanner;

public class VirtualpetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter lairApp = new VirtualPetShelter();

		Creatures pet1 = new OrganicDragon("1111", "Tank", "Dragon");
		Creatures pet2 = new OrganicPhoenix("2222", "Chairman", "Phoenix");
		Creatures pet3 = new OrganicDragon("3333", "Mister", "Dragon");
		Creatures pet4 = new OrganicPhoenix("4444", "Chubs", "Phoenix");
		Creatures pet5 = new RoboDragon("5555", "Dozer", "RoboDragon");

		lairApp.addAnimal(pet1.getMicrochipNumber(), pet1);
		lairApp.addAnimal(pet2.getMicrochipNumber(), pet2);
		lairApp.addAnimal(pet3.getMicrochipNumber(), pet3);
		lairApp.addAnimal(pet4.getMicrochipNumber(), pet4);
		lairApp.addAnimal(pet5.getMicrochipNumber(), pet5);

		boolean gameRunning = true;

		System.out.println(
				"Welcome to The Lair!  Sometimes creatures become banished from their castle homes and cannot find suitable cave dwellings.");
		System.out.println(
				"\n** Here at The Lair we ask that you help take care of your fellow creatures. We have different types of creatures with different types of needs.");
		System.out.println(
				"** We have messy creatures here, so make sure you clean the areas they mess up, or you'll have lots of sad and unhealthy creatures roaming The Lair.");
		System.out.println("** Every time you interact with our creatures, their needs will increase in other areas.");

		do {
			System.out.println("\n\nCurrent creatures of The Lair and their current conditions:");
			lairApp.returnStatusOfAll();
			System.out.println("\n\nSelect an option below:\n");
			System.out.println("Type 1 to feed all of the creatures some tasty little critters.");
			System.out.println("Type 2 to let all of the creatures drink from The Pool of Elven Tears.");
			System.out.println("Type 3 to release the magic building inside all these mighty creatures.");
			System.out.println("Type 4 to walk all dragons and robodragons.");
			System.out.println("Type 5 to take one creature out for a short journey.");
			System.out.println("Type 6 to clean the caves of every dragon.");
			System.out.println("Type 7 to clean the floor underneath The Phoenix Arboretum.");
			System.out.println("Type 8 to oil the robodragons, making them as feirce as the real ones.");
			System.out.println("Type 9 to permanently send a creature to its new castlelands.");
			System.out.println("Type 10 to admit a new creature you have found in need of care.");
			System.out.println("Type 11 to check the status on all creatures at The Lair.");
			System.out.println("Type 12 to quit the game.");
			String optionEntered = input.nextLine();

			switch (optionEntered) {
			case "1":
				lairApp.feedAll();
				break;
			case "2":
				lairApp.waterAll();
				break;
			case "3":
				lairApp.fireAll();
				break;
			case "4":
				lairApp.walkAllDogs();
				break;
			case "5":
				lairApp.showAllNumbsNamesAndTypes();
				System.out.println("Please enter a creature chip number to take one on a mini-journey:");
				String microchipOfPetToPlay = input.nextLine();
				if (lairApp.microchipNumber.contains(microchipOfPetToPlay)) {
					lairApp.playWithPet(microchipOfPetToPlay);
					System.out.println("Thanks for the excursion, mini-journeys do a lot for our wellbeing!");
				} else {
					System.out.println("Oops! " + microchipOfPetToPlay
							+ " cannot be found! Pick something else to do at The Lair!");
				}
				break;
			case "6":
				lairApp.cleanAllDogCages();
				break;
			case "7":
				lairApp.litterBoxEmpty();
				break;
			case "8":
				lairApp.oilAllRobots();
				break;
			case "9":
				System.out.println(
						"Which creature would you like to send off to its new castlelands? Enter its microchip number: ");
				lairApp.showAllNumbsNamesAndTypes();
				String numberOfPetToAdopt = input.nextLine();
				if (!(lairApp.microchipNumber.contains(numberOfPetToAdopt))) {
					System.out.println("Sorry, that creature must already be off living in its new castlelands!");
				} else {
					lairApp.adopt(numberOfPetToAdopt);
				}
				break;
			case "10":
				System.out.println("Thank you for finding a creature in need!");
				System.out.println("Enter its microchip number.");
				String newMicrochipNumber = input.nextLine();
				System.out.println("What is its name?");
				String nameOfNewPet = input.nextLine();
				System.out.println("And what type of creature is " + nameOfNewPet
						+ "? Type 1 for Phoenix, Type 2 for Dragon, Type 3 for RoboDragon");
				String typeOfNewPet = input.nextLine();
				if (typeOfNewPet.equals("1")) {
					lairApp.addYourOwnOrganicPhoenix(newMicrochipNumber, nameOfNewPet, "Phoenix");
				}
				if (typeOfNewPet.equals("2")) {
					lairApp.addYourOwnOrganicDragon(newMicrochipNumber, nameOfNewPet, "Dragon");
				}
				if (typeOfNewPet.equals("3")) {
					lairApp.addYourOwnRoboDragon(newMicrochipNumber, nameOfNewPet, "RoboDragon");
				}
				break;
			case "11":
				lairApp.returnStatusOfAll();
				break;
			case "12":
				System.out.println("Attention: This will end the game and any progress will be lost!");
				System.out.println("Are you sure? \nType 1 for yes.\nType 2 for no.");
				String answerToQuit = input.nextLine();
				if (answerToQuit.equals("1")) {
					System.out.println("The Lair and all of its creatures say goodbye, friend!!");
					System.exit(0);
				} else
					break;
			default:
				System.out.println(
						"The Lair does not recognize that request.  Please enter your desired choice once more:");
			}
			lairApp.tickAll();
		} while (gameRunning = true);
	}

}
