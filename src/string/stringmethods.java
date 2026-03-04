package string;

public class stringmethods {
    public static void main(String[] args) {
        String s1="Java programming";
        String s2=new String("Java programming");
        System.out.println("original String:"+s1);

        // length()
        System.out.println("length:"+s1.length());

        //charAt
        System.out.println("character at index 2:"+s1.charAt(2));

        //toUpperCase() and tolowercase()
        System.out.println("UpperCase:"+s1.toUpperCase());
        System.out.println("lowerCase:"+s1.toLowerCase());

        //equals() and==
        System.out.println("using =="+(s1==s2));
        System.out.println("using equals():"+s1.equals(s2));

        //compareto() -> lexicographical comparison
        System.out.println("compareto():"+s1.compareTo(s2));

        //substring()
        System.out.println("substring 0to 4:"+s1.substring(0,4));

        //contain()
        System.out.println("contains 'program:"+s1.contains("program"));

        //indexof()
        System.out.println("indexof 'a':"+s1.indexOf('a'));

        //replace()
        System.out.println("replace java to python:"+s1.replace("java","python"));

        //trip()
        String s3="    hello world    ";
        System.out.println("before trim:" +s3);
        System.out.println("after trim:"+s3.trim());

        //concat()
        System.out.println("concat:"+s1.concat("language"));

        //isempty()
        String s4 ="";
        System.out.println("Is Empty:"+s4.isEmpty());

        //split()
        String sentence=("java is a programming language");
        String[] arr =sentence.split(" ");

        for(String i : arr){
            System.out.println(i);
        }



    }
}
