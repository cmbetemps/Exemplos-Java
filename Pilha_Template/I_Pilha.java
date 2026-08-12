public interface I_Pilha<T>{
	void push(T obj);
	T pop() throws EmptyStackException;
	boolean isEmpty();
}
