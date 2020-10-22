package tamagotchi;

import tools.Utils;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; Main.myTama.getHealth() != 0; i++ ) {

			if (Main.myTama.isSick()) {
				Utils.sleep(2000);
				Main.myTama.setHealth(-1);
			}
			
			Utils.sleep(5000);
			Main.myTama.setCounterHunger(-1);
			Main.myTama.setCounterThirst(-1);
			Main.myTama.setCounterStomach(1);
			Main.myTama.setCounterBladder(1);
			Main.myTama.setCounterEnergy(-1);
			
			Utils.sleep(10000);
			Main.myTama.setDays(1);
			Main.myTama.setLifeTime(Main.myTama.lifeTime-1);
			Main.myTama.setAge();
		}
		
	}

}
