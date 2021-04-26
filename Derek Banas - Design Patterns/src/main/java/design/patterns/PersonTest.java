/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns;

/**
 *
 * @author drochaju
 */
public class PersonTest {
    public static void main(String[] args) {
        Person myPerson = new Person("My Name");

        System.out.println(myPerson.getName());
        System.out.println(System.identityHashCode(myPerson));
        System.out.println(myPerson.hashCode());

    }

}
