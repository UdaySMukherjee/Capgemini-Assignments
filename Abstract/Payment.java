abstract class Payment {
    protected double amount;
    protected long transactionId;

    public Payment(double amount, long transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public abstract double processPayment();

    public void displayReceipt() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Original Amount: $" + amount);
    }
}