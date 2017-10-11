package Hijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Mayusculas {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String st = in.readLine();
		
		while (!st.equals("")) {
			String mayus = st.toUpperCase();
			System.out.println(mayus);
			st = in.readLine();
		}
	}
}
