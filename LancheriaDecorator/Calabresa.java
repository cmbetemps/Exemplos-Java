public class Calabresa extends Complemento{
	public static double custo = 7.10;
	
	public Calabresa(Lanche l) {
		super(l.getDescricao() + ", com Calabresa", l, Calabresa.custo);
	}

}