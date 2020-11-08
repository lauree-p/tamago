package tamagotchi; 

import menu.Game;
import menu.MenuInit;

/**
 * 
 * @author Laurée
 *
 */
public class Main {
	
	// Init new Tamagotchi
	//public static Tamagotchi myTama = new Tamagotchi(0, 0, 0, 0, 0, 0, false, 0, 0, 0, false, 0, 0);
	public static Dog myDog = new Dog();
	public static Cat myCat = new Cat();
	
	public static void main(String[] args) {

		MenuInit.startInit(); // lancement du menu d'initialisation


		// Création d'un chien ou d'un chat
		switch (MenuInit.initType) {
		case 1 :
			Dog myDog = new Dog(0, 0, 0, 0, 0, 0, false, 0, 0, 0, false, 0, 0); // Création d'un chien
			MyThread myThread1 = new MyThread(); // création du Thread
			myThread1.start(); // lancement du Thread
			Game.displayMenu(myDog); // lancement du jeu
		case 2 :
			Cat myCat = new Cat(0, 0, 0, 0, 0, 0, false, 0, 0, 0, false, 0, 0); // Création d'un chat
			MyThread myThread2 = new MyThread(); // création du Thread
			myThread2.start(); // lancement du Thread
			Game.displayMenu(myCat); // lancement du jeu
		}

	}

}