package Padre;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Mayusculas {
	//falta por hacer
		public static void main(String[] args) {
			try {
				ProcessBuilder hijo = new ProcessBuilder("java", "-jar", "Hijo/Mayusculas.jar");
				Process p =  hijo.start();
				
				BufferedReader brPadre = new BufferedReader(new InputStreamReader(System.in));
				BufferedReader brHijo = new BufferedReader(new InputStreamReader(p.getInputStream()));
				//String string = new OutPutStr
				
				PrintWriter pwHijo = new PrintWriter(p.getOutputStream());

				String stPadre = brPadre.readLine();
				
			} catch (Exception e) {
				
			}

		}
	

}
