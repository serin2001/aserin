package p82;

import java.util.HashMap;

public class ZooAllAnimals<T> {
	HashMap<T, Integer> zooInhabitants = new HashMap<>();
	
	public void addAnimal(T m) {
		if (!zooInhabitants.containsKey(m)) {
			zooInhabitants.put(m, 1);
			return;
		}
		// replaces if key is in map, otherwise puts new entry
		zooInhabitants.put(m, zooInhabitants.get(m) + 1);
	}
}
