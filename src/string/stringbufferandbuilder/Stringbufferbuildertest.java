package string.stringbufferandbuilder;

public class Stringbufferbuildertest {
    public static void main(String[] args) {
        //String buffer

        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("hello");
        for (int i = 0; i < 100000; i++) {
            sbf.append("world");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("TimeTaken by sbf:" + (stopTime - startTime) + "ms");

        //String builder
        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("hello");
        for (int i = 0; i < 100000; i++) {
            sbl.append("world");


        }
        stopTime = System.currentTimeMillis();
        System.out.println("TimeTaken by sbl:" + (stopTime - startTime) + "ms");

    }
}
