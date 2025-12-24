package animals.impl;

import animals.Animal;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println(name + "가 야옹!");
	}

}
