package com.markzhang.init;

public class Card {
    Tag tag1 = new Tag(1);

    Card(){
        System.out.println("Card()");
        tag3 = new Tag(33);
    }

    Tag tag2 = new Tag(2);

    void fo(){
        System.out.println("fo()");
    }

    Tag tag3 = new Tag(3);
}
