package jogo.dados;

import java.util.Scanner;
import jogo.dados.Resultado;
import jogo.dados.Dado;
import jogo.dados.Jogador;
import jogo.dados.JogoDados;
public class JogoDadosAPP{

	public static void main(String[] args){
		Dado d1, d2;
		Jogador jog;
		JogoDados jd;
		d1 = new Dado();
		d2 = new Dado();
		jog = new Jogador();
		jd = new JogoDados(jog, d1, d2);
		
		Scanner input = new Scanner(System.in);
		Scanner inputName = new Scanner(System.in);
		int opcao;
		do{
			System.out.println("Menu:");
			System.out.println("(1): Novo Jogo");
			System.out.println("(2): Novo Jogador");
			System.out.println("(3): Resultados anteriores");
			System.out.println("(0): Sair");
			opcao = input.nextInt();
			switch (opcao){
				case 1:
					System.out.println(jd.jogar() + " - " + jd);
					break;
				case 2:
					System.out.println("Digite o nome do Jogador");
					String nome = inputName.nextLine();
					jog = new Jogador(nome);
					jd = new JogoDados(jog, d1, d2);
					break;
				case 3:
					System.out.println("Resultados anteriores:");
					System.out.println(JogoDados.retornarResultados());
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
