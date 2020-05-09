package game;

class Zombie implements Monster {
	private int health;
	
	public Zombie(int health) {
		this.health = health;
	}
	
	public void getHealth() {
		System.out.println("������ ä����?"+ health);
	}
	
	public void doEvolve() {
		System.out.println("���� ������� ��ȭ�߽��ϴ�.");
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
		System.out.println("���� �Ѿư��ϴ�");
	}
}
