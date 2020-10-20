package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import tamagotchi.Tamagotchi;

public class TamagotchiTest {
	
	Tamagotchi testTama = new Tamagotchi();
	
	@Test
	public void eat() {
		
		testTama.setCounterStomach(5);
		testTama.setCounterHygiene(8);
		testTama.eat(8);

	}
	
	
	
	@Test
	public void getHygiene() {
		Tamagotchi testTama = new Tamagotchi();
		
		// 0 - 8
		testTama.setCounterHygiene(0);
		assertTrue(testTama.getHygiene() == "Sale");
		
		testTama.setCounterHygiene(1);
		assertTrue(testTama.getHygiene() == "Sale");
		testTama.setCounterHygiene(-1);

		testTama.setCounterHygiene(2);
		assertTrue(testTama.getHygiene() == "Sale");
		testTama.setCounterHygiene(-2);
		
		testTama.setCounterHygiene(3);
		assertTrue(testTama.getHygiene() == "Normal");
		testTama.setCounterHygiene(-3);

		testTama.setCounterHygiene(4);
		assertTrue(testTama.getHygiene() == "Normal");
		testTama.setCounterHygiene(-4);
		
		testTama.setCounterHygiene(5);
		assertTrue(testTama.getHygiene() == "Propre");
		testTama.setCounterHygiene(-5);
				
		testTama.setCounterHygiene(6);
		assertTrue(testTama.getHygiene() == "Propre");
		testTama.setCounterHygiene(-6);
		
		testTama.setCounterHygiene(7);
		assertTrue(testTama.getHygiene() == "Impecable");
		testTama.setCounterHygiene(-7);

		testTama.setCounterHygiene(8);
		assertTrue(testTama.getHygiene() == "Impecable");
		testTama.setCounterHygiene(-8);
		
		// > 8
		testTama.setCounterHygiene(50);
		assertTrue(testTama.getHygiene() == "Impecable");
		testTama.setCounterHygiene(-50);
		
		// Negative
		testTama.setCounterHygiene(-1);
		assertTrue(testTama.getHygiene() == "Sale");
		testTama.setCounterHygiene(+1);
		
	}
	
	@Test
	public void getMood() {
		Tamagotchi testTama = new Tamagotchi();
		
		// 0 - 8
		testTama.setCounterMood(0);
		assertTrue(testTama.getMood() == "Malheureux");
		
		testTama.setCounterMood(1);
		assertTrue(testTama.getMood() == "Malheureux");
		testTama.setCounterMood(-1);

		testTama.setCounterMood(2);
		assertTrue(testTama.getMood() == "Malheureux");
		testTama.setCounterMood(-2);
		
		testTama.setCounterMood(3);
		assertTrue(testTama.getMood() == "Triste");
		testTama.setCounterMood(-3);

		testTama.setCounterMood(4);
		assertTrue(testTama.getMood() == "Triste");
		testTama.setCounterMood(-4);

		testTama.setCounterMood(5);
		assertTrue(testTama.getMood() == "Normal");
		testTama.setCounterMood(-5);
				
		testTama.setCounterMood(6);
		assertTrue(testTama.getMood() == "Normal");
		testTama.setCounterMood(-6);

		testTama.setCounterMood(7);
		assertTrue(testTama.getMood() == "Heureux");
		testTama.setCounterMood(-7);
				
		testTama.setCounterMood(8);
		assertTrue(testTama.getMood() == "Heureux");
		testTama.setCounterMood(-8);
		
		// > 8
		testTama.setCounterMood(50);
		assertTrue(testTama.getMood() == "Heureux");
		testTama.setCounterMood(-50);
		
		// Negative
		testTama.setCounterMood(-1);
		assertTrue(testTama.getMood() == "Malheureux");
		testTama.setCounterMood(+1);
		
	}
	
