package VirtualPetsAmok;

import java.util.Scanner;

public class VirtualpetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter lairApp = new VirtualPetShelter();

		Pets pet1 = new OrganicDog("1111", "Tank", "Dog");
		Pets pet2 = new OrganicCat("2222", "Chairman", "Cat");
		Pets pet3 = new OrganicDog("3333", "Mister", "Dog");
		Pets pet4 = new OrganicCat("4444", "Chubs", "Cat");
		Pets pet5 = new RoboDog("5555", "Dozer", "Robodog");

		lairApp.addAnimal(pet1.getMicrochipNumber(), pet1);
		lairApp.addAnimal(pet2.getMicrochipNumber(), pet2);
		lairApp.addAnimal(pet3.getMicrochipNumber(), pet3);
		lairApp.addAnimal(pet4.getMicrochipNumber(), pet4);
		lairApp.addAnimal(pet5.getMicrochipNumber(), pet5);

		boolean gameRunning = true;

		System.out.println(
				"Welcome to The Lair!\n\nSometimes creatures become banished from their castle homes and cannot find suitable cave dwellings.");
		System.out.println(
				"\nHere at The Lair we ask that you help take care of your fellow creatures.\nEvery time you interact with our creatures, their needs increase in other areas.\n");
		System.out.println("\nHere are the current cave creatures of The Lair and their current condition:\n");
		lairApp.returnStatusOfAll();

		do {
			lairApp.tickAll();
			System.out.println("\n\nSelect an option below:\n");
			System.out.println("Type 1 to feed all of the creatures some tasty little critters.");
			System.out.println("Type 2 to let all of the creatures drink from The Pool of Elven Tears.");
			System.out.println("Type 3 to release the magic building inside all these mighty creatures.");
			System.out.println("Type 4 to walk all dragons and robodragons.");
			System.out.println("Type 5 to take one creature out for a short journey.");
			System.out.println("Type 6 to clean all dragon cages.");
			System.out.println("Type 7 to clean the floor underneath all of the Phoenixes.");
			System.out.println("Type 8 to oil all robotic dragons.");
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
			// case "5":
			// System.out.println("Please select a pet to take on a mini-journey: " +
			// lairApp.microchipNumber);
			// String microchipOfPetToPlay = input.nextLine();
			// if (lairApp.microchipNumber.contains(microchipOfPetToPlay)) {
			// pets.playWithOne(microchipOfPetToPlay);
			// System.out.println("Thanks for the excursion!");
			// } else {
			// System.out.println(
			// "Oops! " + microchipOfPetToPlay + " cannot be found! Pick something else to
			// do at The Lair!");
			// }
			// break;
			case "6":
				lairApp.cleanAllDogCages();
				break;
			// case "7":
			// lairApp.
			// break;
			// System.out.println("Which creature would you like to send to a far away
			// land?" + lairApp.animals.values());
			// String nameOfPetToAdopt = input.nextLine();
			// if (!(lairApp.nameOfPet.contains(nameOfPetToAdopt))) {
			// System.out
			// .println("Sorry, that creature must already be out on its journey to its new
			// castleland!");
			// } else {
			// lairApp.adopt(nameOfPetToAdopt);
			// System.out.println(nameOfPetToAdopt
			// + " is off onto its journey to its new lands! Thank you finding a new
			// castleland for our creature to call home!s");
			// }
			// break;
			case "8":
				lairApp.oilAllRobots();
				break;
			// case "9":
			// break;
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
					lairApp.addYourOwnOrganicCat(newMicrochipNumber, nameOfNewPet, "Phoenix");
				}
				if (typeOfNewPet.equals("2")) {
					lairApp.addYourOwnOrganicDog(newMicrochipNumber, nameOfNewPet, "Dragon");
				}
				if (typeOfNewPet.equals("3")) {
					lairApp.addYourOwnRoboDog(newMicrochipNumber, nameOfNewPet, "RoboDragon");
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
		} while (gameRunning = true);
	}

}
