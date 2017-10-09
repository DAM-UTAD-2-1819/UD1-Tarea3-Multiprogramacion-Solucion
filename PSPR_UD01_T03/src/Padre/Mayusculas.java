package Padre;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Mayusculas {
	
		public static void main(String[] args) {
			try {
				Process hijo = new ProcessBuilder("java", "-jar", "Hijo/Mayusculas.jar").start();
				BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
				
				String a = br.readLine();
				
			} catch (Exception e) {
				
			}

		}
	

}
