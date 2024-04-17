package org.example;

public class Main {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        System.out.println("Arithmetic sum: " + (x + y));
        System.out.println("The value of two variables: " + x + y);

        int i = 5;      //wrong
        i = i + +;

        System.out.println(i);

        int i = 5;
        i = i++ + i++;

        System.out.println(i);

        int i = 5;
        i = i++ + ++i;

        System.out.println(i);

        int i = 5;
        i = ++i + ++i;

        System.out.println(i);

        int a = 0b101;      //101= 1*2^2 + 0*2^1 + 1*2^0 =5

        System.out.println(a);

        int b = 0b11;      //11= 1*2^1 + 1*2^0 =3

        System.out.println(b);

        int c = 0b111;     //111= 1*2^2 + 1*2^1 + 1*2^0 =7

        System.out.println(c);
        

    }
}