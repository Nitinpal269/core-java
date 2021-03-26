package com.ducat;
import  java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        System.out.println("Enter marks of first subject");
        Scanner sc=new Scanner(System.in);
        double d1=sc.nextDouble();
        System.out.println("Enter marks of second subject");
        double d2=sc.nextDouble();
        System.out.println("Enter marks of third subject");
        double d3=sc.nextDouble();
        System.out.println("Enter marks of fourth subject");
        double d4=sc.nextDouble();
        System.out.println("Enter marks of fifth subject");
        double d5=sc.nextDouble();

        double sum=d1+d2+d3+d4+d5;
        double per=sum/5;
        System.out.println("Total percentage marks: "+per+"%");
    }
}
