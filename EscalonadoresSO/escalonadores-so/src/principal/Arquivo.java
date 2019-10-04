package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import principal.Lista;

public class Arquivo {

	public static void main(String[] args) {
	try {
		FileReader arq = new FileReader("C:\\Users/Informatica/Documents/GitHub/EscalonadoresSO/EscalonadoresSO/txtsAqui/teste.txt");
		BufferedReader lerArq = new BufferedReader(arq);
		
		String line = lerArq.readLine();
		int i = 0;
		int j = Lista.FilasEProcessos(line);

		while (i < j) {
			line = lerArq.readLine();
			i++;
	}
		
		while (line != null && i == j) {
			System.out.println(line);
			line = lerArq.readLine();
			
			
			Lista.adicionarLista(line);
		}
		
		arq.close();
		
	} catch (IOException e) {
		System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	}
	
	Lista.imprimirLista();
}
}
