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
public class Werewolf implements Monster {

    private String name;
    
    public Werewolf(String name) {
        this.name = name;
    }
    
    @Override
    public void attack() {
        System.out.println("Werewolf is clawing up your back!");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the vampire.");
    }
}
