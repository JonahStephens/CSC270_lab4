
public class MyStack<T>
{
	private class Node
	{
		public T val;
		public Node next;
		
		public Node(T val, Node next)
		{
			this.val = val;
			this.next = next;
		}
	}
	
	Node head;

	public MyStack()
	{
		head = null;
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		head = new Node(val,head);
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top() throws StackUnderFlowException
	{
		if (this.isEmpty())
		{
			throw new StackUnderFlowException();
		}
		return this.head.val;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop() throws StackUnderFlowException
	{
		if (this.isEmpty())
		{
			throw new StackUnderFlowException();
		}
		Node temp = this.head;
		this.head = temp.next;
		return temp.val;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		return this.head == null;
	}

}