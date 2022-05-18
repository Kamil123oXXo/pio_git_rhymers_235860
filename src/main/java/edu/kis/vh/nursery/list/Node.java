package edu.kis.vh.nursery.list;

/**
 * @author Kamil Ejsmont
 *
 */
public class Node {

	private final int value;
	private Node prev, next;

	/**
	 * Kontruktor przypisuje liczbę do pola value.
	 * @param i Liczba całkowita przypisana do pola value
	 */
	public Node(int i) {
		value = i;
	}

	/**
	 * @return Zwraca liczbę przypisaną do pola value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return Zwraca poprzedni węzeł
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * @param prev Obiekt przypisany do pola prev węzła
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * @return Zwraca następny węzeł
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next Obiekt przypisany do pola next węzła
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
}
