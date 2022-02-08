package com.day5.problems;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
        System.out.println();
        findnum();
    }
    public static void findnum() {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        num=s.nextInt();
        if(num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
