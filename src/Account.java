import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[2];
        bankAccounts[0] = new BankAccount();
        bankAccounts[1] = new BankAccount(2, 500000, 3.5);
        System.out.println("------Menu------");
        System.out.println("1.Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        if (choose == 1) {
            System.out.println("Balance: "+ bankAccounts[1].getBalance());
        } else if (choose == 2) {
            System.out.println("How much money you want withdraw: ");
            int withdraw = scanner.nextInt();
            bankAccounts[1].setBalance(bankAccounts[1].getBalance()- withdraw);
            System.out.println("Balance: "+ bankAccounts[1].getBalance());
        } else if (choose == 3) {
            System.out.println("How much money you want deposit: ");
            int deposit = scanner.nextInt();
            bankAccounts[1].setBalance(bankAccounts[1].getBalance() + deposit);
            System.out.println("Balance: " + bankAccounts[1].getBalance());
        } else {
            System.exit(0);
        }

    }

}

