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
}
