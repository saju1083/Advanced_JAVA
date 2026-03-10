//Bank Class
class Bank {

    String name;
    SavingsAccount sa;
    FixedAccount fa;

    void setName(String name){
        this.name = name;
    }

    void setSavingsAccount(SavingsAccount sa){
        this.sa = sa;
    }

    void setFixedAccount(FixedAccount fa){
        this.fa = fa;
    }

    String getName(){
        return name;
    }

    SavingsAccount getSavingsAccount(){
        return sa;
    }

    FixedAccount getFixedAccount(){
        return fa;
    }
}
