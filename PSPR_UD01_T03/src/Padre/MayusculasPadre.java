package Padre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MayusculasPadre {
	public static void main(String[] args) throws IOException {
		String x = null;
		while(x != "fin"){
		ProcessBuilder pb = new ProcessBuilder("java", "-jar", "./lib/Mayusculas.jar");
		Process pc = pb.start();

		BufferedReader brPadre = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brHijo = new BufferedReader(new InputStreamReader(pc.getInputStream()));

		PrintWriter pwHijo = new PrintWriter(pc.getOutputStream());

		String stPadre = brPadre.readLine();

		if (!stPadre.equals("fin")) {
			pwHijo.println(stPadre);
			pwHijo.flush();
			System.out.println(brHijo.readLine());
			
		} if (stPadre.equals("fin")) {
			x = "fin";
		}
	}
}
}