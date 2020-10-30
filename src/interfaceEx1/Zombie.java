/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEx1;

/**
 *
 * @author jame1850
 */
public class Zombie implements Monster {

    public String name;
    
    public Zombie(String name) {
        this.name = name;
    }
    
    @Override
    public void attack() {
        System.out.println("Zombie is eating your brains!");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the Zombie.");
    }
    
}
