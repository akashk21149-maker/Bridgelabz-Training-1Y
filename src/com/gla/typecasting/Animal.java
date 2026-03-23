package com.gla.typecasting;

class Animal {
    void eat() {
        System.out.println("Animals eat food");
    }
}

class Dog extends Animal {
    void barks(){
        System.out.println("Dog barks");
    }
}
class main {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Upcasting
        Dog dog = (Dog) obj;    // Downcasting
        obj.eat();
        dog.barks();
    }
}
