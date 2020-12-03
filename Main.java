package DoubleLinkedList;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
		//Create employee objects.
		Employee Micheal = new Employee("Micheal", "Bailey", 1234);
		Employee Nicolas = new Employee("Nicolas", "Darvas", 5678);
		Employee Stan = new Employee("Stan", "Weinstein", 2468);
		Employee John = new Employee("John", "Doe", 9876);
		Employee Westly = new Employee("Westly", "Balthrop", 1234);
		Employee Chris = new Employee("Chris", "Balthrop", 5876);

		
		//Create a double linked list.
		EmployeeDoubleLinkedList employees = new EmployeeDoubleLinkedList();
		
		//Insert Employee objects into linked List.
		employees.insertToFront(Micheal);
		employees.insertToFront(Nicolas);
		employees.insertToFront(Stan);
		employees.insertToFront(John);
		employees.insertToFront(Westly);
		employees.insertToEnd(Chris);
		
		//Print the nodes within the list as well as the size and if its empty.
		employees.printList();
		System.out.println();
		System.out.println("The size of the LinkedList is: " + employees.getSize());
		System.out.println("The Linked list is empty: " + employees.isEmpty());
		
		//Remove one node from the front of the list and one node from the back of the list.
		employees.removeFromFront();
		employees.removeFromEnd();
		
		//Print the contents of the new list as well as the size and if its empty.
		System.out.println();
		employees.printList();
		System.out.println();
		System.out.println("The size of the LinkedList is: " + employees.getSize());
		System.out.println("The Linked list is empty: " + employees.isEmpty());

	}

}
