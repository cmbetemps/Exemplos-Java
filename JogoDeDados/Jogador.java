package jogo.dados;

public class Jogador{
    private String nome;

    public Jogador(String nome){
        this.nome = nome; 
        /*
        this foi usado para contornar o 
        sombreamento do argumento 'nome'
        */
    }

    public Jogador(){
        this("Sem Nome");
        /*
        this usado para chamar o construtor 
        com argumento
        */
    }

    public String getNome(){
        return nome;
    }

  public static void main (String[] args){
    Jogador j = new Jogador("Fulano");
    //j.nome = "Fulano";
    System.out.println(j.getNome());
  }
}
