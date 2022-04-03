package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    @Test
    public void accountCanBeCreated(){
        Account account = new Account("2334", "Florence", "Funmi", "1232");
        assertNotNull(account);}

    @Test
    public void accountCanBeCreatedWithAllDetailsTest(){
        Account account = new Account("2334", "Florence", "Funmi", "1232");
        assertEquals("1212", account.getACCOUNT_NUMBERUMBER());
        assertEquals("Florence Funmi", account.getAccountName());
    }

    @Test
    public void accountDepositTest(){
        Account account = new Account("2334", "Florence", "Funmi", "1232");
        account.deposit(500);
       assertEquals(500, account.getBalance("1172"));

    }


}
