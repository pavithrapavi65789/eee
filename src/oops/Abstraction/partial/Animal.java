package oops.Abstraction.partial;

abstract class Animal {
    abstract  void eat();
    void run() {
        System.out.println("running");
        }
    }
    class lion extends Animal{
        void eat(){
            System.out.println("lion eat non veg");
        }
    }
    class deer extends Animal{
    void eat(){
        System.out.println(" deer eat grass");
    }
}
class Drive{
    public static void main(String[] args) {
        lion l = new lion();
        l.eat();

        deer d = new deer();
        d.eat();
        l.run();
    }
}
