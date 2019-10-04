package principal;

public class Processo {
	
	int id; // ID do processo
	int pr; // Prioridade
	int at; // Tempo de Chegada
	int bt; // Bash Time
	int ct; // Tempo de Conclusão
	int tat; // Tempo de Resposta
	int wt; // Tempo de Espera
	
	public Processo(int id, int pr, int at, int bt, int ct, int tat, int wt) {
		this.id = id;
		this.pr = pr;
		this.at = at;
		this.bt = bt;
		this.ct = ct;
		this.tat = tat;
		this.wt = wt;
	}
	
	
}
