package u4a3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class extraerDatos {

	public static void extraerDatos(){
		String filePath = "descargas/traficoTmp.json";

		String FLUIDO = "[0]";
		String DENSO = "[1]";
		String CONGEST = "[2]";
		String CORTADO = "[3]";
		
		int cntFluido = 0;
		int cntDenso = 0;
		int cntCongest = 0;
		int cntCort = 0;

		try {
			
			
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			StringBuilder stringBuilder = new StringBuilder();
			String line = null;
			String ls = System.getProperty("line.separator");
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
			// delete the last new line separator
			stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			reader.close();
			String content = stringBuilder.toString();

			String[] separado = content.split(" ");
			ArrayList<Character> lista = new ArrayList<>();

			for (int i = 0; i < separado.length; i++) {

				if (separado[i].indexOf("estado") == 1) {

					char[] chararr = separado[i + 1].toCharArray();

					for (int j = 0; j < chararr.length; j++) {
						if (Character.isDigit(chararr[j])) {
							lista.add(chararr[j]);
						}
					}

				}

			}

			for (int i = 0; i < lista.size(); i++) {

				if (lista.get(i) == FLUIDO.toCharArray()[1]) {
					cntFluido++;
				}

				if (lista.get(i) == DENSO.toCharArray()[1]) {
					cntDenso++;
				}

				if (lista.get(i) == CONGEST.toCharArray()[1] ) {
					cntCongest++;
				}

				if (lista.get(i) == CORTADO.toCharArray()[1]) {
					cntCort++;
				}
			}

			
			System.out.println("Calles con trafico fluido               ==> " + cntFluido);
			System.out.println("Calles con trafico denso                ==> " + cntDenso);
			System.out.println("Calles con trafico congestionado        ==> " + cntCongest);
			System.out.println("Calles con trafico cortado              ==> " + cntCort);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
