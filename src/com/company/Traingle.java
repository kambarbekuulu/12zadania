package com.company;

public class Traingle {
   static int a;
    static int b;
   static int c;


    static void area() {
        double p=(a+b+c);
        System.out.println(p);
        double S=(Math.sqrt(p*(p - a )*(p-b)*(p-c)));
        System.out.println(S);



    }
}
