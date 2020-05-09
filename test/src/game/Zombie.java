package game;

class Zombie implements Monster {
	private int health;
	
	public Zombie(int health) {
		this.health = health;
	}
	
	public void getHealth() {
		System.out.println("좀비의 채력은?"+ health);
	}
	
	public void doEvolve() {
		System.out.println("좀비가 사람으로 진화했습니다.");
	}
	
	public int changeHealth(boolean isWin) {
		if (isWin) {
			health++;
		} else {
			health--;
		}
		return health;
	}
	
	public void chase() {
		System.out.println("좀비가 쫓아갑니다");
	}
}
