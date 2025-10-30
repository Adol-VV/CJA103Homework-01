package HomeWorkExt;

public class HeroAction {
	
	private Hero hero = new Hero();
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	public void attack() {
		hero.attack();
	}
	public void move() {
		hero.move();
	}
	public void defend() {
		hero.defend();
	}

}
