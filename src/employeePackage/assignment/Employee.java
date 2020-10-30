package employeePackage.assignment;

public abstract class Employee {

    protected String name;
    protected double rate;
    protected int hours;
    
    protected static double totalPay = 0;
    public static double LOW_RATE = 6.75;
    public static double HIGH_RATE = 30.50;
    public static double LOW_HOURS = 1;
    public static double HIGH_HOURS = 60;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
    }

    public static String getNameRules() {
        return "nonblank";
    }

    public static String getTypeRules() {
        return "1 or 2";
    }

    public static String getRateRules() {
        return "between 6.75 and 30.50, inclusive";
    }

    public static String getHoursRules() {
        return "between 1 and 60, inclusive";
    }
    
    public double getTotalPay() {
        return totalPay;
    }

    public boolean setName(String nm) {
        if (nm.equals("")) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }

    public boolean setRate(double rt) {
        if (rt < LOW_RATE || rt > HIGH_RATE) {
            return false;
        } else {
            rate = rt;
            return true;
        }
    }

    public boolean setHours(int hrs) {
        if (hrs < LOW_HOURS || hrs > HIGH_HOURS) {
            return false;
        } else {
            hours = hrs;
            return true;
        }
    }

    public String getName() {
        return name;
    }

    abstract double getPay();
}
