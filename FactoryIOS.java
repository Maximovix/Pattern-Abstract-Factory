package com.company;

public class FactoryIOS implements AbstractFactory {

    @Override
    public Phone createPhone() {
        return new PhoneIOS();
    }

    @Override
    public Laptop createLaptop() {
        return new LaptopIOS();
    }
}
