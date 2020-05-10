package com.markzhang.init;

/**
 * 输出结果：一个类中，成员变量的初始化顺序，按照在类的中顺序执行，并且比任何方法都早，包括构造方法
 * 这比较符合逻辑，new 一个对象的时候，会初始化成员变量，这些完成了在调用构造方法来构造对象
 *     Tag(1)
 *     Tag(2)
 *     Tag(3)
 *     Card()
 *     Tag(33)
 *     Tag(1)
 *     Tag(2)
 *     Tag(3)
 *     Card()
 *     Tag(33)
 *     fo()
 *     fo()
 *
 */
public class Main {

    public static void main(String[] args) {
        Card card = new Card();
        Card card1 = new Card();
        card1.fo();
        card.fo();
    }
}
