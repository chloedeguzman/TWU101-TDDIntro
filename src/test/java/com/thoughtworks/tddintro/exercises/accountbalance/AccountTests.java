package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
        account.deposit(5);
        assertEquals(5, account.balance);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        assertEquals(5, account.balance);
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account();
        account.withdraw(5);
        assertEquals(0, account.balance);
    }
}
