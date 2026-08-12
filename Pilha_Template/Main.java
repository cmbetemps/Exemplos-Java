public class Main {
  public static void main (String args[]){
		Pilha<String> p = new Pilha<String>();
    try{
      p.push("5.0");
      p.print();
      p.push("15.0");
      p.print();
      p.push("3.0");
      p.print();
      p.push("-5.0");
      p.print();
      p.push("55.0");
      p.print();
      System.out.println("-->" + p.pop());
      p.print();
      p.pop();
      p.print();
      p.pop();
      p.print();
      p.pop();
      p.print();
      p.pop();
      p.print();
      p.pop();
      p.print();
    }
    catch(EmptyStackException e){
    	e.printStackTrace();
    }
  }
}
