package com.OOP;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] array= {1,2,5,7,9,10,55,70};  //increasing order
        int[] array = {5,3,1,0,-8};   //decreasing order
        int target = in.nextInt();
        int start=0;
        int end= array.length-1;

        System.out.println(linearSearch(array,start,end,target));
    }
    static int linearSearch(int[] arr,int start,int end,int target){
        // condition tells us that weather array is in increasing
        // or decreasing order
        if(arr[start]<arr[end]){
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i]==target){
                    return i;
                }
            }
        }
        else{
            for (int i = end; i >= start ; i--) {
                if(arr[i]==target){
                    return i;
                }
            }
        }

        return -1;  // if target was not found than return -1
    }
}
