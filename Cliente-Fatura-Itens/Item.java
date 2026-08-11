public class Item{
  private String codProd;
  private String descrição;
  private int quantidade;
  private double preço;

  public Item(String codProd, String descrição, int quantidade, double preço){
    this.codProd = codProd;
    this.descrição = descrição;
    this.quantidade = quantidade;
    this.preço = preço;
  }
  public double valorTotal(){
    return quantidade * preço;
  }

  public String toString(){
    return String.format("%6s | %17s |%3d | R$%7.2f | R$%8.2f", codProd,descrição,quantidade, preço, this.valorTotal());
  }
}
