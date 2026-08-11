public abstract class Complemento extends Lanche{
	private Lanche lanche;
	
	public Complemento(String desc, Lanche l, double custoCompl) {
		super(desc, l.getCusto() + custoCompl);
		lanche = l;
	}
	
	public Lanche getLanche(){
		return lanche;
	}
}