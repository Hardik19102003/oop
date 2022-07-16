//package com.OOP;
//
//import java.util.Scanner;
//
//public class StructureVsOop {
//    static  Scanner in = new Scanner(System.in);
//    public static void main(String[] args) {
//        System.out.println("Enter two numbers : ");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        System.out.println("With use of structured programming : ");
//        System.out.println(num1 + num2); // this will run only once
//
//        System.out.println("With use of object oriented programming : ");
//        object(); // this will run till infinity
//
//    }
//
//    static void object() {
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        System.out.println(num1 + num2);
//        object();
//    }
//}

package com.OOP;
        import java.util.Scanner;
public class StructureVsOop {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("With use of structured programming : ");
        System.out.println(num1 + num2); // this will run only once
        System.out.println("With use of object oriented programming : ");
        object(); // this will run till infinity
    }
    static void object() {
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
        object();
    }
}