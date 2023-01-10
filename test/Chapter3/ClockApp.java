package Chapter3;

public class ClockApp {

    int hour;
    int minute;
    int second;

    public ClockApp(int hour, int minute, int second) {
        if(hour <= 23 ) {
            this.hour = hour;
        }
        if(minute <= 59) {
            this.minute = minute;
        }
        if(second <= 59) {
            this.second = second;
        }
    }

    public void setHour (int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
    public void setMinute (int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }
    public void setSecond (int second) {
        this.second = second;
    }
    public int getSecond() {
        return second;
    }


public void time(){
    System.out.println(hour + ":" + minute + ":" + second + " AM");
    System.out.println("hh:mm:ss");
}


}

