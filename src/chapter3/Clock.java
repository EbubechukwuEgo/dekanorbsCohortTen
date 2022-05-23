package chapter3;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        if(hour > 23) this.hour = 0;
        if(minute > 59) this.minute = 0;
        if(second > 59) this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if(hour > 23) ;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void displayTime(){
        System.out.println("");
    }
}
