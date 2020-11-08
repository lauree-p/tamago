package menu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tamagotchi.Main;
import tools.Clavier;
import tools.Utils;

/**
 * Classe qui regroupe toute la partie de l'initialisation du jeu 
 * @author Laur�e
 */
public class MenuInit {
	
	 // Stock les valeurs � attribuer au futur chien ou chat
	public static int initType;
	public static String initTypeToString;
	public static String initName;
	public static String initGender;
	
	// Separateurs
	static String separatorThin = "------------------------------------------------------------------";
	static String separatorBold = "====================================================================";

	/**
	 * Permet de lancer le menu d'initialisation du nouveau Tamagotchi.
	 */ 
	public static void startInit() {
		
		Utils.clearConsole();
		
		title();
		
		type();
		
		requestType();
		
		printAnswerType();
		
		gender();
		
		firstName();
		
		requestFirstName();
		
		Utils.loading();
	}

	/**
	 * Print ACSCI le titre du jeu
	 */
	public static void title() {
		System.out.println("     _______                                _       _     _ ");
		System.out.println("    |__   __|                              | |     | |   (_)");
		System.out.println("       | | __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ ");
		System.out.println("       | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |");
		System.out.println("       | | (_| | | | | | | (_| | (_| | (_) | || (__| | | | |");
		System.out.println("       |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|");
		System.out.println("                                 __/ |                      ");
		System.out.println("                                |___/                       \n");
	}

	/**
	 * Print la demande du type de tamagotchi
	 */
	public static void type() {
		
		System.out.println(separatorThin);
		
		System.out.println("> Choisissez votre type de compagnon :\n");
		System.out.println("- (1) : Chien\n- (2) : Chat");
		System.out.println(separatorThin);
		
	}
	
	/**
	 * Demande le type de tamagotchi
	 * @return scType
	 */
	public static int requestType() {
		
		int scType = Clavier.lireInt();
		System.out.println(separatorThin);
		initType = scType; // stock la valeur du type pour cr�er l'objet plus tard
		
		return scType;
	}

	/**
	 * Affiche le choix du type du tama
	 */
	public static void printAnswerType() {
		
		switch (initType) {
		case 1 : 
			initTypeToString = "Chien";
			break;
		case 2 : 
			initTypeToString = "Chat";
			break;
		}
			System.out.println("Vous avez choisit un "+ initTypeToString);
	}
	
	/**
	 * Affiche le genre du tamagotchi
	 */
	public static void gender() {
		
		System.out.println(separatorThin);
		
		String[] tabGender = { "Male", "Femelle" };
		int random = (int) (Math.random() * 2);
		initGender = tabGender[random];

		if (initGender == "Male") {
			System.out.println("F�lication ! C'est un male !");
			
		} else {
			
			System.out.println("F�lication ! C'est une femelle !");
		}
		
		System.out.println(separatorThin);
	}
	
	/**
	 * Affiche la demande le pr�nom du tama
	 */
	public static void firstName() {
		System.out.println("Donnez un nom �votre " + initTypeToString + " (min 3 caractere et max 6) :");
	}
	
	/**
	 * Demande le pr�nom du tama
	 */
	public static void requestFirstName() {
		
		String scFirstname;
		
		do { 
			scFirstname = Clavier.lireString(); // demande � l'utilisateur
		} while (valideRequestFirstName(scFirstname) == false); // tant que scFirstname n'est pas valide
		
		initName = scFirstname.toUpperCase(); // stock le nom pour pour cr�er l'objet plus tard
	}

	/**
	 * Valide l'entr�e du pr�nom
	 * @param scFirstname
	 * @return valid
	 */
	public static boolean valideRequestFirstName(String scFirstname) {
		String regex = "[a-zA-Z]{3,6}"; // Que des lettres - 3 � 6 lettres 
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(scFirstname);
		
		boolean valid = false;

		if (matcher.find()) {
			
			if (matcher.group(0) == scFirstname) {
				
				valid = true;
				
			}
			
		} else {
			
			valid = false;
			
		}
		
		return valid;
	}

}
