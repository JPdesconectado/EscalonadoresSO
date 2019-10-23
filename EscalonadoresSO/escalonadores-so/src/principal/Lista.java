package principal;

public class Lista {
	
	static int quantum;
	static int filas;
	static int processos;
	static int FCFS;
	static int SJF;
	static int RR;
	static int prioridade;
	
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
		int ct = 0;
		int tat = 0;
		int wt = 0;
		Processo p = new Processo(id, pr, at, bt, ct, tat, wt);
		Escalonador.WaitingList.add(p);
		tat++;
		System.out.println(linha);
		}else {
			System.out.println("");
		}
		
		
			
	}
		
	
	static void Filas(String tipo, int quantumRR) {
		
		if (tipo.equals("FCFS")) {
			System.out.println("FCFS");
			FCFS = prioridade;
			prioridade++;
			System.out.println(FCFS);
		}
		
		if (tipo.equals("SJF")) {
			System.out.println("SJF");
			SJF = prioridade;
			prioridade++;
			System.out.println(SJF);
		}
		
		if (tipo.equals("RR")) {
			quantum = quantumRR;
			System.out.println("RR: " + quantum);
			RR = prioridade;
			prioridade++;
			System.out.println(RR);
			
		}
		
	}
	
	public static void FCFS(Processo p) {
		
	}
	
	public static void SJF(Processo p) {
	}
	
	public static void RR(Processo p, int quantum) {
	}
	
}
