package DataStructure.Graph_GraphTraversal.BFS;

import DataStructure.Queues.Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Graph {
    int V;
    Graph(int v){
        this.V=v;
    }
    ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;

        while (!q.isEmpty()){
            int front =q.poll();
            ans.add(front);

            for(int i:adjList.get(front)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter verticis and edges:");
        int v=sc.nextInt();
        int e=sc.nextInt();

        ArrayList<ArrayList<Integer>> adjust=new ArrayList<>();
        for (int i=0;i<v;i++){
            adjust.add(new ArrayList<>());
        }
        for (int i=0;i<e;i++){
            System.out.println("enter edge" +i+ " , ");
            int u=sc.nextInt();
            int vertex = sc.nextInt();



            adjust.get(u).add(vertex);
            adjust.get(vertex).add(u);
        }
    }
}
