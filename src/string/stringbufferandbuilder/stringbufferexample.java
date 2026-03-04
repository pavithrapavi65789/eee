package string.stringbufferandbuilder;

public class stringbufferexample {
    static void stringAppend(){
        StringBuffer sbf = new StringBuffer("hello");
        System.out.println("original String is:"+sbf);
        sbf.append("world");
        System.out.println("New String is:"+sbf);
    }
    static void Stringinsert(){
        StringBuffer sbf = new StringBuffer("hello");
        System.out.println("original String is:"+sbf);
        sbf.insert(2,"world");
        System.out.println("New String is:"+sbf);

    }

    public static void main(String[] args) {
        stringAppend();
        Stringinsert();

    }
}
