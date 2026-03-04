package oops.polymorphisum;

public class mom {
    void cook(){
        System.out.println("indian");
    }
}
class daughter extends mom{
    void cook(){
        System.out.println("chinese");
    }
}
class driver{
    public static void main(String[] args) {
        mom m = new mom();
        daughter d = new daughter();
        m.cook();
        d.cook();


    }
}
