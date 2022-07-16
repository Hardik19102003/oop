package com.OOP;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Using loop");
        System.out.println("Enter the Number : ");
        int num = in.nextInt();
        int temp,n=num;   // every time number will change that's why we save that in temp

        while(num>0){
            temp = num%10;   // modulo will give us remainder means last digit
            System.out.print(temp);
            num=num/10;

        }
        System.out.print("\nUsing recursion\n");
        reverse(n);
    }

    static void reverse(int num){
        if(num<10){
            System.out.println(num);
        }
        else{
            System.out.print(num%10);
            reverse(num/10);
        }
    }
}
