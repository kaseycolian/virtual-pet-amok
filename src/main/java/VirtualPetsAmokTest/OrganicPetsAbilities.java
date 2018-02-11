package VirtualPetsAmokTest;

public interface OrganicPetsAbilities {

	int getHungerLevel();

	int getThirstLevel();

	int getNeedToWasteLevel();

	int getSoiledAreaLevel();

	void feedOne();

	void waterOne();

	void fireOne();

	void tickEffectOne();

	String getAllLevelsForIndividual();

}