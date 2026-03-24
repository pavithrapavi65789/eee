package DataStructure.Queues;

public class Queues {
    int[] arr;
    int size;
    int front;
    int back;

    Queues(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    void push(int val){
        if(back == size - 1){
            System.out.println("Overflow");
            return;
        }
        back++;
        arr[back] = val;

        if(front == -1){
            front = 0;
        }
    }

    void pop(){
        if(front == -1 || front > back){
            System.out.println("Underflow");
            return;
        }
        front++;
    }

    int peek(){
        if(front == -1 || front > back){
            System.out.println("Underflow");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return (front == -1 || front > back);
    }


    public static void main(String[] args) {
        Queues q = new Queues(5);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        System.out.println("Front element: " + q.peek());

        q.pop();
        System.out.println("After pop, front: " + q.peek());

        q.pop();
        q.pop();

        if(q.isEmpty()){
            System.out.println("Queue is empty");
        }

        q.pop();
    }
}