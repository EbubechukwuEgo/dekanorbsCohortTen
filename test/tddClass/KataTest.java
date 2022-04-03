package tddClass;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void palindromeTest(){

        Kata kata= new Kata();
        boolean palindrome = kata.isPalindrome(12621);
        assertEquals(true, palindrome);

    }

    @Test
    public void evenTest(){
        Kata kata = new Kata();
        boolean even = kata.isEven(1002);
        assertEquals(true, even);
    }

    @Test
    public void bigInt(){
        Kata kata = new Kata();
        int max = kata.maxInt(67, 56, 450, 23, 21);
        assertEquals(450, max);
    }

    @Test
    public void factorsOf(){
        Kata kata = new Kata();
        int factors = kata.factorsInt(99);
        assertEquals(6, factors);

    }

    @Test
    public void primeNumber(){
        Kata kata = new Kata();
        boolean primeNumbers = kata.isPrimeNumber(1);
        assertEquals(true, primeNumbers);

    }
}
