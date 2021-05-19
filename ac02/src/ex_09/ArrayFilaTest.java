package ex_09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.EmptyFilaException;

class ArrayFilaTest {
	Object o;
	static final ArrayFila<Integer> a = new ArrayFila<Integer>();

	@Test
	void test() throws EmptyFilaException {
	assertEquals("[]", a.toString(), "Fila vazia");
	a.enqueue(1);
	assertEquals("[1]", a.toString(), "Deve resultar [1]");
	a.enqueue(2);
	assertEquals("[1, 2]", a.toString(), "Deve resultar [1, 2]");
	assertEquals(1, a.dequeue(), "Deve resultar 1");
	assertEquals("[2]", a.toString(), "Deve resultar [2]");
	assertEquals(2, a.dequeue(), "Deve resultar 2");
	assertEquals("[]", a.toString(), "Deve resultar []");
	assertThrows(EmptyFilaException.class, () -> { a.dequeue(); });

	}

	}
