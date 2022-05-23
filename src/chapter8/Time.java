package chapter8;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(){
        this(0, 0, 0);
    }

    public Time(int second){
        this(0,0, second);
    }

    public Time(int minute, int second){
        this(0, minute, second);
    }

    public void setTime(int hour, int minute, int second){

        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHourWith(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinuteWith(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecondsWith(second);
        this.second = second;
    }

    private void validate(int hour, int minute, int second) {
        validateHourWith(hour);
        validateMinuteWith(minute);
        validateSecondsWith(second);
    }

    private void validateSecondsWith(int second) {
        boolean secondIsInvalid = second < 0 || second >= 60;
        if(secondIsInvalid) throw new IllegalArgumentException("Invalid seconds");
    }

    private void validateMinuteWith(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute >= 60;
        if(minuteIsInvalid) throw new IllegalArgumentException("Invalid minute");
    }

    private void validateHourWith(int hour) {
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour");

    }




    /*public double calculateTakeHomePay(double basicSalary){
        return basicSalary + calculateTransportAllowanceFrom(basicSalary)
                + calculateFeedAllowanceFrom(basicSalary) - calculateTaxFrom(basicSalary);
    }

    public double calculateTransportAllowanceFrom(double basicSalary){

        final double TEN_PERCENT = 0.1;
        return TEN_PERCENT * basicSalary;
    }

    public double calculateFeedAllowanceFrom(double basicSalary){
        final double THREE_PERCENT = 0.03;
        return THREE_PERCENT * basicSalary;

    }

     public double calculateTaxFrom(double basicSalary){
        final double TWO_PERCENT = 0.02;
        return TWO_PERCENT * basicSalary;
    }*/
}
