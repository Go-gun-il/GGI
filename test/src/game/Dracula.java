package game;

class Dracula implements Monster {
	private int health;
	
	public Dracula(int health) {
		this.health = health;
	}

	public void getHealth() {
		System.out.println("드라큘라의 남은 힘은? "+ health);
	}
	
	public void doEvolve() {
		System.out.println("드라큘라가 사람으로 진화했습니다");
	}
	
	public int changeHealth(boolean isWin) {
		if(isWin) {
			health *= 2;
		}else {
			health /= 2;
		}
		return health;
	}
	public void hunt() {
		System.out.println("드라큘라가 사냥을 시작합니다");
	}
}
