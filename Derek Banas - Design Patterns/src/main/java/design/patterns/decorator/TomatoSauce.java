/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.decorator;

/**
 *
 * @author drochaju
 */
public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce");

    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.35d;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

}
