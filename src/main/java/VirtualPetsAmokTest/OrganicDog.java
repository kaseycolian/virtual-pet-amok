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
	
	private int happyLevel = DEFAULT_HAPPYLEVEL;
	private int fireLevel = DEFAULT_FIRElEVEL;
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

	public int getNeedToWasteLevel() {
		return needToWasteLevel;
	}

	public void goForAWalk() {
		boredomLevel = boredomLevel - 5;
		needToWasteLevel = needToWasteLevel - 7;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getFireLevel() {
		return fireLevel;
	}

	public int getHappyLevel() {
		return happyLevel;
	}
	public void playWithPet() {
		boredomLevel = boredomLevel - 10;
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		happyLevel = happyLevel - 10;
		if (boredomLevel - 10 <= 10) {
			boredomLevel = 0;
		if (hungerLevel -10 <=10) {
			hungerLevel = 0;
		}
	}
	}
}
