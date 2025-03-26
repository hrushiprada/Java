 // Abstract class BankAccount
abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 1000; 

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 5000; 

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Exceeds overdraft limit or invalid withdrawal amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Main class to test the functionality
 class BankTest {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(2000);
        System.out.println("Initial Savings Account Balance: " + savingsAccount.getBalance());

        savingsAccount.deposit(500);
        savingsAccount.withdraw(300);
        System.out.println("Savings Account Balance after transactions: " + savingsAccount.getBalance());

        // Create a CurrentAccount object
        CurrentAccount currentAccount = new CurrentAccount(3000);
        System.out.println("Initial Current Account Balance: " + currentAccount.getBalance());

        currentAccount.deposit(1000);
        currentAccount.withdraw(4000);
        System.out.println("Current Account Balance after transactions: " + currentAccount.getBalance());
    }
} 
    

