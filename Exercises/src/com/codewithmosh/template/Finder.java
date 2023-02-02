package com.codewithmosh.template;

public class Finder extends Window {
    @Override
    protected void onClosing() {
        System.out.println("Closing finder...");
    }

    @Override
    protected void onClosed() {
        System.out.println("Finder closed.");
    }
}
