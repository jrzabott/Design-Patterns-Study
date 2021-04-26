/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.prototype;

/**
 *
 * @author drochaju
 */
public class TestCloning {
    public static void main(String[] args) {
        CloneFactory cf = new CloneFactory();
        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) cf.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally Hashcode: " + System.identityHashCode(sally));
        System.out.println("clonedSheep Hashcode: " + System.identityHashCode(clonedSheep));
    }
}
