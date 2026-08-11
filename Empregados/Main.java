import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    LinkedList<Empregado> funcionarios = new LinkedList<Empregado>();
    funcionarios.add(new EmpregadoHorista("Ninguém, João", 30.0));
    funcionarios.add(new EmpregadoAssalariado("Nor, Juca", 60000.0));
    funcionarios.add(new EmpregadoAssalariado("Ruela, Zé", 50000.0));
    funcionarios.add(new Gerente("VaiComAsOutra, Maria", 120000.0, 300.0));
    funcionarios.add(new EmpregadoHorista("da Tal, Fulano", 35.0));
    Scanner input = new Scanner(System.in);
    for (Empregado e : funcionarios){
      System.out.print("Horas semanis trabalhadas por \"" + e.getNome() + "\" (esperado 40+): ");
      int horas = input.nextInt();
      System.out.println(e);
      System.out.printf("\tSalário semanal: R$ %.2f\n",e.pagamentoSemanal(horas));
    }
  }
}
