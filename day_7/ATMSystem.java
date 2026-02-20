
class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {

        if (amount % 100 != 0) {
            throw new InvalidAmountException("Amount must be in multiples of 100.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance.");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

public class ATMSystem {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 1000);

        try {
            account.withdraw(500);
            account.withdraw(250);
            account.withdraw(600);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
