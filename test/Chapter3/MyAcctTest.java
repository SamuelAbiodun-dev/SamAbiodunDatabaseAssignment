//package Chapter3;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MyAcctTest {
//    @Test
//    public void depositMoney() {
//        //I have an account
//        MyAcct acct = new MyAcct();
//        //I deposit
//        acct.deposit(10000);
//        //check if my balance increases by 10000
//        int balance = acct.getBalance();
//        assertEquals(10000,balance);
//
//    }
//
//    @Test
//    public void negativeDepositShouldNotWork(){
//        //I have an account
//        MyAcct acct = new MyAcct();
//        //I have deposited 10000
//        acct.deposit(10000);
//        //check if 10000 is still there
//        assertEquals(10000, acct.getBalance());
//        //deposit -5000
//        acct.deposit(-5000);
//        //check that balance is still 10000
//        assertEquals(10000, acct.getBalance());
//    }
//    @Test
//    public void withdrawMoneyTest(){
//        //given I have an account
//        MyAcct acct = new MyAcct();
//        //given that you have money(1000)
//        acct.deposit(1000);
//        assertEquals(1000, acct.getBalance());
//        //when I withdraw 500
//        acct.withdraw(500);
//        //check if balance is 500
//        assertEquals(500, acct.getBalance());
//
//
//    }
//    @Test
//    public void withdrawingAboveBalanceFailsTest() {
//        //given I have an account
//        MyAcct acct = new MyAcct();
//        //given that you have more money(3000)
//        acct.deposit(3000);
//        assertEquals(3000, acct.getBalance());
//        //withdraw money more than balance
//        acct.withdraw(50000);
//        //check for balance
//        assertEquals(3000, acct.getBalance());
//
//    }
//}