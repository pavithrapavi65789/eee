package DataStructure_LinkedList_Doubingly;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {
    Node head;

    DLL() {
        head = null;
    }

    void insertAtHead(int val) {
        Node n = new Node(val);

        if (head != null) {
            head.prev = n;
            n.next = head;
        }

        head = n;
    }

    void insertAtTail(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        n.prev = temp;
    }

    void deleteAtHead() {
        if (head == null) {
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

// ✅ Driver class OUTSIDE
class Driver {
    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);

        dll.insertAtTail(40);
        dll.insertAtTail(50);

        dll.print();
    }
}