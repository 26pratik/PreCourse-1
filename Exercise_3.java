//Time complexity for insert: O(n)
//Time complexity for print: O(n)
//Space Complexity for insert : O(1)
//Space Complexity for print : O(1)

import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
class LinkedList {
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(isEmpty(list)) {
            list.head = node;
        }
        else {
            Node temp = list.head;
            // Else traverse till the last node
            while(temp.next != null)
                temp = temp.next;
            // and insert the new_node there
            // Insert the new_node at last node
            temp.next = node;
        }

        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node temp = list.head;

        while(temp != null) {
            // Print the data at current node
            System.out.println(temp.data);
            // Go to next node
            temp = temp.next;
        }
    }

    public static boolean isEmpty(LinkedList list) {
        //Write your code here for the condition if stack is empty.
        return  list.head == null;
    }
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}