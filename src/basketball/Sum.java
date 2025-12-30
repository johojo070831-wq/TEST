package basketball;

public class Sum {

	public static void main(String[] args) {
		int total = 0;
		int sum =0;
		for (int a = 1; a <= 10; a++) {
			sum += a;
			total += sum;
		}
		System.out.println(total);
	}
}
