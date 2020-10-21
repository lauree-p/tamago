package tools;

public class Utils {

	public Utils() {
		
	}

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
}
