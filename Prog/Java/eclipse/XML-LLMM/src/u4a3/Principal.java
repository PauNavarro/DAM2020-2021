package u4a3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Principal {

	public static void main(String[] args) {

		// dirección url del recurso a descargar
		String url = "http://mapas.valencia.es/lanzadera/opendata/Tra-estado-trafico/JSON?srsName=EPSG%3A4326";

		// nombre del archivo destino
		String name = "traficoTmp.json";

		// Directorio destino para las descargas
		String folder = "descargas/";

		// Crea el directorio de destino en caso de que no exista
		File dir = new File(folder);

		if (!dir.exists())
			if (!dir.mkdir())
				return; // no se pudo crear la carpeta de destino

		File file = new File(folder + name);

		try {
			URLConnection conn = new URL(url).openConnection();
			conn.connect();
			System.out.println("\nempezando descarga: \n");
			System.out.println(">> URL: " + url);
			System.out.println(">> Nombre del archivo descargado: " + name);

			InputStream in = conn.getInputStream();
			OutputStream out = new FileOutputStream(file);

			int b = 0;
			while (b != -1) {
				b = in.read();
				if (b != -1)
					out.write(b);
			}

			out.close();
			in.close();
			
			System.out.println("\n Mostrando datos de trafico: \n");
			
			extraerDatos.extraerDatos();

		} catch (MalformedURLException e) {
			System.out.println("la url: " + url + " no es valida!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
