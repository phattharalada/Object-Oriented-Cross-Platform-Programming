import javax.swing.*;

class Account {

/// ทำเพิ่มเติมเพื่อเก็บข้อมูล

    private double balance;

    public Account(double initialBalance) {

        if (initialBalance > 0.0) balance=initialBalance;

    }

    public void deposit(double amount){ /// การเพิ่มเงินเข้าบัญชี

        if (amount > 0) balance=balance+amount;

    }

    public void withdraw(double amount){ /// การถอนเงินออกบัญชี

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
        else JOptionPane.showMessageDialog(null,"ยอดเงินของท่านไม่พอ", "ผิดพลาด", JOptionPane.ERROR_MESSAGE);

    }

    public double getBalance(){ /// ดูยอดเงินในบัญชี

        return balance;

    }}

public class AccountTest {

    public static void main (String [] arcs) {

        Account me = new Account(100); //เงิน 100

        me.deposit(-300); // เงิน 100+300 = 400

        System.out.println(me.getBalance());

        me.withdraw(300); // เกินวงเงิน เงิน = 400

        System.out.println(me.getBalance());    }

}