package VirtualPetsAmokTest;

public interface OrganicPetsAbilities {

	int getHungerLevel();

	int getThirstLevel();

	int getNeedToWasteLevel();

	void feedOne();

	void waterOne();

	void fireOne();

	void tickEffectOne();

	// void playWithOrganicPet(); //added this to Pets abstract class since all pets
	// can be played with.

	String getAllLevelsForIndividual();

}