package VirtualPetsAmokTest;

public class OrganicCat extends Pets implements OrganicPetsAbilities {
	
	static final int DEFAULT_NEEDTOWASTELEVEL = 15;
	static final int DEFAULT_HUNGERLEVEL = 50;
	static final int DEFAULT_THIRSTLEVEL = 50;

	private int needToWasteLevel = DEFAULT_NEEDTOWASTELEVEL;
	private int hungerLevel = DEFAULT_HUNGERLEVEL;
	private int thirstLevel = DEFAULT_THIRSTLEVEL;
	

	public OrganicCat(String microchipNumber, String nameOfPet, String typeOfPet) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
	
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
	public int getNeedToWasteLevel() {
		return needToWasteLevel;
	}

	@Override
	public void feedOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waterOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fireOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAllLevelsForIndividual() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void tickEffectOne() {
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		magicLevel = magicLevel + 3;
		boredomLevel = boredomLevel + 3;
		healthLevel = healthLevel - 3;
	}
}
