public class Automovel implements Seguravel{
    private String modelo;
    private double valorFIPE;
    private int anoF;
    public Automovel (String mod, double valor, int ano){
        modelo = mod;
        valorFIPE = valor;
        anoF = ano;
    }
    public String getModelo(){
        return modelo;
    }
    public double getValorFIPE(){
        return valorFIPE;
    }
    public int getAnoF(){
        return anoF;
    }
    public double valorSeguro(){
        return valorFIPE/30.0;
    }
    public String toString(){
        return String.format("%s, valor: %f e ano: %d\n", modelo, valorFIPE, anoF);
    }
}
