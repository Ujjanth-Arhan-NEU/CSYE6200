package project;

import java.util.List;
import java.util.ArrayList;

public class AbstractExplosionModel implements Runnable {
	
	private List<AbstractExplosion> explosions = new ArrayList<AbstractExplosion>();
	
	public void add(AbstractExplosion explosion) {
		explosions.add(explosion);
	}
	
	public List<AbstractExplosion> getAll() {
		return explosions;
	}
	
	static void demo() {
		
		System.out.println("In " + AbstractExplosionModel.class.getName());
		AbstractExplosionModel explosion = new AbstractExplosionModel();
		explosion.add(new GunShotA());
		explosion.add(new GrenadeA());
		
		explosion.run();

	}

	@Override
	public void run() {
		System.out.println(explosions.size() + " explosion objects!");
		for(AbstractExplosion explosion: getAll()) {
			explosion.explode();
		}
	}
}
