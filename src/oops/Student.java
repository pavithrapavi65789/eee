package oops;

public class Student {
    String name;
    int usn;

    Student(String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    void printDetails(){
        System.out.println("Student name"+ this.name);
        System.out.println("Student usn"+ this.usn);
    }
}
class Driver{
    public static void main(String[] args) {
        Student s1=new Student("pavithra",84);
        Student s2=new Student("prathima",92);
        s1.printDetails();
        s2.printDetails();
    }
}
