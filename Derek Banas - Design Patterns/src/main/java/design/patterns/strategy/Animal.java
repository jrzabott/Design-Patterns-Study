/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.strategy;

/**
 *
 * @author drochaju
 */
public class Animal {

    private String name;
    private String favFood;
    private String sound;
    private int weight;
    private double height;
    private double speed;

    public Flys flyingType;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }

    public double getHeigth() {
        return height;
    }

    public void setHeight(double height) {
        if (weight > 0) {
            this.height = height;
        } else {
            System.out.println("Heigth must be bigger than 0");
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType){
        this.flyingType = newFlyType;
    }

}
