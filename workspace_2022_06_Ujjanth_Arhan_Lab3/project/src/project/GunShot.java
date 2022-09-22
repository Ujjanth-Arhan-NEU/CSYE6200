package project;

public class GunShot extends Explosion {
	@Override
	public void explode() {
		System.out.println("Gunshot fired by using concrete super class!");
	}
}
