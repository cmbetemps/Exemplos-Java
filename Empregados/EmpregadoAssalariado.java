public class EmpregadoAssalariado extends Empregado{
  private double salarioAnual;
  
  public EmpregadoAssalariado(String nome, double salAnual){
    setNome(nome);
    salarioAnual=salAnual;
  }

  public double pagamentoSemanal(int horasTrabalhadas){
    final int SemanasPorAno = 52;
    return salarioAnual/SemanasPorAno;
  }

  public String toString(){
    return String.format("Funcionário: %s\nSalário Anual: R$%.2f", getNome(), this.salarioAnual);
  }
}
