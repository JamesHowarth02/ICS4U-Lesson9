package employeePackage.assignment;

public class FullTimeEmployee extends Employee {
    @Override
    public double getPay() {
        double pay;
        if(hours>40) {
            pay = rate * 40 + (hours-40) * (rate*2);
        }else{
            pay = rate * hours;
        }
        totalPay = totalPay + pay;
        return pay;
    }
}
