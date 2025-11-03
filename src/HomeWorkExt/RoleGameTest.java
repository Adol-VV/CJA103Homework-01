package HomeWorkExt;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		Hero a = new Hero("勒苟拉斯", 1, 0);
		HeroAction ha = new HeroAction();
		System.out.println(saber.getClass() == a.getClass());
		ha.setHero(saber);
		ha.attack();
		ha.move();
		ha.defend();
		
		ha.setHero(archer);
		ha.attack();
		ha.move();
	}

}
