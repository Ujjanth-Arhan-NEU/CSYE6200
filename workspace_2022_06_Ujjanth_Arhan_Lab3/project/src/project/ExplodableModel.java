package project;

import java.util.ArrayList;
import java.util.List;

public class ExplodableModel implements Runnable{
	
	private List<Explodable> explosions = new ArrayList<Explodable>();
	
	public void add(Explodable explosion) {
		explosions.add(explosion);
	}
	
	public List<Explodable> getAll(){
		return explosions;
	}
	
	static void demo() {

		System.out.println("In " + ExplodableModel.class.getName());		
		ExplodableModel explosion = new ExplodableModel();
		explosion.add(new GunShotI());
		explosion.add(new GrenadeI());
		
		explosion.run();
	}
	
	@Override
	public void run() {
		System.out.println(this.explosions.size() + " explosion objects!");
		for(Explodable explosion: getAll()) {
			explosion.explode();
		}
	}
}
