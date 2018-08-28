package Bank;

public class Bank implements BankTransfer {

    public final int FEE = 1;

    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        if (from.balance <= amount + FEE) {
            throw new IllegalArgumentException("Za mało pieniedzy");
        }
        from.withdraw(amount + FEE);
        to.deposit(amount);
    }


    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount account1 = bank.openAccount();
        BankAccount account2 = bank.openAccount();

        account1.deposit(100);
        account2.deposit(50);

        bank.transfer(account1,account2,50);
        System.out.println(account1.balance);
        System.out.println(account2.balance);
        bank.transfer(account2,account1,20);
        System.out.println(account1.balance);
        System.out.println(account2.balance);
    }

    public BankAccount openAccount() {
        return new BankAccount();
    }
}

