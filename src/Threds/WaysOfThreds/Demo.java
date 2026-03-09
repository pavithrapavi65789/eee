package Threds.WaysOfThreds;

class MyThreds extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("threds is running");
        }
    }
}
public class Demo{
    public static void main(String[] args) {
        MyThreds t1=new MyThreds();
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println("main thread is running");
        }
    }
}
