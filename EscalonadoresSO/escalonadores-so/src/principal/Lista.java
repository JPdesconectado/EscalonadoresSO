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
		int at = Integer.parseInt(in[2]);
		int bt = Integer.parseInt(in[3]);
		int tat = 0;
		int wt = 0;
		int ct = 0;
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
			System.out.println("FCFS");
			FCFS();
		}
		
		if (tipo.equals("SJF")) {
			System.out.println("SJF");
			SJF();
		}
		
		if (tipo.equals("RR")) {
			quantum = quantumRR;
			System.out.println("RR: " + quantum);
			RR(quantum);
			
			
		}
		
	}
	
	public static void imprimirLista() {
		for (int i = 0; i < ReadyList.size(); i++) {
			System.out.println(ReadyList.get(i));
		}
	}
	
	public static void FCFS() {
		for (int i = 0; i < ReadyList.size(); i++) {
			int primeiro = ReadyList.get(i).at;
			ArrayList<Integer> FCFS = new ArrayList<Integer>();
			FCFS.add(primeiro);
		}
		
	}
	
	public static void SJF() {
		for (int i = 0; i < ReadyList.size(); i++) {
			int menor = ReadyList.get(i).bt;
			ArrayList<Integer> SJF = new ArrayList<Integer>();
			SJF.add(menor);
		}
	}
	
	public static void RR(int quantum) {
		for (int i = 0; i < ReadyList.size(); i++) {
			int bt = ReadyList.get(i).bt;
			ArrayList<Integer> RR = new ArrayList<Integer>();
			RR.add(bt);
		}
	}
	
}
