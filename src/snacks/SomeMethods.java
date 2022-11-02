package snacks;

public class SomeMethods {
    public static void main(String[] args) {
        int days = 30;
        int months = 12;
        int daysOfTheYear = months * days;

        convertIntoYear(daysOfTheYear);
    }

    private static void convertIntoYear(int daysOfTheYear) {
        if (daysOfTheYear == 365){
            System.out.println("1 year");
        } else if (daysOfTheYear == 366) {
            System.out.println("1 year and 1 day");
        } else if (daysOfTheYear == 30 || daysOfTheYear == 31) {
            System.out.println("1 month");
        } else {
            System.out.println("Just 5 days short of a full year");
        }
    }
}
