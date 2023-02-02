package com.codewithmosh.template;

public class ChatWindow extends Window{
    @Override
    protected void onClosing() {
        System.out.println("Closing chat window...");
    }

    @Override
    protected void onClosed() {
        System.out.println("Chat window closed.");
    }
}
