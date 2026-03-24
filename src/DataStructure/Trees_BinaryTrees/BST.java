package DataStructure.Trees_BinaryTrees;

import DataStructure.Queues.Queues;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
public class BST {
    Node root;
    BST(){
        root =null;

    }
    private Node insertRec(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.key){
            root.left=insertRec(root.left,key);
        }else if(key>root.key){
            root.right=insertRec(root.right,key);
        }
        return root;

    }
    public void insert(int key){
        root=insertRec(root,key);
    }
    void DFS(Node root){
        if (root==null){
            return;
        }
        DFS(root.left);
        System.out.print(root.key+" ");
        DFS(root.right);
    }
    void BFS(){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.key+" ");
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }

        }

    }
}
class Driver{
    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(100);
        bst.insert(50);
        bst.insert(180);
        bst.insert(30);
        bst.insert(80);
        bst.insert(60);
        bst.insert(150);
        bst.insert(200);
        bst.insert(120);
        bst.insert(170);



        System.out.print("BFS Traversal:");


        bst.BFS();
        System.out.println();
        System.out.print("DFS traversal:");
        bst.DFS(bst.root);

    }
}
