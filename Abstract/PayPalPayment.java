class PayPalPayment extends Payment {
    private static final double TRANSACTION_FEE_PERCENTAGE = 0.03;

    public PayPalPayment(double amount, long transactionId) {
        super(amount, transactionId);
    }

    @Override
    public double processPayment() {
        double discount = 0.0; // No discount for PayPal
        double transactionFee = amount * TRANSACTION_FEE_PERCENTAGE;
        double finalAmount = amount + transactionFee;

        System.out.println("Processing PayPal Payment...");
        displayReceipt();
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Transaction Fee: $" + transactionFee);
        System.out.println("Final Payable Amount: $" + finalAmount);
        System.out.println("PayPal Payment Successful!\n");

        return finalAmount;
    }
}