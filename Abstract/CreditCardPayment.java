class CreditCardPayment extends Payment {
    private static final double DISCOUNT_THRESHOLD = 500.0;
    private static final double DISCOUNT_PERCENTAGE = 0.1;
    private static final double TRANSACTION_FEE_PERCENTAGE = 0.018;

    public CreditCardPayment(double amount, long transactionId) {
        super(amount, transactionId);
    }

    @Override
    public double processPayment() {
        double discount = (amount >= DISCOUNT_THRESHOLD) ? amount * DISCOUNT_PERCENTAGE : 0.0;
        double transactionFee = (amount - discount) * TRANSACTION_FEE_PERCENTAGE;
        double finalAmount = (amount - discount) + transactionFee;

        System.out.println("Processing Credit Card Payment...");
        displayReceipt();
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Transaction Fee: $" + transactionFee);
        System.out.println("Final Payable Amount: $" + finalAmount);
        System.out.println("Credit Card Payment Successful!\n");

        return finalAmount;
    }
}