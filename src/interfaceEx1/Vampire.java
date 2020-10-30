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
public class Vampire implements Monster {

    private String name;
    
    public Vampire(String name) {
        this.name = name;
    }
    
    @Override
    public void attack() {
        System.out.println("Vampire is biting your neck~!");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the vampire.");
    }
    // Exclusive to vampire :3
    public void changeToBat() {
        System.out.println("Vampire is now a bat!");
    }
}
