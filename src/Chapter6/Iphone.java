package Chapter6;

public class Iphone {
private  String color;
private static double price;

    public Iphone(String color, double price) {

        this.color = color;
        Iphone.price = price;
    }

    public static double getPrice() {

        return price;
    }

    public static void setPrice(double price) {

        Iphone.price = price;
    }

    public void setColor(String color){

        this.color = color;
        }


    public String getColor() {

        return color;
    }
}

