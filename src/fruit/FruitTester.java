package fruit;

public class FruitTester {

	public static void main(String[] args) {
		Fruit banana = new Banana(1500);
		Fruit apple = new Apple(2000);
		
		banana.info();
		banana.taste();
		
		System.out.println();
		
		apple.info();
		apple.taste();
	}
}
