package com.gla.arrays;

public class GreatestElements {
    public static void main(String[] args) {

        int arr[] = {-5, -6, -2, -7, -9,};
        int max = arr[0]; // for positive number use max = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("Max element is : "+max);
    }

}
