import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStack 
{
	
	MyStack<String> stack;

	@Test
	void test() 
	{
		stack = new MyStack<>();
		assertTrue(stack.isEmpty());
		stack.push("Night Fury");
		stack.push("Gronckle");
		assertEquals(stack.top(), "Gronckle");
		assertEquals(stack.pop(), "Gronckle");
		assertEquals(stack.top(), "Night Fury");
		assertFalse(stack.isEmpty());
		stack.pop();
		assertThrows(StackUnderFlowException.class,
				()->{
					stack.top();
				});
		assertThrows(StackUnderFlowException.class,
				()->{
					stack.pop();
				});
	}

}
