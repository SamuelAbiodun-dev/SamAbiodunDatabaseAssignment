package Chapter3;

public class CarApp {

//Declare the instance variable of the Car's model, year and price
    private String model;
    private String year;
    private double price;

    //Create a constructor to enhance the initialization of the car's attributes
    //The condition are also meant to be written
    public CarApp(String model, String year, double price){
        this.model = model;
        this.year = year;
        if (price > 0.0) {
            this.price = price;
        }
        }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }
    public void setPrice(double price) {
       if (price > 0.0) {
           this.price = price;
       }
        }

    public double getPrice() {
        return price;
    }
    public void setDiscount(double discount) {
        price = price-(discount / 100 * price);
    }
}

