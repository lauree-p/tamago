package tamagotchi;

import java.util.ArrayList;

import menu.Game;
import tools.Utils;

/**
 * @author Laur�e
 */
public abstract class Tamagotchi {

	String firstName;
	String gender;
	String type;
	String color;
	String statusAge;
	String age;
	String hunger;
	String thirst;
	String mood;
	String hygiene;
	String energy;
	String healthState;
	String relation;
	String randomFirstName;
	
	int health;
	int days;
	int months;
	int years;
	int height;
	int weight;
	int lifeTime;
	boolean sick;
	boolean mask;
	
	int counterStomach;
	int counterBladder;
	int counterHygiene;
	int counterMood;
	int counterThirst;
	int counterEnergy;
	int counterHunger;
	int counterRelation;

	
	Tamagotchi guestFriend;
	ArrayList<Tamagotchi> friends = new ArrayList<Tamagotchi>();
	ArrayList<Tamagotchi> babies = new ArrayList<Tamagotchi>();

	public Tamagotchi() {
		
	}
	
	/**
	 * 
	 * @param height
	 * @param weight
	 * @param lifeTime
	 * @param counterHunger
	 * @param counterThirst
	 * @param counterMood
	 * @param mask
	 * @param counterHygiene
	 * @param counterStomach
	 * @param counterBladder
	 * @param sick
	 * @param counterEnergy
	 * @param health
	 */
	public Tamagotchi(int height, int weight, int lifeTime, int counterHunger, int counterThirst, int counterMood,
			boolean mask, int counterHygiene, int counterStomach, int counterBladder, boolean sick, int counterEnergy,
			int health) {
		this.lifeTime = 7300;
		this.mask = false;
		this.sick = false;
		this.health = 100;
		this.days = 0;
		this.months = 0;
		this.years = 0;
	}

	/**
	 * @return the relationCounter
	 */
	public int getRelationCounter() {
		return counterRelation;
	}

	/**
	 * @param relationCounter the relationCounter to set
	 */
	public void setRelationCounter(int relationCounter) {
		this.counterRelation = relationCounter;
	}

	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	public void setRelation(String x) {
		this.relation = x;
	}

