public class Account {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println("Id: " + b.getId());
        System.out.println("Balance: " + b.getBalance());
        System.out.println("AnnualInteretRate: "+ b.getAnnualInterestRate());
    }

}

 class BankAccount {
     private int id;
     private double balance;
     private double annualInterestRate;

     public BankAccount() {
         id = 1;
         balance = 20000;
         annualInterestRate = 4.5;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     public double getAnnualInterestRate() {
         return annualInterestRate;
     }

     public void setAnnualInterestRate(double annualInterestRate) {
         this.annualInterestRate = annualInterestRate;
     }

     public double withdraw(double moneyWithDraw) {
         double money = getBalance() - moneyWithDraw;
         return money;
     }

     public double deposit(double moneyDeposit) {
         double money = getBalance() +moneyDeposit;
         return money;
     }


}
