import java.util.Scanner;
import java.util.Vector;

public class Main {
  static int Menu(){
    int op;
    Scanner input = new Scanner(System.in);
    System.out.println("Menu:\n1) Criar Ser Humano;");
    System.out.println("2) Criar Cão;");
    System.out.println("3) Criar Gato;");
    System.out.println("4) Comunicar com todos;");
    System.out.println("0) Sair.");
    return input.nextInt();
  }

  public static void main(String[] args) {
    Vector<Mamifero> mamiferos = new Vector<Mamifero>(20); 
    Scanner input = new Scanner(System.in);
    int op = 5;
    int peso;
    String nome;
    Cao c;
    do{
      op = Menu();
      switch (op){
        case 1:
          System.out.println("Nome?");
          nome = input.next();
          System.out.println("Peso?");
          peso = input.nextInt();
          mamiferos.add(new SerHumano(nome,peso));
          break;
        case 2:
          System.out.println("Nome?");
          nome = input.next();
          System.out.println("Peso?");
          peso = input.nextInt();
          mamiferos.add(new Cao(nome,peso));
          break;
        case 3:
          System.out.println("Nome?");
          nome = input.next();
          System.out.println("Peso?");
          peso = input.nextInt();
          mamiferos.add(new Gato(nome,peso));
          break;
        case 4:
          System.out.println("Mamiferos se comunicando:");
          for(Mamifero m:mamiferos){ // Processamento polimórfico 
            System.out.print("Classe: " + m.getClass().getName()+". "); // obtendo o objeto da classe "Class", após o nome da mesma
            System.out.print(m.qualNome()+": ");
            System.out.print(m.comunicar()); // polimorfimo: ligação dinâmica dependente do tipo de objeto mantido na variável "m"
            if (m instanceof Cao) { // testando se "m" é uma instância de "Cao"
              c = (Cao)m; // fazendo um downcast;
              System.out.println("(" + c + " --> Melhor amigo.)");
            }
            else {
              System.out.println();
            }

          }
          break;
        case 0:
          break;
        default:
          System.out.println("Opção inválida.");
      }
    }while(op != 0);
  }
}
