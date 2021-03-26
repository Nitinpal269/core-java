package com.ducat;
import java.util.Scanner;

public class Ch_1_TakingInput {
    public static void main(String[] args) {

        System.out.println("Taking Input from keyboard");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of these number is: ");
        System.out.println(sum);
        System.out.println("Enter float number: ");
        float c=sc.nextFloat();
        System.out.println("Enter float number 2: ");
        float d=sc.nextFloat();
        float sum1=c+d;
        System.out.println("Sum of these number is: "+sum1);
        System.out.println("Enter word");
        String s=sc.next();
        System.out.println(s);
        System.out.println("Enter sentence");
        String s1=sc.nextLine();
        System.out.println(s1);


    }
}
