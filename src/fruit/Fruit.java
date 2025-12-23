package fruit;

public class Fruit {
	protected String name;
	protected int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("과일 이름: " + name);
		System.out.println("가격: " + price + "원");
	}
	
	public void taste() {
		System.out.println("과일 맛은 기본 맛입니다.");
	}

}
