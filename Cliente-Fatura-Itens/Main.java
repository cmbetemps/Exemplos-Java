import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Main {
  public static Item recebeItem(Scanner input){
    System.out.print("Item:\nDigite o código do produto: ");
		String cod = input.nextLine();
		//String cod = JOptionPane.showInputDialog(null, "Item:\nDigite o código do produto: ");
    
    System.out.print("Digite a descrição do produto: ");
    String desc = input.nextLine();
		//String desc = JOptionPane.showInputDialog(null,"Digite a descrição do produto: ");
    System.out.print("Digite a quantidade do produto: ");
    int quant = input.nextInt();
    System.out.print("Digite o preço unitário do produto: ");
    double preço = input.nextFloat();
    return (new Item(cod,desc,quant,preço));
  }

  public static Cliente recebeCliente(Scanner input){
    System.out.print("Cliente:\nDigite o nome do Cliente: ");
    String nome = input.nextLine();
    System.out.print("Digite o CPF do cliente: ");
    String cpf = input.nextLine();
    return (new Cliente(nome, cpf));
  }

  public static void teste(){
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
  public static int menu(Scanner input){
    int op;
    do{
      System.out.print("Menu:\n1 - Cadastrar um novo cliente\n2 - Criar nova compra (e Fatura)\n3 - Mostrar Faturas\n0 - Sair da aplicação\nDigite sua opção: ");
      op = input.nextInt();
    }while(op<0 || op>3);
    input.nextLine(); // "Limpa" o buffer de entrada para não influenciar a leitura de uma string posterior
    return op;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Cliente c;
    Fatura f;
    Vector<Item> itens = new Vector<Item>();
    //teste();

    c=null;
    f=null;
    int op;
		Vector<Fatura> faturas = new Vector<Fatura>();
    do{
      
      op = menu(input);
      switch (op){
        case 1: c = recebeCliente(input);
                break;
        case 2: 
                int o;
                if (c==null) c = recebeCliente(input);
                f = new Fatura(c);
                do{
                  f.adicionaItem(recebeItem(input));
                  System.out.println("Inserir novo item? (0 p/ Não; 1 p/ Sim)");
                  o = input.nextInt();
                  input.nextLine(); // "Limpa" o buffer de entrada para não influenciar a leitura de uma string posterior
                }while (o!=0);
                System.out.println(f);
								faturas.add(f);
								f=null;
								c=null;
                break;
        case 0: System.out.println("Saindo do programa!");
                break;
				case 3: 
							for(Fatura fat : faturas){
								System.out.println(fat);
							}
      }
    }while(op!=0);
  }
}

