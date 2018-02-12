package VirtualPetsAmok;

import java.util.concurrent.ThreadLocalRandom;

public class RoboDragon extends Creatures implements Walkable {
	static final int DEFAULT_OILLEVEL = ThreadLocalRandom.current().nextInt(25, 60);

	private int oilLevel = DEFAULT_OILLEVEL;

	public RoboDragon(String microchipNumber, String nameOfPet, String typeOfPet) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public void oilRoboPet() {
		oilLevel = oilLevel + 15;
		if (oilLevel > 100) {
			oilLevel = 100;
		}
	}

	@Override
	public void playWithPet() {
		boredomLevel = boredomLevel - 10;
		happyLevel = happyLevel + 10;
		healthLevel = healthLevel + 6;
		oilLevel = oilLevel - 4;
	}

	@Override
	public void goForAWalk() {
		boredomLevel = boredomLevel - 7;
		happyLevel = happyLevel + 10;
		healthLevel = healthLevel + 8;
		oilLevel = oilLevel - 6;
		if (happyLevel > 100) {
			happyLevel = 100;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
	}

	@Override
	public void tickEffectOne() {
		healthLevel = healthLevel - 3;
		magicLevel = magicLevel + 3;
		boredomLevel = boredomLevel + 3;
		oilLevel = oilLevel - 8;
		happyLevel = happyLevel - 3;
	}

	@Override
	public String toString() {
		return "The current levels for " + nameOfPet + " the " + typeOfPet + " are:" + "\n\tHealth Level: "
				+ healthLevel + "  |  Happiness Level: " + happyLevel + "\n\tFire Level: " + magicLevel
				+ "    | Boredom Level: " + boredomLevel + "\n\tOil Level: " + oilLevel;
	}
}