package Chapter6;



class IphoneTest {
    public static void main (String[] args) {
        Iphone iphone = new Iphone("black", 250.00);

        Iphone.setPrice(250);


        System.out.printf("%s%n", iphone.getColor());
        System.out.printf("%.2f", Iphone.getPrice());
    }

}


