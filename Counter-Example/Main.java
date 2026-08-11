public class Main {
  public static void main(String[] args) {
    System.out.println("Criando contadores c1 e c2 (inicializados com 0)");
    Counter c1 = new Counter();
    Counter c2 = new Counter();
		System.out.println("Mostrando os valores de c1 e c2 com:\n\tc1.getCount();\n\tc2.getCount();");
		System.out.println("Contador c1: " + c1.getCount());
    System.out.println("Contador c2: " + c2.getCount());
		System.out.println("Incrementando c1 duas vezes com:\n\tc1.incCount();\n\tc1.incCount();");
    c1.incCount();		
    c1.incCount();
    System.out.println("Contador c1: " + c1.getCount());
    System.out.println("Contador c2: " + c2.getCount()+"\n");
		System.out.println("Incrementando c2 e decrementando c1 com:\n\tc2.incCount();\n\tc1.decCount();");
    c2.incCount();
    c1.decCount();
    System.out.println("Contador c1: " + c1.getCount());
    System.out.println("Contador c2: " + c2.getCount());
  }
}
