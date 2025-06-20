package p82;

import java.util.HashMap;

public class ZooMammals {
	HashMap<Mammal,Integer> zooInhabitants = new HashMap<>();

	public void addAnimal(Mammal m) {
		if (!zooInhabitants.containsKey(m)) {
			zooInhabitants.put(m, 1);
			return;
		}
		// replaces if key is in map, otherwise puts new entry
		zooInhabitants.put(m, zooInhabitants.get(m) + 1);
	}
}
