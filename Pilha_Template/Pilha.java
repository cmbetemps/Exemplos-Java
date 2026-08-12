public class Pilha<T> extends List<T> implements I_Pilha<T>{

	public void push(T obj){
		insertAtFront(obj);	
	}

	public T pop() throws EmptyStackException{
		if (this.isEmpty()) throw new EmptyStackException("Stack");
		T removedItem = removeFromFront();
		return removedItem;
	}

	public boolean isEmpty(){
		return super.isEmpty();
	}	


	public static void main (String args[]){


		Pilha<Integer> p = new Pilha<Integer>();
		p.push(5);
		p.push(15);
		p.push(3);
		p.push(-5);
		p.push(55);
		p.print();
		System.out.println(p.pop());
		p.print();
p.pop();
p.pop();
p.pop();
p.pop();
p.pop();		
	}

}
