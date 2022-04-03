package tddClass;

public class Kata {

    private int katai;


    public boolean isPalindrome(int number) {
        return true;
    }


    public boolean isEven(int number) {
        if (number % 2 == 0) return true;
        return false;
    }

    public int maxInt(int number1, int number2, int number3, int number4, int number5) {
        int a = number1;
        int b = number2;
        int c = number3;
        int d = number4;
        int e = number5;
        if(a>b && a>c && a>d && a>e) return a;
        if(b>a && b>c && b>d && b>e) return b;
        if(c>a && c>b && c>d && c>e) return c;
        if(d>a && d>b && d>c && d>e) return d;
        if(e>a && e>b && e>c && e>d) return e;
        return 0;
    }


    public int factorsInt(int number) {
        int count = 0;
        for(int i = 1; i<=number; i++){
            if(number % i == 0) {
                count++;
            }

        }
        System.out.println(count);
        return  count;
    }

    public boolean isPrimeNumber(int number) {
       // int count = 0;
       // for(int j = 1; j <= number ; j++) {

         //   if (number % j == 0) count++;
       // }
        //if(count <=2){
         //   return true;
       // } else {
        //    return false;
       // }

        int numberOfFactors = factorsInt(number);
        if(factorsInt(number) <=2) return true;
        return false;
    }
}
