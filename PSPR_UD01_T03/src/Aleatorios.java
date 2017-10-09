import java.util.concurrent.ThreadLocalRandom;

public class Aleatorios {

	public static int generateRandomNumber(int min, int max) {
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}

	public static void main(String[] args) {
		generateRandomNumber(2, 4);
		System.out.println(generateRandomNumber(0, 10));
	}
}
