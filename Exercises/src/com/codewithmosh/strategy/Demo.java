package com.codewithmosh.strategy;

public class Demo {
    public static void show() {
        var chatClient = new ChatClient(new DES());
        chatClient.send("Hi there");
    }
}
