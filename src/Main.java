import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input id: ");
        int id = scan.nextInt();
        System.out.print("Input current Balance: ");
        int currentBalance = scan.nextInt();
        System.out.print("Input min Withdrawal Amount: ");
        int minWithdrawalAmount = scan.nextInt();
        System.out.print("Input max Withdrawal Amount: ");
        int maxWithdrawalAmount = scan.nextInt();

        Bankomat bankomat = new Bankomat(id, currentBalance, minWithdrawalAmount, maxWithdrawalAmount);
        System.out.println(bankomat);
        System.out.print("Input amount of bills:");
        int bills = scan.nextInt();
        bankomat.loadMoney(bills);

        System.out.println("\nHow much money do you want Withdraw?");
        int withdrawMoney = scan.nextInt();
        bankomat.withdrawMoney(withdrawMoney);
    }
}
