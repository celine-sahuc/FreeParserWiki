package dcll.csah.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack{

	Stack<Object> wrappedStack = new Stack<Object>();
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return wrappedStack.isEmpty();
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return this.wrappedStack.size();
	}

	public void push(Item item) {
		// TODO Auto-generated method stub
		this.wrappedStack.push(item);
		
	}

	public Item peek() throws EmptyStackException {
		// TODO Auto-generated method stub
		return (Item) this.wrappedStack.peek();
	}


	public Item pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return (Item) this.wrappedStack.pop();
	}

	
}