	@Test
	public void getThirst() {
		Tamagotchi testTama = new Tamagotchi();
		
		// 0 - 8
		testTama.setCounterThirst(0);
		assertTrue(testTama.getThirst() == "Déshydraté");
		
		testTama.setCounterThirst(1);
		assertTrue(testTama.getThirst() == "Déshydraté");
		testTama.setCounterThirst(-1);

		testTama.setCounterThirst(2);
		assertTrue(testTama.getThirst() == "Déshydraté");
		testTama.setCounterThirst(-2);
		
		testTama.setCounterThirst(3);
		assertTrue(testTama.getThirst() == "Assoifé");
		testTama.setCounterThirst(-3);
		
		testTama.setCounterThirst(4);
		assertTrue(testTama.getThirst() == "Assoifé");
		testTama.setCounterThirst(-4);
		
		testTama.setCounterThirst(5);
		assertTrue(testTama.getThirst() == "Normal");
		testTama.setCounterThirst(-5);
				
		testTama.setCounterThirst(6);
		assertTrue(testTama.getThirst() == "Normal");
		testTama.setCounterThirst(-6);
				
		testTama.setCounterThirst(7);
		assertTrue(testTama.getThirst() == "Désaltéré");
		testTama.setCounterThirst(-7);
				
		testTama.setCounterThirst(8);
		assertTrue(testTama.getThirst() == "Désaltéré");
		testTama.setCounterThirst(-8);
		
		// > 8
		testTama.setCounterThirst(50);
		assertTrue(testTama.getThirst() == "Désaltéré");
		testTama.setCounterThirst(-50);
		
		// Negative
		testTama.setCounterThirst(-1);
		assertTrue(testTama.getThirst() == "Déshydraté");
		testTama.setCounterThirst(+1);
		

	}
	
	@Test 
	public void setType() {
		Tamagotchi testTama = new Tamagotchi();
		testTama.setType(1);
		assertTrue(testTama.getType() == "Chien");
		testTama.setType(2);
		assertTrue(testTama.getType() == "Chat");
	}
	
	@Test 
	public void setGender() {
		Tamagotchi testTama = new Tamagotchi();
		testTama.setGender();
		assertTrue(testTama.getGender() == "Male" || testTama.getGender() == "Femelle");
	}
	
//	@Test 
//	public void setFirstName() {
//		Tamagotchi testTama = new Tamagotchi();
//		//testTama.setFirstName();
//	}
	
//	@Test 
//	public void requestFirstName() {
//		Tamagotchi testTama = new Tamagotchi();
//		assertTrue(testTama.valideRequestFirstName("joj") == true);
//		assertTrue(testTama.valideRequestFirstName("jo") == false);
//		assertTrue(testTama.valideRequestFirstName("jojojoj") == false);
//		assertTrue(testTama.valideRequestFirstName("jojo1") == false);
//		assertTrue(testTama.valideRequestFirstName("jojo 1") == false);
//	}
	
	@Test
	public void setCounterHunger() {
		Tamagotchi testTama = new Tamagotchi();
		
		testTama.setCounterHunger(0);
		assertTrue(testTama.getCounterHunger()== 0);
		
		testTama.setCounterHunger(5);
		assertTrue(testTama.getCounterHunger()== 5);
		testTama.setCounterHunger(-5);
		
		// > 8
		testTama.setCounterHunger(9);
		assertTrue(testTama.getCounterHunger()== 8);
		testTama.setCounterHunger(-9);
		
		// Negative
		testTama.setCounterHunger(-9);
		assertTrue(testTama.getCounterHunger()== 0);
	}
	
	@Test
	public void getHunger() {
		Tamagotchi testTama = new Tamagotchi();
		
		// 0 - 8
		testTama.setCounterHunger(0);
		assertTrue(testTama.getHunger() == "Affamé");
		
		testTama.setCounterHunger(1);
		assertTrue(testTama.getHunger() == "Affamé");
		testTama.setCounterHunger(-1);

		testTama.setCounterHunger(2);
		assertTrue(testTama.getHunger() == "Affamé");
		testTama.setCounterHunger(-2);
		
		testTama.setCounterHunger(3);
		assertTrue(testTama.getHunger() == "Petit creux");
		testTama.setCounterHunger(-3);
		
		testTama.setCounterHunger(4);
		assertTrue(testTama.getHunger() == "Petit creux");
		testTama.setCounterHunger(-4);
		
		testTama.setCounterHunger(5);
		assertTrue(testTama.getHunger() == "Normal");
		testTama.setCounterHunger(-5);
				
		testTama.setCounterHunger(6);
		assertTrue(testTama.getHunger() == "Normal");
		testTama.setCounterHunger(-6);
				
		testTama.setCounterHunger(7);
		assertTrue(testTama.getHunger() == "Rassasié");
		testTama.setCounterHunger(-7);
				
		testTama.setCounterHunger(8);
		assertTrue(testTama.getHunger() == "Rassasié");
		testTama.setCounterHunger(-8);
		
		// > 8
		testTama.setCounterHunger(50);
		assertTrue(testTama.getHunger() == "Rassasié");
		testTama.setCounterHunger(-50);
		
		// Negative
		testTama.setCounterHunger(-1);
		assertTrue(testTama.getHunger() == "Affamé");
		testTama.setCounterHunger(+1);
		

	}
	
}
