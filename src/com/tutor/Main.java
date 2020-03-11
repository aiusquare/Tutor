package com.tutor;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] arr= new int[5];
        
        // this will loop until five inputs are collected
        for(int i=0; i<arr.length;i++){
            System.out.println("enter the number:");
            arr[i]=input.nextInt();
        }
        System.out.println("The output");
        
        // this method do the sorting
        Arrays.sort(arr);
        
        // looping through the array for display
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("the end");
    }
    
}
