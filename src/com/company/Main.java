package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setWeapon(new Weapon("Огнестрельное оружие", "Дробовик"));

        System.out.println("Здоровье Босса: " + boss.getHealth());
        System.out.println("Урон Босса: " + boss.getDamage());
        System.out.println("Тип оружия Босса: " + boss.getWeapon().getWeaponType());
        System.out.println("Название оружия Босса: " + boss.getWeapon().getWeaponName());
    }
}
