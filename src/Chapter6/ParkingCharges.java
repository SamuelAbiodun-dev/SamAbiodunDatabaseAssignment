package Chapter6;

public class ParkingCharges {
    private final double minimumGarageCharges = 2.00;
    private final double maximumGarageCharges = 10.00;
    private double excessCharges = 0.50;
    private double customerMainCharges;
    private double discount;
    private int hour;
    private String customerName;
    public ParkingCharges(String name, int hour){
        this.hour = hour;
        this.customerName = name;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }

    public double getMinimumGarageCharges() {
        return minimumGarageCharges;
    }

    public double getMaximumGarageCharges() {
        return maximumGarageCharges;
    }


    public double chargesWithinTheHourRangeOfThree(){

        if(hour <= 3) {
            customerMainCharges = minimumGarageCharges;
            System.out.printf("%s, the charge after %d hour(s) is: $%.2f", customerName, hour, customerMainCharges);
        }
        return customerMainCharges;
    }
    public double incrementAfter3Hours() {
        if(hour == 24){
            customerMainCharges = maximumGarageCharges;
            System.out.printf("%s, the charge after %d hours is: $%.2f%n", customerName, hour, customerMainCharges);
        }
        if(hour == 4){
            customerMainCharges = minimumGarageCharges + excessCharges;
            System.out.printf("%s, the charge after %d hours is: $%.2f", customerName, hour, customerMainCharges);
        }
        return customerMainCharges;
    }
    public double twenty_fourHoursParkingDiscount(){
        if(hour == 24) {
            discount = (minimumGarageCharges + (excessCharges * (hour - 3))) - maximumGarageCharges;
            System.out.printf("%s, the discount of the charges of parking up to %d hours is: $%.2f", customerName, hour, discount);
        }
        return discount;
    }
}
