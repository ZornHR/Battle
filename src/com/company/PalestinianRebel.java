package com.company;

public abstract class PalestinianRebel {
    protected String name;
    protected String callsign;

    public PalestinianRebel(String name, String callsign) {
        this.name = name;
        this.callsign = callsign;
    }

    public abstract void move();

    public void dead() {
        System.out.println("Летит к Гуриям");
    }
}
