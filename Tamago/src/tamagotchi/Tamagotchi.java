package tamagotchi;

import java.util.ArrayList;

import menu.Game;

/**
 * 
 * @author Laurée
 *
 */
public class Tamagotchi {

	String firstName;
	String gender;
	String type;
	String color;
	int height;
	int weight;
	String statusAge;
	String age;
	int lifeTime;
	String hunger;
	int counterHunger;
	String thirst;
	int counterThirst;
	String mood;
	int counterMood;
	boolean mask;
	String hygiene;
	int counterHygiene;
	ArrayList<Tamagotchi> friends = new ArrayList<Tamagotchi>();;
	int counterStomach;
	int counterBladder;
	boolean sick;
	String energy;
	int counterEnergy;
	ArrayList<Tamagotchi> babies = new ArrayList<Tamagotchi>();
	Tamagotchi guestFriend;
	int health;
	int days;
	int months;
	int years;
	String healthState;
	int relationCounter;
	String relation;
	String randomFirstName;
	

	public Tamagotchi() {

	}

	/**
	 * @param firstName
	 * @param gender
	 * @param type
	 * @param color
	 * @param height
	 * @param weight
	 * @param statusAge
	 * @param age
	 * @param lifeTime
	 * @param hunger
	 * @param counterHunger
	 * @param thirst
	 * @param counterThirst
	 * @param mood
	 * @param counterMood
	 * @param mask
	 * @param hygiene
	 * @param counterHygiene
	 * @param friends
	 * @param counterStomach
	 * @param counterBladder
	 * @param sick
	 * @param energy
	 * @param counterEnergy
	 * @param babies
	 * @param guestFriend
	 * @param sc
	 */
	public Tamagotchi(int height, int weight, int lifeTime, int counterHunger, int counterThirst, int counterMood,
			boolean mask, int counterHygiene, int counterStomach, int counterBladder, boolean sick, int counterEnergy,
			int health) {
		this.height = 45;
		this.weight = 3;
		this.lifeTime = 7300;
		this.counterHunger = 5;
		this.counterThirst = 5;
		this.counterMood = 5;
		this.mask = false;
		this.sick = false;
		this.counterHygiene = 3;
		this.counterStomach = 0;
		this.counterBladder = 0;
		this.counterEnergy = 5;
		this.health = 100;
		this.days = 0;
		this.months = 0;
		this.years = 0;

		this.setGender();
		this.setHunger();
		this.setThirst();
		this.setHygiene();
		this.setEnergy();
		this.setMood();
		this.getRandomColor();
		this.setStatusAge();
		this.setHealthState();
		this.setAge();
	}

	public Tamagotchi(String gender, String randomFirstName, String relation, int relationCounter) {

		this.gender = gender;
		this.randomFirstName = randomFirstName;
		this.relation = relation;
		this.relationCounter = relationCounter ;
		
		this.setGender();
		this.randomFirstname();
		this.setRelation();
		this.randomType();
	}

	/**
	 * @return the relationCounter
	 */
	public int getRelationCounter() {
		return relationCounter;
	}

	/**
	 * @param relationCounter the relationCounter to set
	 */
	public void setRelationCounter(int relationCounter) {
		this.relationCounter = relationCounter;
	}

	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	private void setRelation() {
		// TODO Auto-generated method stub

	}

	private void randomFirstname() {
		String[] femaleFirstNameTab = {
				"Câline",
				"Chipie",
				"Chouinette",
				"Choupinette",
				"Coquine",
				"Filoutte",
				"Frimouse",
				"Fripouille",
				"Artichaut",
				"Fantomette",
				"Foulkan",
				"Gelatine",
				"Grisebouille",
				"Lulubelle",
				"Miaulette",
				"Nicotine",
				"Pimprenelle",
				"Pitot",
				"Ristouflette",
				"Soquette",
				"Tapisserie",
				"Troufinette",
				"Zézette",
				"Zibouille",
				"Gribouille",
				"Altesse",
				"Celeste",
				 "Duchesse",
				"Galatée",
				"Galaxie",
				"Gracieuse",
				"Joconde",
				"Lionne"};

		String[] maleFirstNameTab = {
				"Ralph"
				,"Raphaël"
				,"Rémi"
				,"Robin"
				,"Rocky"
				,"Rodolphe"
				,"Romeo"
				,"Ruben"
				,"Rufus"
				,"Ryan"
				,"Android"
				,"Apple"
				,"Giga"
				,"Google"
				,"Java"
				,"Pixel"
				,"Siri"
				,"Virus"
				,"Widget"
				,"Wifi"
				,"Aladin"
				,"Baloo"
				,"Dingo"
				,"Dumbo"
				,"Jafar"
				,"Flash"
				,"Hercule"
				,"Merlin"
				,"Mickey"
				,"Nemo"
				,"Pinocchio"
				,"Pluto"
				,"Rémy"
				,"Simba"
				,"Sully"
				,"Tarzan"
				,"Tigrou"
				,"Winnie"
				,"Woody"};
		
		int fFNTLenght = femaleFirstNameTab.length;
		int mFNTLenght = maleFirstNameTab.length;
		int randomFirstName;
		if(this.getGender() == "male") {
			randomFirstName = (int) (Math.random() * (mFNTLenght - 0));
		}
		else {
			randomFirstName = (int) (Math.random() * (fFNTLenght - 0));
		}
		this.firstName = maleFirstNameTab[randomFirstName];
	}

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
	public void setStatusAge() {
		if (this.getType() == "chien") {
			if (this.years >= 12) {
				this.statusAge = "Vieux chien";
			} else if (this.years >= 2) {
				this.statusAge = "Adulte";
			} else {
				this.statusAge = "Chiot";
			}
		} else {
			if (this.years >= 12) {
				this.statusAge = "Vieux chat";
			} else if (this.years >= 2) {
				this.statusAge = "Adulte";
			} else {
				this.statusAge = "Chaton";
			}
		}
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
			this.hunger = "Rassasié";
		} else if (this.getCounterHunger() >= 5) {
			this.hunger = "Normal";
		} else if (this.getCounterHunger() >= 3) {
			this.hunger = "Petit creux";
		} else {
			this.hunger = "Affamé";
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
			this.thirst = "Désaltéré";
		} else if (this.getCounterThirst() >= 5) {
			this.thirst = "Normal";
		} else if (this.getCounterThirst() >= 3) {
			this.thirst = "Assoifé";
		} else {
			this.thirst = "Déshydraté";
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
			this.energy = "Fatigué";
		} else {
			this.energy = "Trés Fatigué";
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

	public void pee() {
		this.counterBladder = 0;
		Game.notif = true;
		Game.notifPee = true;
		this.setCounterHygiene(-2);
	}

	public void wash() {
		this.counterHygiene = 10;
	}

	public void findFriend() {
		int random = (int) (Math.random() * 3);
		if (random == 0) {
			Tamagotchi newFriend = new Tamagotchi(null, null,null ,0);
			this.friends.add(newFriend);
			Game.notif = true;
			Game.notifFriend = true;
			
		}

	}
	
}
