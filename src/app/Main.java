package app;

import animals.Animal;
import animals.impl.Bird;
import animals.impl.Cat;
import animals.impl.Dog;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("바둑이"),
				new Cat("나비"),
				new Bird("짹짹이"),
		};
		
		for (Animal a : animals) {
			a.sound();
			a.sleep();
			System.out.println("---");
		}
	}
}
