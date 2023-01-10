package Interfaces;

import java.io.Serializable;

public class TokunboCar extends Car implements Serializable {
@Override
    public void accelerate(){
    System.out.println("I be tokunbo o, no much money");
}
}
