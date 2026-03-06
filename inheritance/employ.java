package inheritance;

class BankAccount {
    int accNo;
    String holderName;
    double balance;

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void displaySavings() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    void displayCurrent() {
        System.out.println("Account Type: Current Account");
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

class LoanAccount extends BankAccount {
    String loanType;

    void displayLoan() {
        System.out.println("Account Type: Loan Account");
        System.out.println("Loan Type: " + loanType);
    }
}

public class employ {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount();
        s1.accNo = 1001;
        s1.holderName = "DEEPAK";
        s1.balance = 50000;
        s1.interestRate = 6.5;

        s1.displaySavings();
        s1.display();

        System.out.println();

        CurrentAccount c1 = new CurrentAccount();
        c1.accNo = 1002;
        c1.holderName = "NIKHIL";
        c1.balance = 70000;
        c1.overdraftLimit = 20000;

        c1.displayCurrent();
        c1.display();

        System.out.println();

        LoanAccount l1 = new LoanAccount();
        l1.accNo = 1003;
        l1.holderName = "GANESH";
        l1.balance = 100000;
        l1.loanType = "Home Loan";

        l1.displayLoan();
        l1.display();
    }
}