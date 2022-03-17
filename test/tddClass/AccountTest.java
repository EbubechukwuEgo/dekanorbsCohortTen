package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        //given
        Account funmiAccount = new Account();
        //when
        funmiAccount.deposit(100);
        //assert
        assertEquals(100, funmiAccount.getBalance());
    }

    @Test
    public void depositTwiceTest(){
        //given
        Account funmiAccount = new Account();
        //when
        funmiAccount.deposit(400);
        funmiAccount.deposit(500);
        //assert
        assertEquals(500+400, funmiAccount.getBalance());
    }

    @Test
    @DisplayName("Test that negative deposit will not work")
    public void negativeDepositTest(){

        Account funmiAccount = new Account();

        funmiAccount.deposit(1000);
        funmiAccount.deposit(-500);

        assertEquals(1000, funmiAccount.getBalance());
    }

    @Test
    public void withdrawTest(){

        Account funmiAccount = new Account();

        funmiAccount.withdraw(1000);
        funmiAccount.withdraw(1000);

        assertEquals(2000, funmiAccount.getBalance());
    }

    public void noWithdrawal(){

        Account funmiAccount = new Account();
    }
}
