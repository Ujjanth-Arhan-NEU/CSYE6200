package project;

public abstract class AbstractExplosion {
	private static final String EXPLOSION_MESSAGE = "Abstract explosion!";
	public void explode() {
		System.out.println(EXPLOSION_MESSAGE);
	}
}
