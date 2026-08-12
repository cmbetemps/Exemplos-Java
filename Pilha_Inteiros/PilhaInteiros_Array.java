public class PilhaInteiros_Array implements PilhaInteiros{

	static int MAX = 100;
	private int topo;
	private int pilha[];

	public PilhaInteiros_Array(){
		topo = 0;
		pilha = new int[MAX];
	}

	public void empilha(int n){ //empilha elementos na pilha
		if (topo < MAX-1){
			pilha[topo++] = n;
		}
	}

	public void desempilha(){ // desempilha o elemento de uma pilha
		if (topo > 0) topo--;
	}

	public boolean vazia(){ // verifica se a pilha está vazia
		return (topo == 0);
	}

	public int consulta(){ // obtém o elemento do topo da pilha, sem desempilhá-lo.
		if (vazia()) return -1;
		else return pilha[topo-1];
	}


	public static void main (String args[]){
		PilhaInteiros_Array pi = new PilhaInteiros_Array();


		System.out.println("\n\nVariável de PilhaInteiros_Array mantendo um objeto de PihaInteiros_Array.\n\nVazia? " + pi.vazia());

		System.out.println("Empilhando 15");
		pi.empilha(15);
		System.out.println("Empilhando 8");
		pi.empilha(8);
		System.out.println("Empilhando 19");
		pi.empilha(19);
		System.out.println("Empilhando 11");
		pi.empilha(11);

		System.out.println("Consultando: " + pi.consulta());
		System.out.println("Desempilhando");
		pi.desempilha();

		System.out.println("Consultando: " + pi.consulta());
		System.out.println("Desempilhando");
		pi.desempilha();

		System.out.println("Consultando: " + pi.consulta());
		System.out.println("Desempilhando");
		pi.desempilha();


		System.out.println("Consultando: " + pi.consulta());
		System.out.println("Desempilhando");
		pi.desempilha();

		if (!pi.vazia()) System.out.println("Consultando: " + pi.consulta());
		else System.out.println("Pilha Vazia");

		PilhaInteiros ii = new PilhaInteiros_Array();

		System.out.println("\n\nVariável de PilhaInteiros (uma interface) mantendo um objeto de PihaInteiros_Array.\n\nVazia? " + ii.vazia());

		System.out.println("Empilhando 15");
		ii.empilha(15);
		System.out.println("Empilhando 8");
		ii.empilha(8);
		System.out.println("Empilhando 19");
		ii.empilha(19);
		System.out.println("Empilhando 11");
		ii.empilha(11);

		System.out.println("Consultando: " + ii.consulta());
		System.out.println("Desempilhando");
		ii.desempilha();

		System.out.println("Consultando: " + ii.consulta());
		System.out.println("Desempilhando");
		ii.desempilha();

		System.out.println("Consultando: " + ii.consulta());
		System.out.println("Desempilhando");
		ii.desempilha();

		System.out.println("Consultando: " + ii.consulta());
		System.out.println("Desempilhando");
		ii.desempilha();

		if (!ii.vazia()) System.out.println("Consultando: " + ii.consulta());
		else System.out.println("Pilha Vazia");
	}
}
