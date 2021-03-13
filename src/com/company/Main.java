package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon();

        BOSS boss = new BOSS();
        boss.setHealth(800);
        boss.setDamage(60);
        weapon.setNameOfWeapon("Staff");
        weapon.setTypeOfWeapon("fire ball");
        boss.setWeapon(weapon);

        Weapon s1 = new Weapon();
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(200);
        skeleton1.setDamage(20);
        s1.setNameOfWeapon("Ice Arrow");
        s1.setTypeOfWeapon("Arrow");
        skeleton1.setWeapon(s1);

        Weapon s2 = new Weapon();
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(250);
        skeleton2.setDamage(25);
        s2.setNameOfWeapon("Fire Arrow");
        s2.setTypeOfWeapon("Arrow");
        skeleton2.setWeapon(s2);


        System.out.println( "Boss " + boss.printInfo() + " \n" + "Skeleton1 " + skeleton1.printInfo() + " \n"
                + "Skeleton2 " + skeleton2.printInfo());
    }
}


//Создать класс Weapon (Оружие), с приватными полями тип оружия и название оружия.
// Создать класс GameEntity (Игровая сущность), выделить
// все общие поля которые присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
// Создать класс Босса, наследовать его от класса GameEntity
// и дополнить его полем сложного типа данных Weapon
// (то есть дать оружие боссу). Также добавить геттеры и сеттеры для этого поля.
// В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
// Затем распечатать всю информацию о боссе.
// ДЗ на сообразительность:
//Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
// Создать класс Skeleton (Скелет), унаследовать от Босса.
//Добавить поле (кол-во стрел) и добавить геттеры.
// Переопределить родительский метод printInfo в классе Sceleton
//  В Main распечатать информацию о Боссе с помощью метода printInfo,
// также создать 2 экземпляра скелета и заполнить данными) затем распечатать всю информацию о скелетах.