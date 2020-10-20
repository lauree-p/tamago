package tamagotchi; 

import menu.Game;
import menu.MenuInit;

public class Main {

	public static void main(String[] args) {
		Tamagotchi myTama = new Tamagotchi(0, 0, 0, 0, 0, 0, false, 0, 0, 0, false, 0, 0);
		MenuInit.startInit(myTama);
		Game.displayMenu(myTama);
	}

}