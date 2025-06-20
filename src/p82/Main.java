package p82;

public class Main {

	public static void main(String[] args) {
		Lion l1 = new Lion("Bernd");
		Lion l2 = new Lion("Hans");
		Lion l3 = new Lion("Anna");
		Insect i1 = new Insect("Marie", 6);
		Insect i2 = new Insect("Lisa", 8);
		
		ZooMammals mammals = new ZooMammals();
		mammals.addAnimal(l1);
		mammals.addAnimal(l2);
		mammals.addAnimal(l3);
		// Anzahl Loewen
		System.out.println(mammals.zooInhabitants.get(l1));
		
		
		// doesn't work, The method addAnimal(Mammal) in the type ZooMammals is not applicable for the arguments (Insect)
//		ZooMammals insects = new ZooMammals();
//		insects.addAnimal(i1);
//		insects.addAnimal(i2);
		
		ZooAllAnimals<Mammal> mammals2 = new ZooAllAnimals<>();
		mammals2.addAnimal(l1);
		mammals2.addAnimal(l2);
		
		ZooAllAnimals<Insect> insects2 = new ZooAllAnimals<>();
		insects2.addAnimal(i1);
		insects2.addAnimal(i2);
	}
}
