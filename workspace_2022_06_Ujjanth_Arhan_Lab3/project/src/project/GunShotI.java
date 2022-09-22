package project;

public class GunShotI implements Explodable {

	@Override
	public void explode() {
		System.out.println("Interface gunshot fired!");
	}

}
