public class Imovel implements Seguravel{
    private String endereco;
    private double valor;
    public Imovel (String end, double valor){
        endereco = end;
        this.valor = valor;
    }
    public String getEndereco(){
        return endereco;
    }
    public double getValor(){
        return valor;
    }
    public double valorSeguro(){
        return valor/50.0;
    }
    public String toString(){
        return String.format("Endereco: %s, valor: %f\n", endereco, valor);
    }
}
