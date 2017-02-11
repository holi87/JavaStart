import java.util.Random;

public class OperacjeNaZmiennychZadanie {

	public static void main(String[] args) {
		int x = new Random().nextInt(100);
		int y = new Random().nextInt(100);
		boolean result;
		result = x > y;
		System.out.println("Czy x > y? " + result);
		result = x * 2 > y;
		System.out.println("Czy 2x > y? " + result);
		result = (y < x + 3) && (y > x - 2);
		System.out.println("czy y < x + 3 oraz y > x - 2? " + result);
		result = (x * y) % 2 == 0;
		System.out.println("Czy x*y jest parzyste? " + result);

	}

}
