package basketball;

public class Ball {

	public static void main(String[] args) {
		int ball = 45;

		int boxMax = 5;

		int box;

		if (ball % boxMax == 0) {

			box = ball / boxMax;

		} else {

			box = ball / boxMax + 1;

		}

		System.out.println("농구공 " + ball + "개");

		System.out.println("필요 상자 : " + box);
	}
}
