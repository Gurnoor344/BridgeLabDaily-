package src;

//IMPLICIT CONVERSION
//public class Day4 {
//    public static void main(String[] args) {
//        int i=100;
//        System.out.println(i);
//        long l=i;
//        System.out.println(l);
//        float f=l;
//        System.out.println(f);
//        char c = (char) f;
//        System.out.println(c);
//    }
//}


//EXPLICIT CONVERSION

//public class Day4 {
//    public static void main(String[] args) {
//        double d=100.04;
//        long l = (long)d;
//        int i = (int)l;
//        char c= (char)i;
//        int g = (int)c;
//        System.out.println(d);
//        System.out.println(l);
//        System.out.println(i);
//        System.out.println(c);
//        System.out.println(g);
//    }
//}

import java.util.Scanner;

//calculator
public class Day4 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter an operator (+,-,*./):");
        op = sc.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default: System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}