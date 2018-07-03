package abstractclass;

interface Bank{
    abstract public void withdraw(int a);
    abstract public void deposit(int b);
}
class Account{
    public void bank(){
        System.out.println(" NAME OF BANK : SBI ");
        System.out.println(" BRANCH : KS layout");
    }
}
class SavingsAccount extends Account implements Bank{
    double amount = 5000;
    double balance;
    public void withdraw(int w_amount){
        balance = amount - w_amount;
        System.out.println("balance = "+ balance);
    }
    public void deposit(int d_amount){
        balance = amount - d_amount;
        System.out.println("balance = "+ balance);
    }
}
public class Mainclass1 {
    public static void main(String[] args) {
        SavingsAccount s1= new SavingsAccount();
        s1.bank();
        s1.deposit(10);
        s1.withdraw(500);
    }
}
