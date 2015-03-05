
public class StackImpl<T extends Comparable<T> > implements Stack<T>{

	private LLNode<T> head = new LLNode<T>();
	
	//push a new node onto the 
	@Override
	public void push(T data) {
		LLNode<T> nn = new LLNode<T>();
		nn.data = data;
		nn.next = head.next;
		nn.previous = head;
		head.next = nn;
	}

	//remove a node from the top of the stack
	@Override
	public LLNode<T> pop() {
		LLNode<T> temp = head.next;
		head.next = temp.next;
		temp.previous = head;
		return temp;
	}

	//peek at the top of the stack don't remove it.
	@Override
	public T peek() {
		LLNode<T> temp = head.next;
		return temp.data;
	}

}
