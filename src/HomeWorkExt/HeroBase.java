package HomeWorkExt;

public interface HeroBase {
	
	public default void attack() {
		System.out.println("拳擊");
	}
	
	public default void move() {
		System.out.println("跑步");
	}
	
	default void defend() {
		System.out.println("做防禦動作");
	}
}
