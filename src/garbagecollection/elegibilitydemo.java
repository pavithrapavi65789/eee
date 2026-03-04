package garbagecollection;

public class elegibilitydemo {
    public void finalize(){
        System.out.println("garbage collector");
    }

    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
           elegibilitydemo obj = new elegibilitydemo();
           obj = null;


        }
        System.gc();

    }
}
