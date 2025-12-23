package fruit;

public class Banana extends Fruit{
	
	public Banana(int price) {
		super("바나나", price);//부모생성자 호출
	}
	
	@Override
	public void taste() {
		System.out.println("바나나는 달콤한 맛입니다.");
	}

}
