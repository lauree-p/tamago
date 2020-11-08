package tamagotchi;

import draw.Draw;
import draw.DrawCat;
import menu.Game;
import menu.MenuInit;
import tools.Utils;

public class Cat extends Tamagotchi {
	
	public Cat() {
		
	}

	public Cat(int height, int weight, int lifeTime, int counterHunger, int counterThirst, int counterMood,
			boolean mask, int counterHygiene, int counterStomach, int counterBladder, boolean sick, int counterEnergy,
			int health) {
		super(height, weight, lifeTime, counterHunger, counterThirst, counterMood, mask, counterHygiene, counterStomach,
				counterBladder, sick, counterEnergy, health);
		this.firstName = MenuInit.initName;
		this.gender = MenuInit.initGender;
		this.type = "Chat";
		this.height = 45;
		this.weight = 3;
		
		this.setHunger();
		this.setThirst();
		this.setHygiene();
		this.setEnergy();
		this.setMood();
		this.getRandomColor();
		this.setStatusAge();
		this.setHealthState();
		this.setAge();
		
	}
	
	/**
	 * @param statusAge the statusAge to set
	 */
	public void setStatusAge() {

		if (this.years >= 12) {
			this.statusAge = "Vieux chat";
		} else if (this.years >= 2) {
			this.statusAge = "Adulte";
		} else {
			this.statusAge = "Chaton";
		}
	}

	public void drawMyTama() {
		DrawCat.drawMyCat();
	}

	/**
	 * 
	 */
	public void drawSleep() {
		for (int i = 0; i < 2; i++) {
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sleep1();
			Game.menuBot();

			Utils.sleep(800);
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sleep2();
			Game.menuBot();

			Utils.sleep(800);
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sleep3();
			Game.menuBot();
			Utils.sleep(800);
		}
	}

	/**
	 * 
	 */
	public void drawRest() {
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sleep1();
			Game.menuBot();

			Utils.sleep(800);
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sleep2();
			Game.menuBot();

			Utils.sleep(800);
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sleep3();
			Game.menuBot();
			Utils.sleep(800);
	}
	
	/**
	 * 
	 */
	public void drawSport() {
		for (int i = 0; i < 3; i++) {
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sport1();
			Game.menuBot();

			Utils.sleep(800);
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sport2();
			Game.menuBot();

			Utils.sleep(800);
			Game.clearAndTitle();
			Game.menuTop();
			DrawCat.sport3();
			Game.menuBot();
			Utils.sleep(800);
		}
	}
	
	/**
	 * 
	 */
	public void drawWalkAround() {
		Game.clearAndTitle();
		Game.menuWalkAroundInProgress();
		DrawCat.walkAround1();
		Game.menuWalkAroundInProgress();

		Utils.sleep(800);
		Game.clearAndTitle();
		Game.menuWalkAroundInProgress();
		DrawCat.walkAround2();
		Game.menuWalkAroundInProgress();

		Game.clearAndTitle();
		Game.menuWalkAroundInProgress();
		DrawCat.walkAround3();
		Game.menuWalkAroundInProgress();

		Utils.sleep(800);
		Game.clearAndTitle();
		Game.menuWalkAroundInProgress();
		DrawCat.walkAround4();
		Game.menuWalkAroundInProgress();

		Utils.sleep(800);
		Game.clearAndTitle();
		Game.menuWalkAroundInProgress();
		DrawCat.walkAround5();
		Game.menuWalkAroundInProgress();

		Utils.sleep(800);
		Game.clearAndTitle();
		Game.menuWalkAroundInProgress();
		Draw.walkAroundEmpty();
		Game.menuWalkAroundInProgress();
		Utils.sleep(800);
	}
	
	/**
	 * 
	 */
	public void drawMyTamaWithMask() {
		DrawCat.drawMyTamaWithMask();;
	}

}
