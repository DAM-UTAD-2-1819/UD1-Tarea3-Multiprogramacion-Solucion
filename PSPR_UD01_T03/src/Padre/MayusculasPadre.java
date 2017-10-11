package Padre;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MayusculasPadre {
	//falta por hacer
		public static void main(String[] args) throws IOException {
			ProcessBuilder pb = new ProcessBuilder("java", "-jar", "./lib/Mayusculas.jar");
			Process pc = pb.start();

			BufferedReader brPadre = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader brHijo = new BufferedReader(new InputStreamReader(pc.getInputStream()));

			PrintWriter pwHijo = new PrintWriter(pc.getOutputStream());
			
			String stPadre = brPadre.readLine();
			
			while (!stPadre.equals("fin")) {
				pwHijo.println(stPadre);
				pwHijo.flush();
				String st2 = brHijo.readLine();
				System.out.println(st2);
				stPadre = brPadre.readLine();
			}
		}
	
}
