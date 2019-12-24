package com.company;

public class Application {
    private Phone phone;
    private Laptop laptop;

    Application(AbstractFactory factory){
        this.phone = factory.createPhone();
        this.laptop = factory.createLaptop();
    }

    public void getElementsOnSite(){
        System.out.println(phone.getElementsOnSite());
        System.out.println(laptop.getElementsOnSite());
    }
}
