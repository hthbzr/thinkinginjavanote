package com.markzhang.staticInit;

public class Cat {
    String name ;
    Dog dog = new Dog();
    static {
        System.out.println("这是静态代码块");
    }

    Cat(){

    }
    Cat(String name){
        this.name = name;
        System.out.println("有参的构造方法执行了");
    }

    void sleep(){
        System.out.println(name + "cat is sleeping");
    }
}
