package Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBikeTest {

    @Test
    public void onTheBike() {
        //I have a bike
        MyBike bike = new MyBike();
        //when I turn on the bike
        bike.turnOn();
        //It is on
        assertTrue(bike.powerStatus());
    }

    @Test
    public void offTheBike() {
        //I have bike
        MyBike bike = new MyBike();
        //when I turn on the bike
        bike.turnOn();
        //It is on
        assertTrue(bike.powerStatus());
        //when I turn the bike off
        bike.turnOff();
        //It is off
        assertFalse(bike.powerStatus());
    }

    @Test
    public void initialSpeed() {
        //I have a bike
        MyBike bike = new MyBike();
        //My bike is on
        bike.turnOn();
        //My bike has an initial speed
        bike.setSpeed(15);
        assertEquals(15, bike.getSpeed());
    }

    @Test
    public void initialSpeedCannotBeBelowZero() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(-15);
        assertEquals(0, bike.getSpeed());

    }

    @Test
    public void accelerateOnGear1() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(15);
        //initial acceleration
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
        bike.accelerate();
        assertEquals(17, bike.getSpeed());
    }

    @Test
    public void accelerateOnGear2() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(20);
        bike.accelerate();
        assertEquals(22, bike.getSpeed());
    }

    @Test
    public void accelerateOnGear3() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(35);
        bike.accelerate();
        assertEquals(38, bike.getSpeed());
    }

    @Test
    public void accelerateOnGear4() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(44);
        bike.accelerate();
        assertEquals(48, bike.getSpeed());
    }

    @Test
    public void cannotDecelerateLowerThanZero() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(0);
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void decelerateFromGear1() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(18);

        bike.decelerate();
        assertEquals(17, bike.getSpeed());

        bike.decelerate();
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void decelerateFromGear2To1() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(21);

        bike.decelerate();
        assertEquals(19, bike.getSpeed());

        bike.decelerate();
        assertEquals(18, bike.getSpeed());

    }

    @Test
    public void decelerateFromGear4To3() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(42);

        bike.decelerate();
        assertEquals(38, bike.getSpeed());

        bike.decelerate();
        assertEquals(35, bike.getSpeed());

    }

    @Test
    public void decelerateFromGear2() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(25);

        bike.decelerate();
        assertEquals(23, bike.getSpeed());

        bike.decelerate();
        assertEquals(21, bike.getSpeed());
    }

    @Test
    public void decelerateFromGear3() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(35);

        bike.decelerate();
        assertEquals(32, bike.getSpeed());

        bike.decelerate();
        assertEquals(29, bike.getSpeed());
    }

    @Test
    public void decelerateFromGear4() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(35);

        bike.decelerate();
        assertEquals(32, bike.getSpeed());

        bike.decelerate();
        assertEquals(29, bike.getSpeed());
    }

    @Test
    public void automaticGearSwitchFrom1To2() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(19);
        bike.accelerate();
        assertEquals(20, bike.getSpeed());
        bike.accelerate();
        assertEquals(22, bike.getSpeed());

    }

    @Test
    public void automaticGearSwitchFrom2To3() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(28);
        bike.accelerate();
        assertEquals(30, bike.getSpeed());
        bike.accelerate();
        assertEquals(33, bike.getSpeed());
    }
    @Test
    public void automaticGearSwitchFrom3To4() {
        MyBike bike = new MyBike();
        bike.turnOn();
        bike.setSpeed(36);
        bike.accelerate();
        assertEquals(39, bike.getSpeed());
        bike.accelerate();
        assertEquals(42, bike.getSpeed());
    }

}
