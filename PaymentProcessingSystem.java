public class PaymentProcessingSystem {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(600.0, 12345);
        creditCardPayment.processPayment();

        Payment paypalPayment = new PayPalPayment(300.0, 67890);
        paypalPayment.processPayment();
    }
}