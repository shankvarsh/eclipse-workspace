package sem2;
import java.util.Scanner;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("No elements in the list");
            return;
        }
        System.out.println("elements in the list:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.previous = null;
                    } else {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = tail.previous;
                    tail.next = null;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                System.out.println("Deleted " + data + " from the list.");
                return;
            }
            current = current.next;
        }
        System.out.println(data + " not found in the list.");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Operarions To Be Performed --- \n\t 1 Insert \n\t 2 Delete \n\t 3 Display \n\t 4 Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("Enter the integer to be inserted : ");
                        list.insert(sc.nextInt());
                        System.out.println("------------------------------------");
                        break;
                case 2:
                	System.out.println("Enter the integer to be deleted : ");
                            list.delete(sc.nextInt());
                            System.out.println("-------------------------------------");
                        break;
                case 3: 
                       list.display();
                        break;
                case 4:
                        System.exit(0);
            }
            
        }while(true);
        
    }
} 
