package VirtualPetsAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, Pets> animals = new HashMap<>();
	public Set<String> microchipNumber = animals.keySet();

	public void addAnimal(String microchipNumber, Pets animal) {
		animals.put(animal.getMicrochipNumber(), animal);
	}
	// public void addYourOwn(String name, String type) {
	// VirtualPet userAdded = new VirtualPet(name, type);
	// if (animals.containsKey(name))

	public void addYourOwnOrganicDog(String microchipNumber, String name, String type) {
		Pets userAdded = new OrganicDog(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}

	}

	public void addYourOwnOrganicCat(String microchipNumber, String name, String type) {
		Pets userAdded = new OrganicCat(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}
	}

	public void addYourOwnRoboDog(String microchipNumber, String name, String type, Boolean oilable) {
		Pets userAdded = new RoboDog(microchipNumber, name, type, oilable);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}
	}

	public Collection<Pets> animalsss() {
		Collection<Pets> allPetInfo = animals.values();
		return allPetInfo;
	}

	// public void feedAll() {
	// for (Pets petToFeed : animals.values()) {
	// // petToFeed.feedOne();
	//
	// }
}
