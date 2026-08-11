public class Counter {
	protected int count; //um variável de instância
	/**Construtor para os objetos de Counter */
	Counter(){ 
		count = 0;
	}
	/**um método de acesso para recuperar valor atual do contador*/
	public int getCount(){
		return count;
	}
	/**um método de atualização para incrementar o objeto contador*/
	public void incCount(){
		count++;
	}	
	/**um método de atualização para decrementar o objeto contador*/
	public void decCount(){
		count--;
	}	

	public static void main(String[] args){
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.incCount();		
		c1.incCount();
		System.out.println("Contador c1: " + c1.getCount());
		System.out.println("Contador c2: " + c2.getCount()+"\n");
		c2.incCount();
		c1.decCount();
		System.out.println("Contador c1: " + c1.getCount());
		System.out.println("Contador c2: " + c2.getCount());
	}

}
