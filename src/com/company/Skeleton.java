package com.company;

public class Skeleton extends BOSS{

    private int quantityOfShots = 10;
    public String printInfo(){
        return super.printInfo() + " ;" + quantityOfShots;
    }

    public int getQuantityOfShots() {
        return quantityOfShots;
    }
}
