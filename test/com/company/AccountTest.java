package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testAccountCreate_zeroAccount(){
        //Arrange
        Account account = new Account(1234, "Bent Bente");
        //Act
        int expecteed = 0;
        //Assert
        assertEquals(expecteed, account.getAccountMoney());
    }

    @Test
    public void testAccountCreate_accountWithMoney(){
        //Arrange
        Account account = new Account(1234, "Bent Bente", 10);
        //Act
        int excpected = 10;
        //Assert
        assertEquals(excpected, account.getAccountMoney());
    }

   @Test
    public void testInsertMoney_accountWithZeroMoney(){
        //Arrange
        Account account = new Account(1234, "Bent Bente");
        //Act and
       int expected = 30;
       int actual = account.insertMoney(30);
       //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertMoney_accountWithMoney(){
        //Arrange
        Account account = new Account(1234, "Bent Bente", 10);
        //Act and
        int expected = 40;
        int actual = account.insertMoney(30);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWithdrawMoney_isPossible(){
        //Arrange
        Account account = new Account(1234, "Bent Bente", 50);
        //Act and
        int expected = 27;
        int actual = account.withdrawMoney(23);
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testWithdrawMoney_isNotPossible(){
        //Arrange
        Account account = new Account(1234, "Bent Bente", 50);
        //Act and
        int expected = -1;
        int actual = account.withdrawMoney(60);
        //Assert
        assertEquals(expected, actual);

    }



}