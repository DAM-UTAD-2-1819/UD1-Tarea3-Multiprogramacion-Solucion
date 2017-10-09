package Hijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mayusculas {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st = bf.readLine();
		String mayus = st.toUpperCase();
		System.out.println(mayus);
	}
}
