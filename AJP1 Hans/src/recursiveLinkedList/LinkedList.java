// *****************************************************************************
// File name  : LinkedList.java
// Start date : 
// Programmer : Hans So.
// Java       : Java 1.7
// Description: Recursive implementations on a singly linked list
//
// *****************************************************************************

package recursiveLinkedList;

public class LinkedList<T> implements IList<T> {
	private Node head = null;

	private class Node {
		T elem;
		Node next;

		public Node(T elem, Node next) {
			this.elem = elem;
			this.next = next;
		}
	}

	@Override
	public void addFirst(T element) {
		head = new Node(element, head);
	}

	@Override
	public void addLast(T element) {
		if (head == null) {
			addFirst(element);
		} else {
			Node node = getLastNode(head);
			node.next = new Node(element, null);
		}
	}

	@Override
	public T removeFirst() {
		if (head == null) {
			return null;
		}

		T temp = head.elem;
		head = head.next;

		return temp;
	}

	@Override
	public T removeLast() {
		T temp;
		if (head == null) {
			return null;
		}

		else if (head == getLastNode(head)) {
			temp = head.elem;
			head = null;
			return temp;
		}

		else {
			temp = getLastNode(head).elem;
			getNodeBeforeLastNode(head).next = null;
			return temp;
		}

	}

	@Override
	public int size() {

		return recSize(head);
	}

	@Override
	public void print() {
		recPrint(head);
	}

	@Override
	public void printReverse() {
		recPrintReverse(head);
	}

	// recursive help methods:
	private Node getLastNode(Node node) {

		if (node.next == null) {
			return node;
		}
		return getLastNode(node.next);
	}

	private Node getNodeBeforeLastNode(Node node) {

		if (node.next.next == null) {
			return node;
		}
		return getNodeBeforeLastNode(node.next);
	}

	private int recSize(Node list) {
		if (list == null) {
			return 0;
		}

		return 1 + recSize(list.next);
	}

	private void recPrint(Node list) {
		if(list == null)
		{
			System.out.println("null");
		}
		else if(list==getLastNode(list))
		{
			System.out.println(list.elem);
		}
		else{
			System.out.println(list.elem);
			recPrint(list.next);
		}

	}

	private void recPrintReverse(Node list) {

		
		
		if(list == null)
		{
			System.out.println("null");
		}
		else if(list == getLastNode(list))
		{
			System.out.println(list.elem);
		}
		else
		{
			System.out.println(getLastNode(list).elem);
			recPrintReverse(getNodeBeforeLastNode(list));
			this is not rigt
		}
			

	}
}
