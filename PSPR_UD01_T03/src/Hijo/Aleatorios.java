package Hijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aleatorios {

	public static void main(String[] args) throws IOException {
		int randomNum;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String st = null;
		st = in.readLine();
		while (!st.equals("")) {
			randomNum = (int) Math.floor(Math.random() * (10 - 0 + 1) + (0));
			System.out.println(randomNum);
			st = in.readLine();
		}
	}
}
