package VirtualPetsAmokTest;

public class OrganicDog {

	private String microchipNumber;
	private String nameOfPet;
	private String typeOfPet;
	private int boredomLevel = 10;
	public int needToWasteLevel = 15;

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

//	public boolean getWalkingStatus() {
//		return true;
//	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getNeedToWasteLevel() {
		return needToWasteLevel;
	}
	public void goForAWalk() {
		boredomLevel = boredomLevel - 5;
		needToWasteLevel = needToWasteLevel -7;
	}


}
