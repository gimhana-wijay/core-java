package main.java.core.java_comments;

//Java Comments 

/*
public class Example {
    public static void main(String args[]){
        System.out.println("A");
        //System.out.println("B");
        System.out.println("C");
        //System.out.println("D");
        System.out.println("E");
       //System.out.println("F");
        System.out.println("G");
    }
}

A
C
E
G
*/

class Example {
    public static void main(String args[]){
        System.out.println("A");
        /*System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");*/
        System.out.println("F");
        System.out.println("G");
    }
}
/*
A
F
G
*/

/*
class Example {
    public static void main(String args[]){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }
}

A
B
C
*/