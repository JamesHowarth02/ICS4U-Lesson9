/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeePackage.assignment;

/**
 *
 * @author jame1850
 */
public class FTEmployee extends Employee {

    public PTEmployee() {
        super();
    }
    
    @Override
    public double getPay() {
        totalPay += rate * hours;
    }
    
}
