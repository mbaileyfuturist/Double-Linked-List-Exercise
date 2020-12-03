package DoubleLinkedList;

public class EmployeeDoubleLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	//Inserts a new node into the front of the list.
	public void insertToFront(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);
		employeeNode.setNext(head);
		
		//If the head is null, then the linked list is empty and we point the tail to the new node.
		//If the linked list has nodes then we will set the heads previous element to the new node.
		if(head == null) {
			tail = employeeNode;
		}else {
			head.setPrevious(employeeNode);
		}
		
		head = employeeNode;
		size++;
	}
	
	//Insert a new node to the end of the linked list.
	public void insertToEnd(Employee employee) {
		EmployeeNode employeeNode = new EmployeeNode(employee);
		tail.setNext(employeeNode);
		
		if(tail == null) {
			head = employeeNode;
		}else {
			tail.setNext(employeeNode);
			employeeNode.setPrevious(tail);
		}
		
		tail = employeeNode;		
		size++;
	}
	
	//Remove the first node from the linked list.
	public EmployeeNode removeFromFront() {
		
		//If the list is empty, there is nothing to remove.
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removeNode = head;

		//If there is only one node in the linked list.
		//Else set the previous node of the next node to null.
		if(head.getNext() == null) {
			tail = null;
		}else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		removeNode.setNext(null);
		size--;
		
		return removeNode;
	}
	
	//Remove a node from the end of the list.
	public EmployeeNode removeFromEnd() {
		
		//If the list is empty, there is nothing to remove.
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = tail;
		
		//If there is only one node in  the linked list.
		//Else set the tails previous nodes next to null.
		if(tail.getPrevious() == null) {
			head = null;
		}else {
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getPrevious();
		removedNode.setPrevious(null);
		size--;
		
		return removedNode;
	}
	
	//Prints the first and last of each node contained within that list.
	public void printList() {
		EmployeeNode currentNode = head;
		
		System.out.print("HEAD -> ");
		while(currentNode != null) {
			System.out.print(currentNode.getEmployee().getFirstName() + " " + currentNode.getEmployee().getLastName());
			System.out.print(" < - > ");
			currentNode = currentNode.getNext();
		}
		System.out.println("NULL");
	}
	
	//Get the size of the linked list.
	public int getSize() {
		return size;
	}

	//Check to see if the Linked List is empty or not.
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else{
			return false;
		}
	}
}
