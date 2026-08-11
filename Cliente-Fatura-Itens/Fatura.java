import java.util.Vector;
public class Fatura{
  private Cliente cliente;
  private Vector<Item> itens;

  public Fatura(Cliente cliente){
    this.cliente = cliente;
    this.itens = new Vector<Item>();
  }
  public void adicionaItem(Item i){
    this.itens.add(i);
  }
  public double valorTotal(){
    double total=0.0;
    for(Item i: itens){
      total = total + i.valorTotal();
    }
    return total;
  } 
  public String toString(){
    String fatura = "";
    fatura = fatura + cliente + "\n";
    fatura = fatura + "Itens da Fatura" + "\n";
    fatura = fatura + "Código | Descrição Produto |  # |   Preço   | Total " + "\n";
    fatura = fatura + "--------------------------------------------------------" + "\n";
    for(Item i: itens){
      fatura = fatura + i + "\n";
    }
    fatura = fatura + "--------------------------------------------------------" + "\n";
    String total = String.format("%45s R$%8.2f", "Total da Fatura", this.valorTotal());
    fatura = fatura + total + "\n";
    return fatura;
  }

  public static void main(String args[]){
    Cliente c = new Cliente("Ciclano da Silva","000.000.001-01");
    Item i1 = new Item("001","Feijão Kg",3,7.00);
    Item i2 = new Item("002","Arroz 5kg",1,18.00);
    Item i3 = new Item("003","Ovo dúzia",4,6.00);
    Fatura f = new Fatura(c);
    f.adicionaItem(i1);
    f.adicionaItem(i2);
    f.adicionaItem(i3);
    System.out.println(f);
  }
 
}
