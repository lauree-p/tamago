package menu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tamagotchi.Main;
import tools.Clavier;
import tools.Utils;

/**
 *Classe qui regroupe toute la partie de l'initialisation du jeu 
 * @author Laurée
 *
 */
public class MenuInit {
	
	static String separatorThin = "------------------------------------------------------------------";
	
	static String separatorBold = "====================================================================";

	/**
	 * Permet de lancer le menu d'initialisation du nouveau Tamagotchi.
	 * {@inheritdoc}  
	 */
	public static void startInit() {
		Utils.clearConsole();
		
		title();
		
		type();
		
		requestType();
		
		replayType();
		
		gender();
		
		firstName();
		
		requestFirstName();
		
		Utils.loading();
	}

	/**
	 * 
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
	 * 
	 */
	public static void type() {
		System.out.println(separatorThin);
		System.out.println("> Choisissez votre type de compagnon :\n");
		System.out.println("- (1) : Chien (ALPHA Version) \n- (2) : Chat");
		System.out.println(separatorThin);
		
	}
	
	/**
	 * 
	 * @return scType
	 */
	public static int requestType() {
		int scType = Clavier.lireInt();
		
		Main.myTama.setType(scType);
		System.out.println(separatorThin);
		
		return scType;
	}

	/**
	 * 
	 */
	public static void replayType() {
			System.out.println("Vous avez choisit un "+ Main.myTama.getType());
	}	
	
	/**
	 * 
	 */
	public static void gender() {
		System.out.println(separatorThin);

		if (Main.myTama.getGender() == "Male") {
			System.out.println("Félication ! C'est un male !");
		} else {
			System.out.println("Félication ! C'est une femelle !");
		}
		
		System.out.println(separatorThin);
	}
	
	/**
	 * 
	 */
	public static void firstName() {
		System.out.println("Donnez un nom à votre " + Main.myTama.getType() + " :");
	}
	
	/**
	 * 
	 */
	public static void requestFirstName() {
		String scFirstname;
		
		do {
			scFirstname = Clavier.lireString();
		} while (valideRequestFirstName(scFirstname) == false);
		
		Main.myTama.setFirstName(scFirstname.toUpperCase());
	}

	/**
	 * 
	 * @param scFirstname
	 * @return valid
	 */
	public static boolean valideRequestFirstName(String scFirstname) {
		String regex = "[a-zA-Z]{3,6}";
		
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
