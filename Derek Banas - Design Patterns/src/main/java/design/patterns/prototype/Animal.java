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
public interface Animal extends Cloneable{
    Animal makeCopy();
}
