package Chapter3;

public class MyBike {
    private boolean power;
    private int setSpeed;
    private int speed;

    public void turnOn() {
        if (!power) {
            power = true;
        }
        }

    public boolean powerStatus() {
        return power;
    }
    public void turnOff() {
        if (power) {
            power = false;
        }
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        switch(speed / 10 ) {
            case 0:
            case 1:
                speed = ++speed;
                break;
            case 2:
                speed = speed + 2;
                break;
            case 3:
                speed = speed + 3;
                break;
            case 4:
                speed = speed + 4;
                break;
        }
    }
    public void decelerate() {
        if(speed > 0 ) {
            switch(speed / 10) {
                case 0:
                    speed = 0;
                    break;
                case 1:
                    speed = speed - 1;
                    break;
                case 2:
                    speed = speed - 2;
                    break;
                case 3:
                    speed = speed - 3;
                    break;
                case 4:
                    speed = speed -4;
                    break;
                default:
                    speed = speed -5;
                    break;


            }
        }
    }
}
