package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {

    private Bank firstBank;

    @BeforeEach
    public void setup(){
        firstBank = new Bank("FirstBank", 10);
    }

    @Test
    public void bankCreateTest(){
        assertNotNull(firstBank);
        assertEquals("FirstBank", firstBank.getName());
        assertEquals(10, firstBank.getMaxNoOfCustomers());
    }

    @Test
    public void bankCreateAccountTest(){
        firstBank.register("Saheed", "Osupa", "1234");
        assertEquals(1, firstBank.getNoOfCustomers());
    }

    @Test
    public void checkAccountCreatedForCustomerTest(){
        firstBank.register("Saheed", "Osupa", "1234");
        assertEquals(1, firstBank.getNoOfCustomers());

        Account account = firstBank.findAccount(1);
        assertEquals("Saheed Osupa", account.getAccountName());
        assertEquals(1, account.getAccountNo());

    }

    @Test
    public void bankDepositTest(){
        firstBank.register("Saheed", "Osupa", "1234");
        firstBank.deposit(1200, "1");
        firstBank.deposit(1800, "1");

        Account account = firstBank.findAccount(1);
        assertEquals(3000, account.getBalance("1234"));
    }

    @Test
    public void bankWithDrawTest(){
        firstBank.register("Saheed", "Osupa", "1234");
        firstBank.deposit(1200, "1");
        firstBank.withdraw(1000, "1", "1234");

        Account account = firstBank.findAccount(1);
        assertEquals(200, account.getBalance("1234"));
    }

    @Test
    public void bankTransferTest(){
        firstBank.register("Saheed", "Osupa", "1221");
        firstBank.register("Amaka", "Amazing", "1234");
        firstBank.deposit(12_000, "1");

        Account account = firstBank.findAccount(1);
        assertEquals(12_000, account.getBalance("1221"));

        firstBank.transfer(200, "1", "2", "1221");

        account = firstBank.findAccount(1);
        assertEquals(11_800, account.getBalance("1221"));
        account = firstBank.findAccount(2);
        assertEquals(200, account.getBalance("1234"));
    }
}
