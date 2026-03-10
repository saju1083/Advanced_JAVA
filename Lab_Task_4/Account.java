package advance_java;

//Account Class
class Account {

    String accountNumber;
    String accountHolderName;
    double balance;

    Account(){}

    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    String getAccountNumber(){
        return accountNumber;
    }

    String getAccountHolderName(){
        return accountHolderName;
    }

    double getBalance(){
        return balance;
    }

    void depositMoney(double amount){
        balance = balance + amount;
    }

    void withdrawMoney(double amount){
        balance = balance - amount;
    }
}
