package edu.bethlehem.generics;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;

import org.junit.Test;

public class StackGenericTest {
	@Test
	public void testPush() {
		StackGeneric<Integer> ints = new StackGeneric<Integer>();
		ints.push(5);
		ints.push(20);
		assertEquals("stack error", 20, (int) ints.pop());
	}

	@Test(expected = EmptyStackException.class)
	public void testPopEmptyStack() {
		StackGeneric<Integer> ints = new StackGeneric<Integer>();
		ints.pop();
	}

}
