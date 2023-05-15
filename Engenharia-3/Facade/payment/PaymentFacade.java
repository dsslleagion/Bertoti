package payment;

//Classe de fachada (Facade)
public class PaymentFacade {
 private PaymentProcessor paymentProcessor;
 private Authentication authentication;
 
 public PaymentFacade() {
     paymentProcessor = new PaymentProcessor();
     authentication = new Authentication();
 }
 
 public void processPayment(double amount, String accountNumber, String password) {
     if (authentication.authenticate(accountNumber, password)) {
         paymentProcessor.processPayment(amount);
     } else {
         System.out.println("Falha na autenticação. Pagamento não processado.");
     }
 }
 
 public void cancelPayment(String transactionId, String accountNumber, String password) {
     if (authentication.authenticate(accountNumber, password)) {
         paymentProcessor.cancelPayment(transactionId);
     } else {
         System.out.println("Falha na autenticação. Cancelamento de pagamento não realizado.");
     }
 }
 
 public String getPaymentStatus(String transactionId, String accountNumber, String password) {
     if (authentication.authenticate(accountNumber, password)) {
         return paymentProcessor.getPaymentStatus(transactionId);
     } else {
         System.out.println("Falha na autenticação. Não é possível obter o status do pagamento.");
         return null;
     }
 }
}

