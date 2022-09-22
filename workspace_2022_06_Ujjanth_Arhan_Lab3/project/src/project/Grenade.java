package project;

public class Grenade extends Explosion {
	@Override
	public void explode() {
		System.out.println("Grenade explodes by using concrete super class!");
	}
}
