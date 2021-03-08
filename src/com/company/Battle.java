package com.company;

public class Battle {
    public void start() {
        IsraelTank tank1 = new IsraelTank("Меркава", 130);
        tank1.move();

        RPGrebel rebel1 = new RPGrebel("Ахмет", "хвост скорпиона");
        
        System.out.println("Палестинский боец с РПГ-7 по имени " + rebel1.name + " и позывным " + rebel1.callsign);
        rebel1.move();
        System.out.println("Ахмет целится из укрытия");
        rebel1.rpgFire();
        System.out.println("Командир танка прозевал, граната прилетает в борт");
        tank1.dynamicDefense();
        System.out.println("По пыли, поднятой выстрелом, стрелок меркавы наводит 120мм орудие");
        System.out.println("Хвост скорпина");
        rebel1.takeСover();
        tank1.gunFire();
        System.out.println("От 120мм фугаса так просто не спрячешься");
        System.out.println("Ахмет:");
        rebel1.dead();


    }
}
