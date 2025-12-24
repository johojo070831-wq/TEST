package animals.impl;

import animals.Animal;

public class Bird extends Animal {
	
	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println(name + "가 짹짹!");
	}

}
