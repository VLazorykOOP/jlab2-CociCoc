public class Bankomat {
    private int id;
    private int currentBalance;
    private int minWithdrawalAmount;
    private int maxWithdrawalAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getMinWithdrawalAmount() {
        return minWithdrawalAmount;
    }

    public void setMinWithdrawalAmount(int minWithdrawalAmount) {
        this.minWithdrawalAmount = minWithdrawalAmount;
    }

    public int getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(int maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public Bankomat(int id, int currentBalance, int minWithdrawalAmount, int maxWithdrawalAmount) {
        this.id = id;
        this.currentBalance = currentBalance;
        this.minWithdrawalAmount = minWithdrawalAmount;
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public void loadMoney(int amount) {
        this.currentBalance += amount;
        System.out.print("Amount of bills: " + this.currentBalance);
    }

    public void withdrawMoney(int amount) {
        if (amount < minWithdrawalAmount || amount > maxWithdrawalAmount || amount > currentBalance) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        this.currentBalance -= amount;
        System.out.println("Withdrawal successful");
    }

    @Override
    public String toString() {
        return "Info about Bankomat\nid: " + id + ", current Balance: " + currentBalance + ", min Withdrawal Amount: " + minWithdrawalAmount + ", max Withdrawal Amount: " + maxWithdrawalAmount;
    }
}
