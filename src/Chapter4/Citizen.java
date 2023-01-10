package Chapter4;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String surName;
    private BigDecimal earnings;

    public Citizen(){}
    public Citizen(String firstName, String lastName){
        this.firstName = firstName;
        surName = lastName;
    }
    public Citizen(String firstName, String lastName, BigDecimal amount){
        this.firstName = firstName;
        surName = lastName;
        earnings = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }
}

