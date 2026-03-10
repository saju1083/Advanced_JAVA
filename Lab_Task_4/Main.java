//Main Class
class Start {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("11111111");
        sa.setAccountHolderName("OOP1");
        sa.setBalance(10000);
        sa.setInterestRate(7.5);

        FixedAccount fa = new FixedAccount();
        fa.setAccountNumber("11111112");
        fa.setAccountHolderName("OOP1");
        fa.setBalance(100000);
        fa.setTenureYear(10);

        Bank b = new Bank();
        b.setName("DBBL");
        b.setSavingsAccount(sa);
        b.setFixedAccount(fa);

        System.out.println("Bank Name: " + b.getName());
    }
}
