package tools;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Laurée
 *
 */
public class Utils {

	/**
	 * 
	 * @param x
	 */
	public static void sleep(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Clear console with println
	 */
	public static void clearConsole() {
		for (int i = 0; i < 150; i++) {
			System.out.println();
		}
	}
	
	/**
	 * 
	 */
	public static void loading() {
		System.out.print("Chargement ");
		for (int i =0 ; i < 4 ; i++) {
			Utils.sleep(1000);
			System.out.print(". ");
		}
	}
	
	/**
	 * 
	 * @param x
	 */
	public static void sleepSeconds(int x) {
		try {
			TimeUnit.SECONDS.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param x
	 */
	public static void sleepMinute(int x) {
		try {
			TimeUnit.MINUTES.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static String[] femaleFirstNameTab = {
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
	
	public static String[] maleFirstNameTab = {
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
}
