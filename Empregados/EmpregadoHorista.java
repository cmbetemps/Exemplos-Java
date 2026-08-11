public class EmpregadoHorista extends Empregado{
  private double salarioPorHora;

  public EmpregadoHorista(String nome, double salHora){
    setNome(nome);
    salarioPorHora=salHora;
  }

  public double pagamentoSemanal(int horasTrabalhadas){
    double sal = horasTrabalhadas * salarioPorHora;
    if (horasTrabalhadas>40){
      sal = sal + ((horasTrabalhadas-40) * salarioPorHora * 0.5);
    }
    return sal;
  }

  public String toString(){
    return String.format("Funcionário: %s\nSalário por Hora: R$%.2f", getNome(), this.salarioPorHora);
  }
}
