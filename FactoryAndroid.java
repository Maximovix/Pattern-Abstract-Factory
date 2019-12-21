package com.company;

public class FactoryAndroid implements AbstractFactory {

    @Override
    public Phone createPhone() {
        return new PhoneAndroid();
    }

    @Override
    public Laptop createLaptop() {
        return new LaptopAndroid();
    }
}
