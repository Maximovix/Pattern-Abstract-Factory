package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new FactoryIOS();
        Application application = new Application(factory);
        application.showElementsOnSite();
    }
}
