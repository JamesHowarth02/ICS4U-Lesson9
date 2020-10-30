package employeePackage.assignment;

public class PartTimeEmployee extends Employee {

    @Override
    double getPay() {
        double pay = hours * rate;
        totalPay = totalPay + pay;
        return pay;
    }
    
}
