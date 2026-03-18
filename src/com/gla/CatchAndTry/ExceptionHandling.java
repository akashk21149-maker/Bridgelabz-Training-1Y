package com.gla.CatchAndTry;

public class ExceptionHandling {
    public static void main(String[] args){
    int a = 20;
    int b = 0;
    int[] arr = {1,2,3,4,5};
    System.out.println("A");
    try{
        System.out.println(arr[6]);
        System.out.println(a/b);
    }catch(ArithmeticException e){
        System.out.println("It is solved");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Solved");
    }finally{
        System.out.println("finally execute");
    }
    System.out.println("B");
  }
}
