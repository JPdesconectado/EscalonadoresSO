package principal;

import java.util.ArrayList;

public class Lista {
	
	int quantum;
	
	ArrayList<Processo> FCFSList;
	ArrayList<Processo> SJFList;
	ArrayList<Processo> RRList;
	
	static void nFilas(String n) {
		
		
	}
	
	void Algoritmo(String tipo, int quantumRR) {
		
		if (tipo.equals("FCFS")) {
			Processo at;
			for (int i = 0; i < FCFSList.size(); i++) {
				at = FCFSList.get(i);
			}
			
			// Criar esse algoritmo aqui
			
			
		}
		
		if (tipo.equals("SJF")) {
			// Criar esse outro algoritmo aqui
			
		}
		
		if (tipo.equals("RR")) {
			quantum = quantumRR;
			
			
			
		}
		
		
	}
}
