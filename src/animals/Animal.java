package animals;

public abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//추상 메서드 -> 자식이 반드시 구현
	public abstract void sound();
	
	//final 메서드 -> 오버라이딩 금지
	public final void sleep() {
		System.out.println(name + "가 잠을 잡니다.");
	}

}
