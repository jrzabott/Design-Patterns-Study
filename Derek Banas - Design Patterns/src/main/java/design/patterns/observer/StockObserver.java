/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.observer;

/**
 *
 * @author drochaju
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject StockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.StockGrabber = StockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer: " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.printf("ID: %d%nIBM: %.2f%nAAPL: %.2f%nGOOG: %.2f%n%n",
                observerID, ibmPrice, aaplPrice, googPrice);

    }

}
