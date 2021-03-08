package com.company;

public abstract class Armored {
    protected String model;
    protected int number;

    public Armored(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public abstract void move();

    public void dead() {
        System.out.println("Booom!");
    }
}
