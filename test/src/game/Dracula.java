package game;

class Dracula implements Monster {
	private int health;
	
	public Dracula(int health) {
		this.health = health;
	}

	public void getHealth() {
		System.out.println("���ŧ���� ���� ����? "+ health);
	}
	
	public void doEvolve() {
		System.out.println("���ŧ�� ������� ��ȭ�߽��ϴ�");
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
		System.out.println("���ŧ�� ����� �����մϴ�");
	}
}
