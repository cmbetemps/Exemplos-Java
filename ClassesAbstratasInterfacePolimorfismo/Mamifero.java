public abstract class Mamifero{ // Classe Abstrata
  private String nome;
  protected int peso;

  public Mamifero(String n, int p){
    nome=n;
    peso=p;
  }
  public String qualNome(){
    return nome;
  }
  public int qualPeso(){
    return peso;
  }
  public void atribuiPeso(int novoPeso){
    peso=novoPeso;
  }
  public abstract String comunicar();

  public String toString(){
    return super.toString() + ": " + this.nome;
  }
}
