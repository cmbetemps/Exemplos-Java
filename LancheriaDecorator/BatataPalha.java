public class BatataPalha extends Complemento{
	public static double custo = 1.60;
	
	public BatataPalha(Lanche l) {
		super(l.getDescricao() + ", com Batata Palha", l, BatataPalha.custo);
	}
}