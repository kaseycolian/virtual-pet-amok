package VirtualPetsAmokTest;

public class OrganicDog {

	private String microchipNumber;
	private String nameOfPet;
	private String typeOfPet;
	static final int DEFAULT_BOREDOMLEVEL = 10;
	static final int DEFAULT_NEEDTOWASTELEVEL = 15;
	static final int DEFAULT_HUNGERLEVEL = 50;
	static final int DEFAULT_THIRSTLEVEL = 50;
	static final int DEFAULT_FIRElEVEL = 50;
	static final int DEFAULT_HAPPYLEVEL = 50;
	static final int DEFAULT_HEALTHLEVEL = 80;
	static final int DEFAULT_SOILEDLEVEL = 5;

	private int soiledAreaLevel = DEFAULT_SOILEDLEVEL;
	private int healthLevel = DEFAULT_HEALTHLEVEL;
	private int happyLevel = DEFAULT_HAPPYLEVEL;
	private int magicLevel = DEFAULT_FIRElEVEL;
	private int thirstLevel = DEFAULT_THIRSTLEVEL;
	private int hungerLevel = DEFAULT_HUNGERLEVEL;
	private int boredomLevel = DEFAULT_BOREDOMLEVEL;
	private int needToWasteLevel = DEFAULT_NEEDTOWASTELEVEL;

	public OrganicDog(String microchipNumber, String nameOfPet, String typeOfPet) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
	}

	public String getPetName() {

		return nameOfPet;
	}

	public String getTypeOfPet() {

		return typeOfPet;
	}

	public String getMicrochipNumber() {
		return microchipNumber;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getMagicLevel() {
		return magicLevel;
	}

	public int getHappyLevel() {
		return happyLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getNeedToWasteLevel() {
		return needToWasteLevel;
	}

	public int getSoiledAreaLevel() {
		return soiledAreaLevel;
	}

	public void goForAWalk() { // will be put into interface
		boredomLevel = boredomLevel - 7;
		happyLevel = happyLevel + 10;
		needToWasteLevel = needToWasteLevel - 5;
		healthLevel = healthLevel + 8;
	}

	public void playWithPet() {
		boredomLevel = boredomLevel - 10;
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		happyLevel = happyLevel + 10;
		magicLevel = magicLevel - 5;
		healthLevel = healthLevel + 8;
		if (boredomLevel - 10 <= 10) {
			boredomLevel = 0;
		}
		if (happyLevel + 3 > 100) {
			happyLevel = 100;
		}
	}

	public void feedOne() {
		hungerLevel = hungerLevel - 10;
		thirstLevel = thirstLevel + 3;
		magicLevel = magicLevel + 3;
		healthLevel = healthLevel + 5;
		if (hungerLevel - 10 <= 0) {
			hungerLevel = 0;
		}
	}

	public void waterOne() {
		thirstLevel = thirstLevel - 10;
		hungerLevel = hungerLevel + 3;
		magicLevel = magicLevel + 3;
		healthLevel = healthLevel + 3;
		if (thirstLevel - 10 <= 0) {
			thirstLevel = 0;
		}
	}

	public void fireOne() {
		magicLevel = magicLevel - 10;
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		healthLevel = healthLevel + 5;
		if (magicLevel - 10 <= 0) {
			magicLevel = 0;
		}
	}

	public void tickEffectOne() {
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		magicLevel = magicLevel + 3;
		boredomLevel = boredomLevel + 3;
		healthLevel = healthLevel - 3;
	}

	public String getAllLevelsForIndividual() {
		return "The current levels for " + nameOfPet + " are:\nHealth Level: " + healthLevel + "\nHunger Level: "
				+ hungerLevel + "\nThirst Level: " + thirstLevel + "\nMagic Level:  " + magicLevel + "\nBoredom Level: "
				+ boredomLevel + "\nBelly Fullness Level: " + needToWasteLevel + "\n Cage Dirtiness: "
				+ soiledAreaLevel;
	}
}
