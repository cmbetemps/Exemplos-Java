public class Ovo extends Complemento{
	public static double custo = 1.10;
	
	public Ovo(Lanche l) {
		super(l.getDescricao() + ", com Ovo", l, Ovo.custo);
	}
}