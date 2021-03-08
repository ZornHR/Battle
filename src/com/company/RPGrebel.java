package com.company;

public class RPGrebel extends PalestinianRebel implements RPG {
    public RPGrebel(String name, String callsign) {
        super(name, callsign);
    }

    @Override
    public void rpgFire() {
        System.out.println("Огонь из РПГ аллахакбар!");
    }

    @Override
    public void takeСover() {
        System.out.println("Прыгает в окоп и начинает молиться");
    }

    @Override
    public void move() {
        System.out.println("кродеться");
    }


}
