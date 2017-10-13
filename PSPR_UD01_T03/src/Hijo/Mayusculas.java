package Hijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Mayusculas {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		String st = br.readLine();

		while (!st.equals("")) {
			System.out.println(st.toUpperCase());
			st = br.readLine();
		}
	}
}
