package Padre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AleatoriosPadre {
	public static void main(String[] args) {
		try {
			ProcessBuilder pb = new ProcessBuilder("java", "-jar", "Hijo/HijoAleatorio.jar");
			Process pc = pb.start();

			BufferedReader brPadre = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader brHijo = new BufferedReader(new InputStreamReader(pc.getInputStream()));

			PrintWriter pwHijo = new PrintWriter(pc.getOutputStream());

			String stPadre = brPadre.readLine();

			while (!stPadre.equals("fin")) {
				pwHijo.println(stPadre);
				pwHijo.flush();
				System.out.println(brHijo.readLine());
				stPadre = brPadre.readLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
