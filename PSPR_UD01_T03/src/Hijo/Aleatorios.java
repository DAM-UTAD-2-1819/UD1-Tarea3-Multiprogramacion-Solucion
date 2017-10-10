package Hijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorios {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String st = in.readLine();
		
		while (!st.equals("")) {
			System.out.println(ThreadLocalRandom.current().nextInt(0, 10 + 1));
			st = in.readLine();
		}
	}
}
