package DataStructure;

class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;

    }
}
public class SLL {
    Node head;

    SLL() {
        head = null;
    }

    void insertAthead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;

    }
    void insertAtTail(int val){
        Node n=new Node(val);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;

        }
        temp.next=n;
    }

    void printSLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    class Driver {

    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAthead(10);
        sll.insertAthead(20);
        sll.insertAthead(30);
        sll.insertAthead(40);
        sll.insertAthead(50);
        sll.printSLL();
        sll.insertAtTail(500);
        System.out.println();
        sll.printSLL();


    }

}