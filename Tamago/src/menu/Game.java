package menu;

import draw.Draw;
import tamagotchi.Tamagotchi;
import tools.Clavier;
import tools.Utils;

/**
 * Classe qui regroupe les m�thodes utiles dans la partie jeu
 * @author Laur�e
 */
public class Game {
	// S�parateurs
	static String separatorThin = "------------------------------------------------------------------";
	static String separatorBold = "====================================================================";
	// Notifications du jeu 
	public static boolean notif;
	public static boolean notifPoop;
	public static boolean notifPee;
	public static boolean notifEnergy;
	public static boolean notifSick;
	public static boolean notifFriend;
	
	public static int counterFriends;

	/**
	 * Nettoi la console et affiche le titre du jeu
	 */
	public static void clearAndTitle() {
		Utils.clearConsole();
		MenuInit.title();
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void displayMenu(Tamagotchi myTama) {
		clearAndTitle();
		menuTop();
		if (myTama.isMask()) {
			myTama.drawMyTamaWithMask();
		} else {
			myTama.drawMyTama();
		}
		notif();
		menuBot();
		chooseAction(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void chooseAction(Tamagotchi myTama) {
		int intAction = Clavier.lireInt();
		switch (intAction) {
		case 1:
			informations(myTama);
			break;
		case 2:
			feedingTime(myTama);
			break;
		case 3:
			washing(myTama);
			break;
		case 4:
			activities(myTama);
			break;
		case 5:
			healh(myTama);
			break;
		case 6:
			repose(myTama);
			break;
		case 7:
			friend(myTama);
			break;
		case 8:
			custom(myTama);
			break;
		default:
			chooseAction(myTama);
			break;
		}
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void informations(Tamagotchi myTama) {
		Utils.clearConsole();
		clearAndTitle();
		menuTopIn(1);
		menuInformation(myTama);
		menuEmpty();
		chooseInformation(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void menuInformation(Tamagotchi myTama) {
		System.out.print("\n\t\t\t\t\t\t     Age : " + myTama.getAge());
		System.out.print("\n\n\n");
		System.out.println("| Nom     : " + myTama.getFirstName());
		System.out.println("| Sexe    : " + myTama.getGender());
		System.out.println("| Status  : " + myTama.getStatusAge());
		System.out.println("| Couleur : " + myTama.getColor() + "\n");
		System.out.println("| Poids   : " + myTama.getWeight() + " kg");
		System.out.println("| Taille  : " + myTama.getHeight() + " cm" + "\n");
		
		System.out.println("| Vie     : " + myTama.getHealth());
		System.out.println("| Sant�   : " + myTama.getHealthState());
		System.out.println("| Faim    : " + myTama.getHunger());
		System.out.println("| Soif    : " + myTama.getThirst() + "\n");
		System.out.println("| Humeur  : " + myTama.getMood());
		System.out.println("| Hygiene : " + myTama.getHygiene());
		System.out.println("| Energie : " + myTama.getEnergy());
		System.out.print("\n");
		System.out.println("\t\t\t\t\t\t\t(1)RETOUR\n");

	}

	/**
	 * 
	 * @param myTama
	 */
	public static void chooseInformation(Tamagotchi myTama) {
		int intActionInformation = Clavier.lireInt();

		switch (intActionInformation) {
		case 1:
			displayMenu(myTama);
			break;
		default:
			informations(myTama);
			break;
		}
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void feedingTime(Tamagotchi myTama) {
		clearAndTitle();
		menuTopIn(2);
		menuFeedingTime();
		menuEmpty();
		chooseFeedingTime(myTama);
	}

	/**
	 * 
	 */
	public static void menuFeedingTime() {
		System.out.println("\n\n\n\n\n\n\n\n"); // 8+1
		System.out.println("\t|(1)CROQUETTES\n");  // 1+1
		System.out.println("\t|(2)EAU\n"); // 1+1
		System.out.println("\t|(3)BONBON"); // 1
		System.out.println("\n\n\n\n\n\n\n\n"); // 8+1
		System.out.println("\t\t\t\t\t\t\t   (4)RETOUR"); // total : 23
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void chooseFeedingTime(Tamagotchi myTama) {
		int intActionFeedingTime = Clavier.lireInt();

		switch (intActionFeedingTime) {
		case 1:
			myTama.eat(2);
			displayMenu(myTama);
			break;
		case 2:
			myTama.drink(2);
			displayMenu(myTama);
			break;
		case 3:
			myTama.eat(1);
			myTama.setCounterMood(1);
			displayMenu(myTama);
			break;
		case 4:
			displayMenu(myTama);
			break;
		default:
			feedingTime(myTama);
			break;
		}
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void activities(Tamagotchi myTama) {
		clearAndTitle();
		menuTopIn(4);
		menuActivities();
		menuEmpty();
		chooseActivities(myTama);
	}

	/**
	 * 
	 */
	public static void menuActivities() {
		System.out.println("\n\n\n\n\n\n\n\n\n"); // 9+1
		System.out.println("\t|(1)FAIRE DU SPORTS\n"); // 1+1
		System.out.println("\t|(2)PROMENADE"); // 1
		System.out.println("\n\n\n\n\n\n\n\n"); // 8+1
		System.out.println("\t\t\t\t\t\t\t   (3)RETOUR"); // total : 23
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void chooseActivities(Tamagotchi myTama) {
		int intActionActivities = Clavier.lireInt();

		switch (intActionActivities) {
		case 1:
			makeSport(myTama);
			break;
		case 2:
			walkAround(myTama);
			break;
		case 3:
			displayMenu(myTama);
			break;
		default:
			activities(myTama);
			break;
		}
	}

	/** 
	 * 
	 * @param myTama
	 */
	public static void healh(Tamagotchi myTama) {
		notifSick = false;
		myTama.setHealth(100);
		clearAndTitle();
		menuHealthInProgress();
		Draw.drawPlus();
		menuHealthInProgress();

		Utils.sleep(500);
		clearAndTitle();
		menuHealthInProgress();
		Draw.drawEmpty();
		menuHealthInProgress();

		Utils.sleep(500);
		clearAndTitle();
		menuHealthInProgress();
		Draw.drawPlus();
		menuHealthInProgress();

		Utils.sleep(500);
		clearAndTitle();
		menuHealthInProgress();
		Draw.drawEmpty();
		menuHealthInProgress();

		Utils.sleep(500);
		clearAndTitle();
		menuHealthInProgress();
		Draw.drawPlus();
		menuHealthInProgress();

		Utils.sleep(500);
		clearAndTitle();
		menuHealthInProgress();
		Draw.drawEmpty();
		menuHealthInProgress();
		Utils.sleep(500);

		myTama.setSick(false);
		displayMenu(myTama);

	}

	/**
	 * 
	 * @param myTama
	 */
	public static void repose(Tamagotchi myTama) {
		clearAndTitle();
		menuEmpty();
		menuRepose();
		menuBotIn(6);
		chooseRepose(myTama);
	}

	/**
	 * 
	 */
	public static void menuRepose() {
		System.out.println("\n\n\n\n\n\n\n\n\n"); // 9+1
		System.out.println("\t|(1)FAIRE UNE SIESTE \n"); // 1+1
		System.out.println("\t|(2)DORMIR"); // 1
		System.out.println("\n\n\n\n\n\n\n\n"); // 8+1
		System.out.println("\t\t\t\t\t\t\t   (3)RETOUR"); // total : 23
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void chooseRepose(Tamagotchi myTama) {
		int intActionRepose = Clavier.lireInt();

		switch (intActionRepose) {
		case 1:
			rest(myTama);
			break;
		case 2:
			sleep(myTama);
			break;
		case 3:
			displayMenu(myTama);
			break;
		default:
			repose(myTama);
			break;
		}
	}
	
	/**
	 * 
	 * @param myTama
	 */
	public static void friend(Tamagotchi myTama) {
		clearAndTitle();
		menuEmpty();
		menuFriend(myTama);
		menuBotIn(7);
		chooseFriend(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void menuFriend(Tamagotchi myTama) {
		counterFriends = 0;
		if (myTama.getFriends().size() == 0) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n"); // 10+1
			System.out.println("\t\t\tLa liste des amis est vide\n"); // 1
			System.out.println("\n\n\n\n\n\n\n\n\n\n"); // 10+1
			System.out.println("\t\t\t\t\t\t\t   (1)RETOUR"); // total : 23
		}
		else {
			notifFriend = false;
			for (Tamagotchi friend:myTama.getFriends()) {
				counterFriends++;
				System.out.println("("+counterFriends+")"+friend.getFirstName().toUpperCase() +"/"+ friend.getType() +"/"+ friend.getGender());
			};
			System.out.println("\t\t\t\t\t\t\t   ("+ (myTama.getFriends().size()+1) +")RETOUR");
		}
	}
	
	/**
	 * 
	 * @param myTama
	 */
	public static void chooseFriend(Tamagotchi myTama) {
		int intActionFriend = Clavier.lireInt();
		int tabSizeFriend = myTama.getFriends().size();
		
		if (intActionFriend > tabSizeFriend+1) {
			friend(myTama);
		}
		else if (intActionFriend == tabSizeFriend+1) {
			displayMenu(myTama);
		}
		else {
			friend(myTama);
		}
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void custom(Tamagotchi myTama) {
		clearAndTitle();
		menuEmpty();
		menuCustom(myTama);
		menuBotIn(8);
		chooseCustom(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void menuCustom(Tamagotchi myTama) {
		System.out.println("\n\n\n\n\n\n\n\n\n"); // 9+1
		if (myTama.isMask()) {
			System.out.println("\t|(1)ENLEVER LE MASQUE\n"); // 1+1
		} else {
			System.out.println("\t|(1)METTRE LE MASQUE\n"); // ou 1+1
		}
		System.out.println("\t|(2)TEINTURE"); // 1
		System.out.println("\n\n\n\n\n\n\n\n\n"); // 9+1
		System.out.println("\t\t\t\t\t\t\t   (3)RETOUR"); // total : 23
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void chooseCustom(Tamagotchi myTama) {
		int intActionCustom = Clavier.lireInt();

		switch (intActionCustom) {
		case 1:
			mask(myTama);
			break;
		case 2:
			tincture(myTama);
			break;
		case 3:
			displayMenu(myTama);
			break;
		default:
			activities(myTama);
			break;
		}
	}

	/**
	 * 
	 */
	public static void menuTop() {
		System.out.println(separatorBold);
		System.out.print("  (1)INFORMATIONS    ");
		System.out.print("(2)REPAS     ");
		System.out.print("(3)NETTOYAGE     ");
		System.out.println("(4)ACTIVITEES    ");
		System.out.println(separatorBold);
	}

	/**
	 * 
	 */
	public static void menuBot() {
		System.out.println(separatorBold);
		System.out.print("      (5)SOINS     ");
		System.out.print("(6)REPOS      ");
		System.out.print("(7)AMIS       ");
		System.out.println("(8)ACCESSOIRES");
		System.out.println(separatorBold);
	}

	/**
	 *                      
	 */
	public static void menuEmpty() {
		System.out.println(separatorBold);
		System.out.println("");
		System.out.println(separatorBold);
	}

	/**
	 *                      
	 */
	public static void menuTopIn(int x) {
		System.out.println(separatorBold);
		switch (x) {
		case 1:
			System.out.println("  INFORMATIONS    ");
			break;
		case 2:
			System.out.println("  REPAS    ");
			break;
		case 3:
			System.out.println("  NETTOYAGE    ");
			break;
		case 4:
			System.out.println("  ACTIVITEES    ");
			break;
		}
		System.out.println(separatorBold);
	}

	/**
	 *                      
	 */
	public static void menuBotIn(int x) {
		System.out.println(separatorBold);
		switch (x) {
		case 5:
			System.out.println("  SOINS    ");
			break;
		case 6:
			System.out.println("  REPOS    ");
			break;
		case 7:
			System.out.println("  AMIS    ");
			break;
		case 8:
			System.out.println("  ACCESSOIRES    ");
			break;
		}
		System.out.println(separatorBold);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void washing(Tamagotchi myTama) {
		notifPoop = false;
		notifPee = false;

		clearAndTitle();
		menuTop();
		Draw.wash1();
		menuBot();

		Utils.sleep(500);
		clearAndTitle();
		menuTop();
		Draw.wash2();
		menuBot();

		Utils.sleep(500);
		clearAndTitle();
		menuTop();
		Draw.wash3();
		menuBot();

		Utils.sleep(500);
		clearAndTitle();
		menuTop();
		Draw.wash4();
		menuBot();

		Utils.sleep(500);
		clearAndTitle();
		menuTop();
		Draw.wash5();
		menuBot();

		Utils.sleep(500);
		clearAndTitle();
		menuTop();
		Draw.wash6();
		menuBot();

		Utils.sleep(500);
		clearAndTitle();
		menuTop();
		Draw.wash7();
		menuBot();

		Utils.sleep(500);
		clearAndTitle();
		menuTop();
		Draw.wash8();
		menuBot();

		myTama.setCounterHygiene(8);
		displayMenu(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void sleep(Tamagotchi myTama) {
		notifEnergy = false;
		myTama.drawSleep();
		myTama.setCounterEnergy(4);
		displayMenu(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void rest(Tamagotchi myTama) {
		notifEnergy = false;
		myTama.drawRest();
		myTama.setCounterEnergy(8);
		displayMenu(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void mask(Tamagotchi myTama) {
		myTama.setMask();
		displayMenu(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void menuTincture(Tamagotchi myTama) {
		System.out.println("\n\n\n\n\n\n\n"); // 7+1
		System.out.println("\t|(1)ROUGE\n"); // 1+1
		System.out.println("\t|(2)BLEU\n"); // 1+1
		System.out.println("\t|(3)VERT\n"); // 1+1
		System.out.println("\t|(4)VIOLET"); // 1
		System.out.println("\n\n\n\n\n\n\n"); // 7+1
		System.out.println("\t\t\t\t\t\t\t   (5)RETOUR"); // total : 23
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void tincture(Tamagotchi myTama) {
		clearAndTitle();
		menuEmpty();
		menuTincture(myTama);
		menuBotIn(8);
		chooseTincture(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void chooseTincture(Tamagotchi myTama) {
		int intTincture = Clavier.lireInt();

		switch (intTincture) {
		case 1:
			myTama.setColor("Rouge");
			displayMenu(myTama);
			break;
		case 2:
			myTama.setColor("Bleu");
			displayMenu(myTama);
			break;
		case 3:
			myTama.setColor("Vert");
			displayMenu(myTama);
			break;
		case 4:
			myTama.setColor("Violet");
			displayMenu(myTama);
			break;
		case 5:
			custom(myTama);
			break;
		default:
			displayMenu(myTama);
			break;
		}
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void makeSport(Tamagotchi myTama) {

		myTama.drawSport();
		myTama.setCounterEnergy(-2);
		displayMenu(myTama);
	}

	/**
	 * 
	 * @param myTama
	 */
	public static void walkAround(Tamagotchi myTama) {

		myTama.drawWalkAround();

		myTama.findFriend();
		
		myTama.setCounterEnergy(-4);

		if (!myTama.isMask()) {
			myTama.setSick(true);
		}
		
		Utils.sleep(1200);
		displayMenu(myTama);
	}

	/**
	 *                      
	 */
	public static void menuWalkAroundInProgress() {
		System.out.println(separatorBold);
		System.out.println("\t\t\t      PROMENADE");
		System.out.println(separatorBold);
	}

	/**
	 *                      
	 */
	public static void menuHealthInProgress() {
		System.out.println(separatorBold);
		System.out.println("\t\t\t   SOINS EN COURS");
		System.out.println(separatorBold);
	}

	/**
	 * 
	 */
	public static void notif() {
		if (notifPoop) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@ Ahhh fait caca ! @@@@@@@@@@@@@@@@@@@@@@@");
			notif = true;
		}
		if (notifPee) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@ Ahhh fait pipi ! @@@@@@@@@@@@@@@@@@@@@@@");
			notif = true;
		}
		if (notifEnergy) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ Plus de force zzZZ ! @@@@@@@@@@@@@@@@@@@@@");
			notif = true;
		}
		if (notifSick) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@ Votre compagnon est malade ! @@@@@@@@@@@@@@@@@");
			notif = true;
		}
		if (notifFriend) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@ Ajout d'un nouvel ami ! @@@@@@@@@@@@@@@@@@@");
			notif = true;
		}
		if (!notif) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

	
	
}
