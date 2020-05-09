package com.ggi.v2;

class Monster {
	int health;
	String name;
	int level = 0;
	static String food = "human";
	public void setInfo(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public int getPower() {
		int power = level + health;
		return power;
	}
	
	public void changeLevel(boolean iswin) {
		if(iswin) {
			level++;
			health += 2;
		}
		else {
			level--;
			health /= 2;
		}
		System.out.println("변경된 몬스터의 주식은 " + food + "입니다");
	}
	
	public static void changeFood(String newfood) {
		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Monster zombie = new Monster();
		
		Monster dracula = new Monster();
	}

}
