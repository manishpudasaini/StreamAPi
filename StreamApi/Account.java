package StreamApi;

public class Account {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private float balance;

    public Account(String accountHolderName, String accountNumber, String accountType, float balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }



    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public float getBalance() {
        return balance;
    }
}
