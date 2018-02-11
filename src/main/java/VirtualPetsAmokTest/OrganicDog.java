package VirtualPetsAmokTest;

public class OrganicDog extends Pets implements OrganicPetsAbilities, Walkable {

	static final int DEFAULT_NEEDTOWASTELEVEL = 15;
	static final int DEFAULT_HUNGERLEVEL = 50;
	static final int DEFAULT_THIRSTLEVEL = 50;
	static final int DEFAULT_SOILEDAREALEVEL = 5;

	private int needToWasteLevel = DEFAULT_NEEDTOWASTELEVEL;
	private int hungerLevel = DEFAULT_HUNGERLEVEL;
	private int thirstLevel = DEFAULT_THIRSTLEVEL;
	private int soiledAreaLevel = DEFAULT_SOILEDAREALEVEL;

	public OrganicDog(String microchipNumber, String nameOfPet, String typeOfPet) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
	}

	// soiledAreaLevel is unique for this animal type. (Individual cages, not
	// communal litter box);
	public int getSoiledAreaLevel() {
		return soiledAreaLevel;
	}

	public void cleanCage() {
		soiledAreaLevel = soiledAreaLevel - 15;
		if (soiledAreaLevel < 0) {
			soiledAreaLevel = 0;
		}
	}

	public int getNeedToWasteLevel() {
		return needToWasteLevel;
	}

	@Override
	public int getHungerLevel() {
		return hungerLevel;
	}

	@Override
	public int getThirstLevel() {
		return thirstLevel;
	}

	@Override
	public void goForAWalk() {
		boredomLevel = boredomLevel - 5;
		happyLevel = happyLevel + 5;
		needToWasteLevel = needToWasteLevel - 50;
		healthLevel = healthLevel + 5;
		if (happyLevel > 100) {
			happyLevel = 100;
		}
		if (needToWasteLevel < 0) {
			needToWasteLevel = 0;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
		if (boredomLevel < 0) {
			boredomLevel = 0;
		}
	}

	@Override
	public void feedOne() {
		hungerLevel = hungerLevel - 10;
		thirstLevel = thirstLevel + 3;
		magicLevel = magicLevel + 3;
		healthLevel = healthLevel + 5;
		happyLevel = happyLevel + 3;
		if (hungerLevel < 0) {
			hungerLevel = 0;
		}
		if (happyLevel > 100) {
			happyLevel = 100;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
	}

	@Override
	public void waterOne() {
		thirstLevel = thirstLevel - 10;
		hungerLevel = hungerLevel + 3;
		magicLevel = magicLevel + 3;
		healthLevel = healthLevel + 3;
		happyLevel = happyLevel + 4;
		if (thirstLevel <= 0) {
			thirstLevel = 0;
		}
		if (happyLevel > 100) {
			happyLevel = 100;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
	}

	@Override
	public void fireOne() {
		magicLevel = magicLevel - 10;
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		healthLevel = healthLevel + 5;
		if (magicLevel < 0) {
			magicLevel = 0;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
	}

	@Override
	public void tickEffectOne() {
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		magicLevel = magicLevel + 3;
		boredomLevel = boredomLevel + 3;
		healthLevel = healthLevel - 3;
		needToWasteLevel = needToWasteLevel + 3;
		soiledAreaLevel = soiledAreaLevel + 5;
	}

	@Override
	public void playWithPet() {
		boredomLevel = boredomLevel - 10;
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		happyLevel = happyLevel + 10;
		magicLevel = magicLevel - 5;
		healthLevel = healthLevel + 8;
		if (boredomLevel < 0) {
			boredomLevel = 0;
		}
		if (happyLevel > 100) {
			happyLevel = 100;
		}
	}

	@Override
	public String getAllLevelsForIndividual() {
		return "The current levels for " + nameOfPet + " are:\nHealth Level: " + healthLevel + "\nHunger Level: "
				+ hungerLevel + "\nThirst Level: " + thirstLevel + "\nMagic Level:  " + magicLevel + "\nBoredom Level: "
				+ boredomLevel + "\nBelly Fullness Level: " + needToWasteLevel + "\n Cage Dirtiness: "
				+ soiledAreaLevel;
	}

}
