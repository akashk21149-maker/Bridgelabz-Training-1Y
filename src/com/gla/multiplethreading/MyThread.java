package com.gla.multiplethreading;

public class MyThread implements Runnable {

    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Thread1: "+ i);

            try{
                Thread.sleep(2000);
            }catch(Exception e){ // when you don't know the name of exception
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        MyThread myThread = new MyThread();
        Thread t =new Thread(myThread);
        t.start();

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}