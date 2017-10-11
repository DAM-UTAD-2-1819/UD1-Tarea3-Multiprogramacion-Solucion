package Hijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mayusculas {

	public static void main(String[] args) throws IOException {
		InputStreamReader in= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try{
			System.out.print(br.readLine().toUpperCase());
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
