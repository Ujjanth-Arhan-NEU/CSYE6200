package project;

import java.util.ArrayList;
import java.util.List;

public class ExplosionModel implements Runnable {
	
	private List<Explosion> explosions = new ArrayList<Explosion>();
	
	void add(Explosion explosion) {
		explosions.add(explosion);
	}
	
	public List<Explosion> getAll(){
		return explosions;
	}
	
	static void demo() {
		
		System.out.println("In " + ExplosionModel.class.getName());		
		ExplosionModel explosionModel = new ExplosionModel();
		explosionModel.add(new GunShot());
		explosionModel.add(new Grenade());
		
		explosionModel.run();
	}

	@Override
	public void run() {
		System.out.println(this.explosions.size() + " explosion objects!");
		for(Explosion explosion: getAll()) {
			explosion.explode();
		}
	}
}
