package design.patterns.adapter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author drochaju
 */
public interface EnemyAttacker {

    void fireWeapon();

    void driveForward();

    void assignDriver(String driverName);
}
