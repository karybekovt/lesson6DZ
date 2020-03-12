package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        Weapon wpn = new Weapon("Огнестрельное оружие", "Дробовик");
        boss.setWeapon(wpn);

        System.out.println("Здоровье Босса: " + boss.getHealth());
        System.out.println("Урон Босса: " + boss.getDamage());
        System.out.println("Тип оружия Босса: " + boss.getWeapon().getWeaponType());
        System.out.println("Название оружия Босса: " + boss.getWeapon().getWeaponName());
    }
}
