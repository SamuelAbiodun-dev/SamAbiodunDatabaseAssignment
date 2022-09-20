package Chapter3;

import java.time.LocalDate;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private String monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, String monthOfBirth, int dayOfBirth, int yearOfBirth, double height,
                         double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String theFirstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String theFirstName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMonthOfBirth() {
        this.monthOfBirth = monthOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth() {
        this.dayOfBirth = dayOfBirth;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;

        }
    public void setWeight(double weight) {
        this.weight = weight;
    }
        public double getWeight () {
            return weight;
        }

        public int getDayOfBirth () {
            return dayOfBirth;
        }

        public void setYearOfBirth(){
        this.yearOfBirth = yearOfBirth;
        }
        public int getYearOfBirth () {
            return yearOfBirth;
        }

        public int getAge () {
            return LocalDate.now().getYear() - yearOfBirth;
        }
        public double getMaxHeartRate () {
            return 220 - getAge();
        }
        public double getTargetHeartRate () {
            return getMaxHeartRate() * 0.85;
        }
        public double getBMI () {
            return (getWeight() * 703) / (getHeight() * getHeight());
        }



}








