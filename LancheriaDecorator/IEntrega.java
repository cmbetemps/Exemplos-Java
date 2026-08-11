import java.util.List;

public interface IEntrega{

  double custoEntrega = 10.0; // final, static
  public String gerarNotaEntrega(String end, String nome,List<Lanche> pedido);
}