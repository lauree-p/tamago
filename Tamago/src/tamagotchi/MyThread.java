package tamagotchi;

import menu.MenuInit;
import tools.Utils;
 
/**
 * 
 * @author Laurée
 *
 */
public class MyThread extends Thread {
	
	int i = 0;
	
	@Override
	public void run() {
		
		if (MenuInit.initType == 1) {
		
			for (i = 0; Main.myDog.getHealth() != 0; i++ ) {
	
				// Si le tama est malade
				if (Main.myDog.isSick()) {
					Utils.sleep(2000); 
					Main.myDog.setHealth(-1); // on enleve 1 de vie
				}
				
				Utils.sleep(5000);
				Main.myDog.setCounterHunger(-1); 
				Main.myDog.setCounterThirst(-1);
				Main.myDog.setCounterStomach(1);
				Main.myDog.setCounterBladder(1);
				Main.myDog.setCounterEnergy(-1);
				
				Utils.sleep(10000);
				Main.myDog.setDays(1);
				Main.myDog.setLifeTime(Main.myDog.lifeTime-1);
				Main.myDog.setAge();
			}
		}
		else {
			
			for (i = 0; Main.myCat.getHealth() != 0; i++ ) {
				
				// Si le tama est malade
				if (Main.myCat.isSick()) {
					Utils.sleep(2000); 
					Main.myCat.setHealth(-1); // on enleve 1 de vie
				}
				
				Utils.sleep(5000);
				Main.myCat.setCounterHunger(-1); 
				Main.myCat.setCounterThirst(-1);
				Main.myCat.setCounterStomach(1);
				Main.myCat.setCounterBladder(1);
				Main.myCat.setCounterEnergy(-1);
				
				Utils.sleep(10000);
				Main.myCat.setDays(1);
				Main.myCat.setLifeTime(Main.myDog.lifeTime-1);
				Main.myCat.setAge();
			}
		}
	}

}
