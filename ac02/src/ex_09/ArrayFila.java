package ex_09;

import exception.EmptyFilaException;
import tadFila.Fila;
import tadPilhaLSE.Node;


public class ArrayFila<E> implements Fila<E> {
	public int size;
	public Node<E> head;
	public Node<E> tail;
	
	public void enqueue(E elem) {
		Node<E> node = new Node<E>();
		node.setElement(elem);
		node.setNext(null); // nodo será o novo nodo do final
		
		if (size == 0)
		head = node; // caso especial de uma lista previamente
		//vazia
		else
		tail.setNext(node); // adiciona nodo no final da lista
		tail = node; // atualiza referência ao nodo do final
		size++;
		}

		public E dequeue() throws EmptyFilaException {
		if (size == 0)
		throw new EmptyFilaException("Queue is empty.");
		E tmp = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
		tail = null;// a fila está vazia agora
		return tmp;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E front() throws EmptyFilaException {
			// TODO Auto-generated method stub
			return null;
		}
		
		public String toString() {
			Node<E> p = head;
			String elementos = "[";
			while(p != null) {
				elementos += p.getElement();
				p = p.getNext();
				if(p != null) {
					elementos += ", ";
				}
			}		
			elementos += "]";
			return elementos;
		}
}		
