package oops.Abstraction.complete_100.multipleinheritance;

public interface mom {
    void cook();

}
interface dad{
    void cook();
}
class child implements mom,dad{
    @Override
    public void cook() {
        System.out.println("indian");

    }
}
class Driver{
    public static void main(String[] args) {
        child c = new child();
        c.cook();

    }
}