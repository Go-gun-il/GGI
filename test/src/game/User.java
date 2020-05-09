package game;

public class User {
	
	public static void play(Monster mon) {
		mon.doEvolve();
	}
	
	public static void fight(Monster mon, boolean isWin) {
		mon.changeHealth(isWin);
		mon.getHealth();
	}

	public static void main(String[] args) {
		Monster zombie = new Zombie(150);
		Monster dracula = new Dracula(200);
		
		fight(zombie, true);
		fight(dracula, false);
		
		play(zombie);
		play(dracula);
		
		// 에러
		//zombie.chase();
		//dracula.hunt();
		
		Zombie z = new Zombie(150);
		Dracula d = new Dracula(200);
		z.chase(); // 좀비가 쫓아갑니다
		d.hunt(); // 드라큘라가 사냥을 시작합니다

	}

}

