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
		j = j *2;
		int h = 1;
		int quantum = 0;
		String s;
		while (i < j) {
			line = lerArq.readLine();
			String[]in = line.split(" ");
			if (in.length == 1) {
				s = in[0];
			}else {
				s = in[0];
				quantum = Integer.parseInt(in[1]);
			}
			
			
			Lista.Algoritmo(s, quantum);
			i++;
	}
		

		
		while (h == 1) {
			
			line = lerArq.readLine();
			if(line != null) {
			Lista.adicionarLista(line);
			}else {
				h = 0;
			}
		}
		
		arq.close();
		Lista.FCFS();
	} catch (IOException e) {
		System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	}
	
	//Lista.imprimirLista();
}
}
