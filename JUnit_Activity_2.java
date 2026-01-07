public class BankAccount {

    private Integer currentBalance;

    public BankAccount(Integer openingBalance) {
        this.currentBalance = openingBalance;
    }

    public Integer withdraw(Integer withdrawAmount) {
        if (withdrawAmount > currentBalance) {
            throw new NotEnoughFundsException(withdrawAmount, currentBalance);
        }
        currentBalance = currentBalance - withdrawAmount;
        return currentBalance;
    }
}
