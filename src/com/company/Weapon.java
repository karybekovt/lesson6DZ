package com.company;

public class Weapon {
    private String weaponType;
    private String weaponName;

    public Weapon (String weaponType, String weaponeName) {
        this.weaponType = weaponType;
        this.weaponName = weaponeName;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
