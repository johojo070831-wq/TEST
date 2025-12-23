package fruit;

public class Apple extends Fruit{
	public Apple(int price) {
		super("사과", price);
	}
	
	@Override
	public void taste() {
		System.out.println("사과는 상큼한 맛입니다.");
	}

}
