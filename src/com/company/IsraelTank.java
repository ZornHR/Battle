package com.company;

public class IsraelTank extends Armored implements Gun {

    public IsraelTank(String model, int number) {
        super(model, number);
        System.out.println("Израильский танк " + model + " c номером " + number);
    }

    @Override
    public void gunFire() {
        System.out.println("Огонь из орудия");
    }

    @Override
    public void dynamicDefense() {
        System.out.println("активация динамической защиты");
    }

    @Override
    public void move() {
        System.out.println("Неотвратимо приближается, лязгая траками");
    }

}
