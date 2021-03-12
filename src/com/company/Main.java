package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.Damage = 50;
        boss.Health = 250;
        boss.setWeapon(boss.weapon);
        System.out.println(boss.weapon + " " + boss.Health + " " + boss.Damage);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.Health = 150;
        skeleton1.weapon = skeleton1.getWeapon();
        skeleton1.Damage = 10;
        skeleton1.numberOfArrows = 25;
        skeleton1.getNumberOfArrows();

        Skeleton skeleton2 = new Skeleton();
        skeleton2.Health = 100;
        skeleton2.weapon = skeleton2.getWeapon();
        skeleton2.Damage = 8;
        skeleton2.numberOfArrows = 30;
        skeleton2.getNumberOfArrows();
        System.out.println(skeleton1.numberOfArrows + " " + skeleton1.Damage + " " + skeleton1.Health + " "
                + skeleton1.weapon);
        System.out.println(skeleton2.Damage + " " + skeleton2.numberOfArrows + " " + skeleton2.Health + " "
                + skeleton2.weapon);
    }
}
