/************************
Considerando que deseja-se automatizar uma lancheria de nossa cidade,
a empresa SOFTPAMPA foi contatada para desenvolver uma aplicação
que permite registrar os pedidos de lanches, tanto para consumo local
como também para envio via serviço de entrega (no caso de entrega, 
deve ser adicionado o valor da entrega).
Os lanches disponíveis são Bauru e Cachorro Quente, cada um com seus 
ingredientes básicos definidos.
Podem ser adicionados complementos (Ovo, Batata Palha e Calabresa) nos 
lanches, nas mais variadas combinações (por exemplo, adicionar dose 
dupla de batata palha e uma porção de calabresa). O sistema deve gerir 
os preços dos lanches, fazendo o devido cálculo do valor do lanche 
dado o pedido customizado do cliente.
*************************/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
public class Main{
	private static int menu_Complemento(){
		Scanner input = new Scanner(System.in);
		int op_c;
		do {
			System.out.println("Digite o complemento correspondente:");
			System.out.println("(1): Ovo");
			System.out.println("(2): Batata Palha");
			System.out.println("(3): Calabresa");
			op_c = input.nextInt();
		}while((op_c != 1) && (op_c != 2) && (op_c != 3) );
		return op_c;	
	}

	public static void main(String[] args){
		Lanche lanche=null;
    ArrayList<Lanche> pedido = null; // = new LinkedList<Lanche>();
		LinkedList<Lanche> lanches_L = new LinkedList<Lanche>();
				
		Scanner input = new Scanner(System.in);
		//Scanner inputName = new Scanner(System.in);
		int opcao, op_c,ent;
    String nome, end;
		do{
			System.out.println("______________________________");
			System.out.print("Lanches:      ");
			System.out.printf("Bauru: R$ %.2f, ", Bauru.custo);
			System.out.printf("Cachorro Quente: R$ %.2f\n", CachorroQuente.custo);
			System.out.print("Complementos: ");
			System.out.printf("Ovo: R$ %.2f, ", Ovo.custo);
			System.out.printf("Batata Palha: R$ %.2f, ", BatataPalha.custo);			
			System.out.printf("Calabresa: R$ %.2f\n", Calabresa.custo);			
			System.out.println("______________________________");
			System.out.println("Menu:");
			System.out.println("(1): Bauru");
			System.out.println("(2): Cachorro Quente");
			System.out.println("(3): Complemento?");
      System.out.println("(4): Novo Lanche no Pedido?");
			System.out.println("(5): Fechar Pedido");
			System.out.println("(6): Listar Lanches vendidos");
			System.out.println("(0): Sair");
			System.out.print("Alternativa? ");
			opcao = input.nextInt();
			switch (opcao){
				case 1:
					lanche = new Bauru();
					System.out.println("Bauru Selecionado!");
					System.out.printf("\n%s\n", lanche);
					break;
				case 2:
					lanche = new CachorroQuente();
					System.out.println("Cachorro Quente selecionado");
					break;
				case 3:
					if (lanche != null) {
						op_c = menu_Complemento();
						switch (op_c) {
							case 1:
								lanche = new Ovo(lanche);
								break;
							case 2:
								lanche = new BatataPalha(lanche);
								break;
							case 3:
								lanche = new Calabresa(lanche);
								break;
						}
					}
					else{
						System.out.println("Primeiro defina o Lanche!");
					}
					break;
        case 4:
          if ((lanche == null) && (pedido == null)){
            System.out.println("Primeiro defina o Lanche!");
            break;
          }
					if (lanche != null) {
            if (pedido == null) pedido = new ArrayList<Lanche>();
						pedido.add(lanche);
						lanche=null;
					}
					else{
            if (pedido == null) {
              System.out.println("Primeiro defina o Lanche!");
              break;
            }
            System.out.println("Pedido de Lanche(s) em andamento!");
					}
					break;
				case 5:
          if ((lanche == null) && (pedido == null)){
            System.out.println("Primeiro defina o Lanche!");
            break;
          }
          if (pedido == null) pedido = new ArrayList<Lanche>();
					if (lanche != null){
            pedido.add(lanche);
            double custoTotal=0.0;
            System.out.println("Fechando Pedido:");
            for(Lanche l: pedido){
              System.out.printf("\t%s: R$ %7.2f\n", l.getDescricao(), l.getCusto());
              custoTotal+=l.getCusto();
              lanches_L.add(l);
            }
            System.out.printf("Custo dos Lanches: R$ %.2f\n", custoTotal);
            System.out.print("Lanche para Entregar? [Sim(1), Não(0)]: ");
            ent = input.nextInt();
            input.nextLine(); //"limpando" o buffer de input
            if (ent == 1){
              System.out.print("Endereço? ");
              end = input.nextLine();
              System.out.print("Cliente ? ");
              nome = input.nextLine();
              System.out.println(lanche.gerarNotaEntrega(end, nome, pedido));
            }

						lanche = null;
            pedido = null;
					}
					break;

				case 6:
					System.out.printf("\nLanches vendidos\n");
					int i = 1;
          double total=0.0;
					Iterator<Lanche> iter = lanches_L.iterator();
					while(iter.hasNext()) {
						Lanche l = iter.next();				
						System.out.printf("[%d]: %s. Valor R$ %.2f\n", i++, l.getDescricao(), l.getCusto());
            total+=l.getCusto();
					}
          System.out.printf("\nTotal de vendas: R$ %.2f\n", total);
					break;	
					
				case 0:
				
					break;
				default:
					System.out.println("Opcao Invalida");
					break;
			}
		}while(opcao != 0);	
	}
}