	/**
	 * 
	 */
//	private void randomFirstname() {
//		
//		int fFNTLenght = Utils.femaleFirstNameTab.length;
//		int mFNTLenght = Utils.maleFirstNameTab.length;
//		int randomFirstName;
//		if(this.getGender() == "male") {
//			randomFirstName = (int) (Math.random() * (mFNTLenght - 0));
//		}
//		else {
//			randomFirstName = (int) (Math.random() * (fFNTLenght - 0));
//		}
//		this.firstName = Utils.maleFirstNameTab[randomFirstName];
//	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		int max = 100;
		int min = 0;
		int somme = this.getHealth() + health;
		if (somme >= max) {
			this.health = max;
		} else if (somme < 0) {
			this.health = min;
		} else {
			this.health = somme;
		}
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String scFirstName) {
		this.firstName = scFirstName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender() {
		String[] tabGender = { "Male", "Femelle" };
		int random = (int) (Math.random() * 2);
		this.gender = tabGender[random];
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int scType) {
		switch (scType) {
		case 1:
			this.type = "chien";
			break;
		case 2:
			this.type = "chat";
		default:
			break;
		}
	}
	
	/**
	 * 
	 */
	public void randomType() {
		String[] tabType = { "Chien", "Chat" };
		int random = (int) (Math.random() * 2);
		this.type = tabType[random];
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 */
	public void getRandomColor() {
		String[] color = { "Noir", "Gris", "Marron", "Blanc", "Beige" };
		int random = (int) (Math.random() * 4);
		this.setColor(color[random]);
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the statusAge
	 */
	public String getStatusAge() {
		return statusAge;
	}

	/**
	 * @param statusAge the statusAge to set
	 */
	public void setStatusAge(String statusAge) {
		this.statusAge = statusAge;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge() {
		if (this.months == 0 && this.years == 0) {
			this.age = this.days + " jours";
		} else if (this.months > 0 && this.months < 12 && this.years == 0) {
			this.age = this.months + " mois";
		} else if (this.years != 0) {
			this.age = this.years + " ans";
		}
	}

	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}

	/**
	 * @param days the days to set
	 */
	public void setDays(int days) {
		this.days += days;
		if (this.getDays() > 30) {
			this.days = 0;
			this.months++;
		}
	}

	/**
	 * @return the months
	 */
	public int getMonths() {
		return months;
	}

	/**
	 * @param months the months to set
	 */
	public void setMonths(int months) {
		this.months += months;
		if (this.months == 13) {
			this.months = 0;
			this.years++;
		}
	}

	/**
	 * @return the years
	 */
	public int getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}

	/**
	 * @return the lifeTime
	 */
	public int getLifeTime() {
		return lifeTime;
	}

	/**
	 * @param lifeTime the lifeTime to set
	 */
	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}

	/**
	 * @return the hunger
	 */
	public String getHunger() {
		return hunger;
	}

	/**
	 * Set Hunger
	 */
	public void setHunger() {
		if (this.getCounterHunger() >= 7) {
			this.hunger = "Rassasi�";
		} else if (this.getCounterHunger() >= 5) {
			this.hunger = "Normal";
		} else if (this.getCounterHunger() >= 3) {
			this.hunger = "Petit creux";
		} else {
			this.hunger = "Affam�";
		}
	}

	/**
	 * @return the counterHunger
	 */
	public int getCounterHunger() {
		return counterHunger;
	}

	/**
	 * @param counterHunger the counterHunger to set
	 */
	public void setCounterHunger(int counterHunger) {
		int max = 8;
		int min = 0;
		int somme = this.getCounterHunger() + counterHunger;
		if (somme >= max) {
			this.counterHunger = max;
		} else if (somme < 0) {
			this.counterHunger = min;
		} else {
			this.counterHunger = somme;
		}
		this.setHunger();
	}

	/**
	 * @return the thirst
	 */
	public String getThirst() {
		return thirst;
	}

	/**
	 * @param thirst the thirst to set
	 */
	public void setThirst() {
		if (this.getCounterThirst() >= 7) {
			this.thirst = "D�salt�r�";
		} else if (this.getCounterThirst() >= 5) {
			this.thirst = "Normal";
		} else if (this.getCounterThirst() >= 3) {
			this.thirst = "Assoif�";
		} else {
			this.thirst = "D�shydrat�";
		}
	}

	/**
	 * @return the counterThirst
	 */
	public int getCounterThirst() {
		return counterThirst;
	}

	/**
	 * @param counterThirst the counterThirst to set
	 */
	public void setCounterThirst(int counterThirst) {
		int max = 8;
		int min = 0;
		int somme = this.getCounterThirst() + counterThirst;
		if (somme >= max) {
			this.counterThirst = max;
		} else if (somme < 0) {
			this.counterThirst = min;
		} else {
			this.counterThirst = somme;
		}
		this.setThirst();
	}

	/**
	 * @return the mood
	 */
	public String getMood() {
		return mood;
	}

	/**
	 * @param mood the mood to set
	 */
	public void setMood() {
		if (this.getCounterMood() >= 7) {
			this.mood = "Heureux";
		} else if (this.getCounterMood() >= 5) {
			this.mood = "Normal";
		} else if (this.getCounterMood() >= 3) {
			this.mood = "Triste";
		} else {
			this.mood = "Malheureux";
		}
	}

	/**
	 * @return the counterMood
	 */
	public int getCounterMood() {
		return counterMood;
	}

	/**
	 * @param counterMood the counterMood to set
	 */
	public void setCounterMood(int counterMood) {
		int max = 8;
		int min = 0;
		int somme = this.getCounterThirst() + counterMood;
		if (somme >= max) {
			this.counterMood = max;
		} else if (somme < 0) {
			this.counterMood = min;
		} else {
			this.counterMood = somme;
		}
		this.setMood();
	}

	/**
	 * @return the mask
	 */
	public boolean isMask() {
		return mask;
	}

	/**
	 * @param mask the mask to set
	 */
	public void setMask() {
		if (this.mask) {
			this.mask = false;
		} else {
			this.mask = true;
		}
	}

	/**
	 * @return the hygiene
	 */
	public String getHygiene() {
		return hygiene;
	}

	/**
	 * @param hygyene the hygiene to set
	 */
	public void setHygiene() {
		if (this.getCounterHygiene() >= 7) {
			this.hygiene = "Impecable";
		} else if (this.getCounterHygiene() >= 5) {
			this.hygiene = "Propre";
		} else if (this.getCounterHygiene() >= 3) {
			this.hygiene = "Normal";
		} else {
			this.hygiene = "Sale";
		}
	}

	/**
	 * @return the counterHygiene
	 */
	public int getCounterHygiene() {
		return counterHygiene;
	}

	/**
	 * @param counterHygiene the counterHygiene to set
	 */
	public void setCounterHygiene(int counterHygiene) {
		int max = 8;
		int min = 0;
		int somme = this.getCounterHygiene() + counterHygiene;
		if (somme >= max) {
			this.counterHygiene = max;
		} else if (somme < 0) {
			this.counterHygiene = min;
		} else {
			this.counterHygiene = somme;
		}
		this.setHygiene();
	}

	/**
	 * @return the friends
	 */
	public ArrayList<Tamagotchi> getFriends() {
		return friends;
	}

	/**
	 * @param friends the friends to set
	 */
	public void setFriends(ArrayList<Tamagotchi> friends) {
		this.friends = friends;
	}

	/**
	 * @return the counterStomach
	 */
	public int getCounterStomach() {
		return counterStomach;
	}

	/**
	 * @param counterStomach the counterStomach to set
	 */
	public void setCounterStomach(int counterStomach) {
		int max = 8;
		int min = 0;
		int somme = this.getCounterStomach() + counterStomach;
		if (somme >= max) {
			this.counterStomach = max;
			this.poop();
		} else if (somme < 0) {
			this.counterStomach = min;
		} else {
			this.counterStomach = somme;
		}
	}

	/**
	 * @return the counterBladder
	 */
	public int getCounterBladder() {
		return counterBladder;
	}

	/**
	 * @param counterBladder the counterBladder to set
	 */
	public void setCounterBladder(int counterBladder) {
		int max = 8;
		int min = 0;
		int somme = this.getCounterBladder() + counterBladder;
		if (somme >= max) {
			this.counterBladder = max;
			this.pee();
		} else if (somme < 0) {
			this.counterBladder = min;
		} else {
			this.counterBladder = somme;
		}
	}

	/**
	 * @return the sick
	 */
	public boolean isSick() {
		return sick;
	}

	/**
	 * @param sick the sick to set
	 */
	public void setSick(boolean sick) {
		this.sick = sick;
		this.setHealthState();
	}

	/**
	 * @return the healthState
	 */
	public String getHealthState() {
		return healthState;
	}

	/**
	 * @param healthState the healthState to set
	 */
	public void setHealthState() {
		if (this.isSick()) {
			this.healthState = "Malade";
			Game.notif = true;
			Game.notifSick = true;
		} else {
			this.healthState = "Normale";
		}
	}

	/**
	 * @return the energy
	 */
	public String getEnergy() {
		return energy;
	}

	/**
	 * @param energy the energy to set
	 */
	public void setEnergy() {
		if (this.getCounterEnergy() >= 7) {
			this.energy = "Energique";
		} else if (this.getCounterEnergy() >= 5) {
			this.energy = "En forme";
		} else if (this.getCounterEnergy() >= 3) {
			this.energy = "Fatigu�";
		} else {
			this.energy = "Tr�s Fatigu�";
			Game.notif = true;
			Game.notifEnergy = true;
		}
	}

	/**
	 * @return the counterEnergy
	 */
	public int getCounterEnergy() {
		return counterEnergy;
	}

	/**
	 * @param counterEnergy the counterEnergy to set
	 */
	public void setCounterEnergy(int counterEnergy) {
		int max = 8;
		int min = 0;
		int somme = this.getCounterEnergy() + counterEnergy;
		if (somme >= max) {
			this.counterEnergy = max;
		} else if (somme < 0) {
			this.counterEnergy = min;
		} else {
			this.counterEnergy = somme;
		}
		this.setEnergy();
	}

	/**
	 * @return the babies
	 */
	public ArrayList<Tamagotchi> getBabies() {
		return babies;
	}

	/**
	 * @param babies the babies to set
	 */
	public void setBabies(ArrayList<Tamagotchi> babies) {
		this.babies = babies;
	}

	/**
	 * @return the guestFriend
	 */
	public Tamagotchi getGuestFriend() {
		return guestFriend;
	}

	/**
	 * @param guestFriend the guestFriend to set
	 */
	public void setGuestFriend(Tamagotchi guestFriend) {
		this.guestFriend = guestFriend;
	}

	/**
	 * Eat
	 * 
	 * @param x, quantity food add
	 */
	public void eat(int x) {
		if (this.getCounterHunger() == 8) {
			this.setSick(true);
		}
		this.setCounterStomach(x - 1);
		this.setCounterHunger(x);

	}

	/**
	 * Drink
	 * 
	 * @param x
	 */
	public void drink(int x) {
		this.setCounterBladder(x - 1);
		this.setCounterThirst(x);
	}

	/**
	 * Poop
	 */
	public void poop() {
		this.counterStomach = 0;
		Game.notif = true;
		Game.notifPoop = true;
		this.setCounterHygiene(-5);
	}

	/**
	 * 
	 */
	public void pee() {
		this.counterBladder = 0;
		Game.notif = true;
		Game.notifPee = true;
		this.setCounterHygiene(-2);
	}

	/**
	 * 
	 */
	public void wash() {
		this.counterHygiene = 10;
	}

	/**
	 * 
	 */
	public void findFriend() {
		int random = (int) (Math.random() * 3);
		int randomGenderFriend = (int) (Math.random() * 1);
		if (random == 0) {
			if (randomGenderFriend == 0) {
				Dog newDogFriend = new Dog();
				this.friends.add(newDogFriend);
			}
			else {
				Cat newCatFriend = new Cat();
				this.friends.add(newCatFriend);
			}
			
			Game.notif = true;
			Game.notifFriend = true;
			
		}

	}
	
	/**
	 * Methods polymorph for drawing
	 */
	public void drawMyTama() {}

	public void drawWash() {}

	public void drawSleep() {}
	
	public void drawRest() {}
	
	public void drawSport() {}
	
	public void drawWalkAround() {}
	
	public void drawMyTamaWithMask() {}
	
}
