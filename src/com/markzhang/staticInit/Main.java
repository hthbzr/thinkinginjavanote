package com.markzhang.staticInit;

/**
 * 输出：
 这是静态代码块
 狗的无参构造方法执行了
 null
 狗的无参构造方法执行了
 有参的构造方法执行了
 tomcat is sleeping
 狗的无参构造方法执行了
 有参的构造方法执行了
 jerrycat is sleeping

 * 静态代码块，静态变量只会初始化一次
 * 定义了有参构造方法之后，最好在定义个无参构造方法，如果不定义无参构造方法，则系统不会自动生成一个无参构造方法，
 * 只能使用有参构造方法
 * 初始化的顺序是首先static（如果它们尚未由前一次对象创建过程初始化），接
 * 着是非static对象
 */
public class Main {

    public static void main(String[] args) {
        Cat cat2 = new Cat();
        System.out.println(cat2.name);
        Cat cat = new Cat("tom");
        cat.sleep();
        Cat cat1  = new Cat("jerry");
        cat1.sleep();
    }
}
