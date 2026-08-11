public class Gerente extends EmpregadoAssalariado{
  private double bonusSemanal;
  
  public Gerente(String nome, double salAnual, double bonus){
    super(nome,salAnual);
    bonusSemanal=bonus;
  }

  public double pagamentoSemanal(int horasTrabalhadas){
    return super.pagamentoSemanal(horasTrabalhadas) + bonusSemanal;
  }

  public String toString(){
    return String.format("%s\nBônus Semanal: R$ %.2f", super.toString(), this.bonusSemanal);
  }
}
