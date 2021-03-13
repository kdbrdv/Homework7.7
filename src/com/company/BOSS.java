package com.company;

public class BOSS extends GameEntity {

    private Weapon weapon;

    public String printInfo(){
        return "Health:" + getHealth() + "; " + "Damage:" + getDamage() + "; " + "Type:" + getWeapon().getTypeOfWeapon()
                + "; " + "Name:"+ getWeapon().getNameOfWeapon();

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
