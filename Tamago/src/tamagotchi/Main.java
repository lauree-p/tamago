package tamagotchi; 

import menu.Game;
import menu.MenuInit;

public class Main {
	
	// Init new Tamagotchi
	public static Tamagotchi myTama = new Tamagotchi(0, 0, 0, 0, 0, 0, false, 0, 0, 0, false, 0, 0);
	
	public static void main(String[] args) {

		MenuInit.startInit(); // lancement du menu d'initialisation
		MyThread myThread = new MyThread(); // création du Thread
		myThread.start(); // lancement du Thread
		Game.displayMenu(myTama); // lancement du jeu
	}

}