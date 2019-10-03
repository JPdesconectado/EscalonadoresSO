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
		
		String linha = lerArq.readLine();
		Lista.nFilas(linha);
		
		while (linha != null) {
			System.out.println(linha);
			linha = lerArq.readLine();
		}
		
		arq.close();
		
	} catch (IOException e) {
		System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	}
	
	System.out.println();
}
}
