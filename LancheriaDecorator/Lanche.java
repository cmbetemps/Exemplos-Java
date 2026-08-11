import java.util.List;

public abstract class Lanche implements IEntrega{
	private String descricao;
	private double custo;
	
	public Lanche (String desc, double c) {
		descricao = desc;
		custo = c;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String desc){
		descricao = desc;
	}

	public double getCusto(){
		return custo;
	}
	
	public void setCusto(double custo){
		this.custo = custo;
	}	
	
	public String toString(){
		//return "\n" + super.toString() + "\n" + getDescricao();
    return getDescricao();
	}

  public String gerarNotaEntrega(String end, String nome,List<Lanche> pedido){
    double custoTotal=0.0;
    String ret =  String.format("\n**********************************\nEndereço   : %s\nSolicitante: %s\n", end, nome);
    for(Lanche l : pedido){
      ret = ret + String.format("%s\nValor Lanche: R$ %8.2f\n", l,l.getCusto());
      custoTotal+=l.getCusto();
    }
    ret = ret + String.format("Entrega     : R$ %8.2f\nCusto total : R$ %8.2f\t<<<<\n**********************************\n",custoEntrega,custoTotal+custoEntrega);
    return ret;
  }
	
}