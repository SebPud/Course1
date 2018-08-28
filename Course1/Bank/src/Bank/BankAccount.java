package Bank;

public class BankAccount implements Account{

    int balance;

    BankAccount(){
        this(0);
    }
    public BankAccount(int amount) {
        this.balance = amount;
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if(balance <=0){
            throw new IllegalArgumentException("Za malo pieniedzy na koncie!");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

}
