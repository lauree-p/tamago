package menu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import tamagotchi.Tamagotchi;
import tools.Clavier;
import tools.Utils;

public class MenuInit {
	
	
	static String separatorThin = "------------------------------------------------------------------";
	static String separatorBold = "====================================================================";

	public static void startInit(Tamagotchi myTama) {
		Utils.clearConsole();
		title();
		//Type
		type();
		requestType(myTama);
		replayType(myTama);
		//Gender
		gender(myTama);
		//FirstName
		firstName(myTama);
		requestFirstName(myTama);
		//
		loading();
	}

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

	public static void type() {
		System.out.println(separatorThin);
		System.out.println("> Choisissez votre type de compagnon :\n");
		System.out.println("- (1) : Chien (ALPHA Version) \n- (2) : Chat");
		System.out.println(separatorThin);
		
	}
	
	public static int requestType(Tamagotchi myTama) {
		int scType = Clavier.lireInt();
		myTama.setType(scType);
		System.out.println(separatorThin);
		return scType;
	}

	public static void replayType(Tamagotchi myTama) {
			System.out.println("Vous avez choisit un "+ myTama.getType());
	}	
	
	public static void gender(Tamagotchi myTama) {
		System.out.println(separatorThin);
		//myTama.setGender();
		if (myTama.getGender() == "Male") {
			System.out.println("Félication ! C'est un male !");
		} else {
			System.out.println("Félication ! C'est une femelle !");
		}
		System.out.println(separatorThin);
	}
	
	public static void firstName(Tamagotchi myTama) {
		System.out.println("Donnez un nom à votre " + myTama.getType() + " :");
	}
	
	public static void requestFirstName(Tamagotchi myTama) {
		String scFirstname;
		do {
			scFirstname = Clavier.lireString();
		} while (valideRequestFirstName(scFirstname) == false);
		myTama.setFirstName(scFirstname.toUpperCase());
	}

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
	
	public static void loading() {
		System.out.print("Chargement ");
		for (int i =0 ; i < 4 ; i++) {
			Utils.sleep(1000);
			System.out.print(". ");
		}
	}
}
