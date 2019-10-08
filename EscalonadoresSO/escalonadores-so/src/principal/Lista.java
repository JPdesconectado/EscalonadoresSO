package principal;

import java.util.ArrayList;

public class Lista {
	
	static int quantum;
	static int filas;
	static int processos;
	
	static ArrayList<Processo> ReadyList = new ArrayList<Processo>();
	
	static int FilasEProcessos(String linha) {
		String[]in = linha.split(" ");
		filas = Integer.parseInt(in[0]);
		processos = Integer.parseInt(in[1]);
		return filas;
		
	}
	
	static void adicionarLista(String linha) {
				
		if(!linha.isBlank()) {
		String[]in = linha.split(" ");
		int id = Integer.parseInt(in[0]);
		int pr= Integer.parseInt(in[1]);
		int bt = Integer.parseInt(in[2]);
		int ct = Integer.parseInt(in[3]);
		int tat = 0;
		int wt = 0;
		int at = 0;
		Processo p = new Processo(id, pr, at, bt, ct, tat, wt);
		ReadyList.add(p);
		tat++;
		System.out.println(linha);
		}else {
			System.out.println("Linha Vazia");
		}
		
		
			
	}
		
	
	static void Algoritmo(String tipo, int quantumRR) {
		
		if (tipo.equals("FCFS")) {
			System.out.println("FCFSSSSSS");
			
			// Criar esse algoritmo aqui
			
			
		}
		
		if (tipo.equals("SJF")) {
			System.out.println("FJGSJSJHSW");
			
		}
		
		if (tipo.equals("RR")) {
			quantum = quantumRR;
			System.out.println("Linha VADAEWR"+ quantum);
			
			
		}
		
	}
	
	public static void imprimirLista() {
		for (int i = 0; i < ReadyList.size(); i++) {
			System.out.println(ReadyList.get(i));
		}
	}
	
	
}
