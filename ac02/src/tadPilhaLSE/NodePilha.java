package tadPilhaLSE;

import exception.EmptyPilhaException;

public class NodePilha<E> implements Pilha<E>{
	protected Node<E> top; // refer�ncia para o nodo cabe�a
	protected int size; // quantidade de elementos na pilha
	public NodePilha() { // constr�i uma pilha vazia
		top = null;
		size = 0;
	}
	public int size() {return size; }
	public boolean isEmpty() {
		if (top == null) return true;
		return false;
	}
	public void push(E elem) {
		Node<E> v = new Node<E>(elem, top); // cria e encadeia um nodo novo
		top = v;
		size++;
	}
	public E top() throws EmptyPilhaException {
		if (isEmpty()) throw new EmptyPilhaException("Stack is empty.");
		return top.getElement();
	}
	public E pop() throws EmptyPilhaException {
		Node<E> aux = top;

		if (isEmpty()) throw new EmptyPilhaException("Stack is empty.");
		E temp = top.getElement();
		top = top.getNext(); // desencadeia o nodo topo
		aux.setNext(null);
		size--;
		return temp;
		}
		
	
	/*
	public static Object invertearranjo(PilhaNode<Integer> arranjo) {
		final NodePilha<Integer> pilha = new NodePilha<Integer>();
		for (int i = 0; i < arranjo.size(); i++) {
			pilha.push(arranjo.get(i));
		}
		for (int i = 0; i < arranjo.size(); i++) {
			arranjo.set(i, pilha.pop());
		}
		return arranjo;
	} */


		/*public String verificaExpressao(String[] c1) {
			NodePilha<String> exp = new NodePilha<String>();
			for (int i = 0; i <= c1.length - 1; i++) {
				if (c1[i].equals("(") || c1[i].equals("[") || c1[i].equals("{")) {
					exp.push(c1[i]); 
				}
				else if (c1[i].equals(")") || c1[i].equals("]") || c1[i].equals("}")) {
					if (exp.isEmpty()) return "Incorreto";
					
					if (exp.top().equals("(") && c1[i].equals(")") || 
						exp.top().equals("[") && c1[i].equals("]") || 
						exp.top().equals("{") && c1[i].equals("}")) { 
						
						exp.pop();
					}
					else return "Incorreto";
				}
			}
			if (exp.isEmpty())
				return "Correto";
			else
				return "Incorreto"; 
		
		
	}*/
	public String toString() {
		String s;
		Node<E> p = top;

		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1) 
			s = s.substring(0, s.length() - 2);
		return s + "]";
	}
}
