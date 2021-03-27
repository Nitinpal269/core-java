package com.ducat;

public class Ch_2_op_pre {
    public static void main(String[] args) {
        //precedence & Associativity
        int a=6*5-34/2;
        System.out.println(a);
        // highest precedence goes to * and /. They are evaluated on the basis of left to right associativity
        int b= 60/5-34*2;
        System.out.println(b);

        //quick quiz
        int x=6;
        int y=1;
        int k=x*y/2;
        System.out.println(k);

        int c=0;
        int  d=0;
        int e= 10;
        int s=c*c -(4*e*d)/(2*e);
        System.out.println(s);
    }
}
