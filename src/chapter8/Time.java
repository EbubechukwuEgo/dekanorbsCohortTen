package chapter8;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
        if(minute < 0 || minute >= 60) throw new IllegalArgumentException("Invalid minute");
        if(second < 0 || second >= 60) throw new IllegalArgumentException("Invalid seconds");


        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
