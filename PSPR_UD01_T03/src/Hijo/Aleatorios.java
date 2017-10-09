package Hijo;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorios {

	public static int generateRandomNumber(int min, int max) {
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}

	public static void main(String[] args) throws IOException {
		generateRandomNumber(0, 10);
	}
}
