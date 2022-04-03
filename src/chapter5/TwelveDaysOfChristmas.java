package chapter5;

public class TwelveDaysOfChristmas {
    public static void main(String[] args){
        int days = 1;
        while(days < 12){
            days++;
            System.out.print("On the "+ days);
            switch (days){
                case 1:
                    System.out.print("st");
                    break;
                case 2:
                    System.out.print("nd");
                    break;
                case 3:
                    System.out.print("rd");
                    break;
                default:
                    System.out.print("th");
            }

                System.out.print(" day of Christmas. My true love gave to me. ");

                switch(days){
                    case 1:
                        System.out.println("A partridge in a pear tree.");
                        break;
                    case 2:
                        System.out.println("Two turtle doves, and a partridge in a pear tree.");
                        break;
                    case 3:
                        System.out.println("Three french hens, two turtle doves, and a partridge in a pear tree.");
                        break;
                    case 4:
                        System.out.println("Four calling birds, three french hens, two turtle doves, " +
                                "and a partridge in a pear tree.");
                        break;
                    case 5:
                        System.out.println("Five gold rings, four calling birds, three french hens, " +
                                "\ntwo turtle doves, and a partridge in a pear tree.");
                        break;
                    case 6:
                        System.out.println("Six geese are laying, five golden rings, four calling birds, " +
                                "\nthree french hens, two turtle doves, and a partridge in a pear tree.");
                        break;
                    case 7:
                        System.out.println("Seven swans are swimming, six geese are laying, five golden rings, " +
                                "\nfour calling birds, three french hens, two turtle doves, and a partridge in a pear tree.");
                        break;
                    case 8:
                        System.out.println("Eight maids are milking, seven swans are swimming, six geese are laying, " +
                                "\nfive golden rings, four calling birds, three french hens, two turtle doves, " +
                                "\nand a partridge in a pear tree.");
                        break;
                    case 9:
                        System.out.println("Nine ladies dancing, eight maids are milking, seven swans are swimming, " +
                                "\nsix geese are laying, five golden rings, four calling birds, three french hens, " +
                                "\ntwo turtle doves, and a partridge in a pear tree.");
                        break;
                    case 10:
                        System.out.println("Ten lords are leaping, nine ladies dancing, eight maids are milking, " +
                                "\nseven swans are swimming, six geese are laying, five golden rings, four calling birds, " +
                                "\nthree french hens, two turtle doves, and a partridge in a pear tree.");
                        break;
                    case 11:
                        System.out.println("Eleven pipers piping, ten lords are leaping, nine ladies dancing, " +
                                "\neight maids are milking, seven swans are swimming, six geese are laying, five golden rings, " +
                                "\nfour calling birds, three french hens, two turtle doves, and a partridge in a pear tree.");
                        break;
                    case 12:
                        System.out.println("Twelve drummers drumming, eleven pipers piping, ten lords are leaping, " +
                                "\nnine ladies dancing, eight maids are milking, seven swans are swimming, six geese are laying, " +
                                "\nfive golden rings, four calling birds, three french hens, two turtle doves, " +
                                "\nand a partridge in a pear tree.");

                }
                System.out.println();

        }
    }
}
