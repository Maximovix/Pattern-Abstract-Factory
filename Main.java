package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new FactoryAndroid();
        Application app = new Application(factory);
        app.getElementsOnSite();
    }
}
