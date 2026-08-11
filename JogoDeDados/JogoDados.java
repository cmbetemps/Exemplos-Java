package jogo.dados;

import java.util.ArrayList;



public class JogoDados{

	//private enum Resultado{ GANHOU, PERDEU};

	private Dado[] dados = new Dado[2];
	private Jogador jogador;
	private Resultado resultado = Resultado.PERDEU;
	private static ArrayList<String> resultados = new ArrayList<String>();
	
	public JogoDados(Jogador jogador, Dado dado1, Dado dado2){
		dados[0] = dado1;
		dados[1] = dado2;
		this.jogador = jogador;
	}

  public String toString(){
    StringBuilder ret = new StringBuilder("");
    ret.append("Jogador: "); 
    ret.append(this.jogador.getNome());
    ret.append(", ");
    ret.append(resultado);
    ret.append("!");
    ret.append(" Dado1: ");
    //ret.append(dados[0].getValorFace());
		ret.append(dados[0]);
    ret.append(". Dado2: ");
    //ret.append(dados[1].getValorFace());
		ret.append(dados[1]);
    ret.append(". Soma: ");
    ret.append(dados[0].getValorFace() + dados[1].getValorFace());
    ret.append(".\n");
    return ret.toString();
  }
	
	public Resultado jogar(){
		String res = "";
		dados[0].rolar();
		dados[1].rolar();
		
		if ((dados[0].getValorFace() + 
			 dados[1].getValorFace()) == 7) {
			resultado = Resultado.GANHOU;
		}
		else{
			resultado = Resultado.PERDEU;
		}
		
		res = "Jogador: " + this.jogador.getNome() + 
			", " + resultado + "!" + 
			" Dado1: " + dados[0] + 
			". Dado2: " + dados[1] + 
			". Soma: " + (dados[0].getValorFace() + dados[1].getValorFace()) +
			".\n";
		
		//chama operacao para gravar resultado 
		// no atributo de classe (na forma de uma String)
		JogoDados.gravarResultado(res);
		return resultado;
	}
	
	public static void gravarResultado(String resultado){
		resultados.add(resultado);
	}
	
		
	public static String retornarResultados(){
		String retorno = "";
		for (String res : resultados) {
            retorno = retorno + res;
        }
		return retorno;
	}
	
	
	public static void main(String[] args){
		Dado d1, d2;
		Jogador jog;
		JogoDados jd;
		
		d1 = new Dado();
		d2 = new Dado();
		jog = new Jogador();
		jd = new JogoDados(jog, d1, d2);
		System.out.println(jd.jogar());
		System.out.println(jd.jogar());
		System.out.println(jd.jogar());
		
		jog = new Jogador("Betemps");
		jd = new JogoDados(jog, d1, d2);
		System.out.println(jd.jogar());
		System.out.println(jd.jogar());
		
		System.out.println(JogoDados.retornarResultados());
	}
}
