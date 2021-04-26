/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.observer;

import java.util.ArrayList;

/**
 *
 * @author drochaju
 */
public class StockGrabber implements Subject{

    private double aaplPrice;
    private double googPrice;
    private double ibmPrice;
    ArrayList<Observer> observers;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    public double getAaplPrice() {
        return aaplPrice;
    }
    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public double getGoogPrice() {
        return googPrice;
    }
    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }

    public double getIbmPrice() {
        return ibmPrice;
    }
    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }



    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }


    @Override
    public void unregister(Observer o) {
        int oIndex = observers.indexOf(o);
        System.out.println("Observer " + oIndex + " deleted");

        observers.remove(oIndex);
    }



}
