public class Pessoa implements Comparable<Pessoa>{

	String nome;

	public Pessoa () {
		this("Desconhecido");
	}
	public Pessoa(String nome){
		this.nome = nome;
	}

	public int compareTo(Pessoa o){
		return nome.compareTo(o.getNome());
	}

	public String getNome(){
		return this.nome;
	}

	public String toString(){
		return this.getNome();
	}
}
