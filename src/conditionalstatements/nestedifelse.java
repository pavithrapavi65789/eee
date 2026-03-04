package conditionalstatements;

public class nestedifelse {
    public static void main(String[] args) {
        int a =10;
        if(a>5) {
           if(a<15){
            System.out.println("eat");
           } else {
            System.out.println("sleep");
            }
        } else{
                System.out.println("repeat");
        }
    }
}


