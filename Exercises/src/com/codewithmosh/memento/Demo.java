package com.codewithmosh.memento;

public class Demo {
    public static void show() {
        Document document = new Document();
        History history = new History();

        document.setContent("Yo yo!");
        history.push(document.createState());

        document.setFontSize(36);
        history.push(document.createState());

        document.setFontName("awesomeFont");

        System.out.println(document);

        document.restoreState(history.pop());
        System.out.println(document);

        document.restoreState(history.pop());
        System.out.println(document);
    }
}
