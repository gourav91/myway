package com.gourav.datastructure.practice;

public class SinglyLinkedList {
	Node head;
	Node tail;

	public void add(int data) {
		Node node = new Node();
		node.setData(data);
		System.out.println("Adding: "+data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.add(10);

	}
}

class Node {
	int data;
	Node next;

	public int setData(int data) {
		return this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

}
