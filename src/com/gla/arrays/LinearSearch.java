package com.gla.arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {5,6,7,9,0};
        int target = 99;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag = true;

            }
        }
        if(flag==true){
            System.out.println("element is present");
        }else{
            System.out.println("element is not present");
        }
    }
}
